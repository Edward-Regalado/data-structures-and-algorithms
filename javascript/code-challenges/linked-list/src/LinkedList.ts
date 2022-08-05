import { Collection, display } from "./Collection";
import { Node } from "./Node";

export class LinkedList<T> {

  head: Node<T> | undefined;
  tail: Node<T> | undefined;

  insert(value: T): void {

    let current = this.head;
    let newNode = new Node(value);

    if(this.head === undefined && this.tail === undefined) {
      this.head = newNode;
      this.tail = newNode;
    } else {
      this.head = newNode;
      newNode.next = current;
    };
  };

  includes(value: T): boolean {

    let current = this.head;

    while (current != undefined){
      if(current.data === value){
        return true;
      };
      current = current.next;
    };
    return false;
  };

  toString(): string {

    let current = this.head;
    let str = '';

    while (current != undefined){
      str += `{ ${display(current.data)} } -> `;
      current = current.next;
    };
    str += "NULL";
    return str;
  };

  append(value: T): void {
    let tail = this.tail;
    if(tail != undefined){
      let newNode = {
            data: value,
            next: undefined
      };
      tail.next = newNode;
      this.tail = newNode;
    } else{
        this.insert(value);
      };
  };

  insertBefore(target: T, value: T): void {

    let current = this.head;
    let newNode = new Node(value);

    // edge case
    if(current === undefined){
      throw new Error("The linked list is empty");
    };
    if(current.data === target){
      this.insert(value);
      return;
    };

    while (current.next != undefined){
      if(current.next.data === target){
        newNode.next = current.next;
        current.next = newNode;
        break;
      } else {
        current = current.next;
      };
    };
    if(current.next === undefined){
      throw new Error("The target value not in the linked list");
    };
  };

  insertAfter(target: T, value: T, ): void {

    let current = this.head;
    let newNode = new Node(value);

    // edge case
    if(current === undefined){
      throw new Error("The linked list is empty");
    };
    while(current != undefined){
      if(current.data === target){
        newNode.next = current.next;
        current.next = newNode;
        break;
      } else {
        current = current.next;
      };
    };
    if(current === undefined){
      throw new Error("The target value is not in the linked list");
    };
  };

  kthFromEnd(target: number): any {

    let size = this.size();
    let current = this.head;

    // edge cases out of range or negative k value
    if (target > size || target < 0) {
      throw new Error("error");
    };

    while(target <= size){
      let len = size - target;
      for(let i = 0; i < len; i++) {
          current = current?.next;
      }
      return current?.data;
    };
  };

  static zipList(ll1: LinkedList<any>, ll2: LinkedList<any>): LinkedList<any>{

    // creating head reference for both lists
    let curr1 = ll1.head;
    let curr2 = ll2.head;

    // checks if both lists are empty, throws exception
    if(curr1 === undefined && curr2 === undefined) {
      throw new Error("both linked lists are empty");
    };

    // checks if either of the lists are empty, returns the other list
    if(curr1 === undefined){
      return ll2;
    } else if (curr2 == undefined) {
      return ll1;
    };

    // instantiate a new linked list to be return(zipped)
    const zipped = new LinkedList<any>();

    // run the while loop, append, move down our list until one of our lists becomes undefined (end of the list)
    while(curr1 != undefined && curr2 != undefined) {
      zipped.append(curr1.data);
      zipped.append(curr2.data);
      curr1 = curr1.next;
      curr2 = curr2.next;
    }
    // continue appending nodes from either ll1 or ll2 to the zipped list (whichever one is not undefined)
    if(curr1 != undefined){
      while(curr1 != null){
        zipped.append(curr1.data);
        curr1 = curr1.next;
      }
    } else if (curr2 != undefined) {
        while(curr2 != undefined) {
          zipped.append(curr2.data);
          curr2 = curr2.next;
        }
    }
    return zipped;
  };

  size(): number {
    let counter = 0;
    let current = this.head;
    while(current != undefined) {
      counter++;
      current = current.next;
    }
    return counter;
  }
};
