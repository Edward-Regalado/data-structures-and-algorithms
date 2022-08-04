import { Collection, display } from "./Collection";

interface Node<T> {
  data: T,
  next: Node<T> | undefined;
}

export class LinkedList<T> implements Collection<T> {

  head: Node<T> | undefined;
  tail: Node<T> | undefined;
  // size: number;


  insert(value: T): void {
    let current = this.head;
    let newNode: Node<T> = {
      data: value,
      next: this.head,
    };
    newNode.next = current;
    this.head = newNode;
    if(this.tail === undefined) {
        this.tail = current;
    }
  }

  includes(value: T): boolean {
    let current = this.head;
    while (current != undefined){
      if(current.data === value){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  toString(): string {
    let current = this.head;
    let str = '';
    while (current != undefined){
      str += `{ ${display(current.data)} } -> `;
      current = current.next;
    };
    str += "NULL";
    return str;
  }

  append(value: T): void {
    let tail = this.tail;
    if(tail != undefined){
      let newNode = {
            data: value,
            next: undefined
      };
      tail.next = newNode;
      this.tail = newNode;
    }
      else{
        this.insert(value);
      }
  };

  insertBefore(target: T, value: T): void {
    let current = this.head;
    // let size = this.size();
    let newNode: Node<T> = {
      data: value,
      next: this.head,
    };
    // edge case
    if(current === undefined){
      throw new Error("The linked list is empty");
    }
    if(current.data === target){
      this.insert(value);
      return;
    }

    while (current.next != undefined){
      if(current.next.data === target){
        newNode.next = current.next;
        current.next = newNode;
        break;
      } else {
        current = current.next;
      }
    }
    if(current.next === undefined){
      throw new Error("The target value not in the linked list");
    }
  };

  insertAfter(target: T, value: T, ): void {
    let current = this.head;
    let newNode: Node<T> = {
      data: value,
      next: this.head,
    };
    // edge case
    if(current === undefined){
      throw new Error("The linked list is empty");
    }
    while(current != undefined){
      if(current.data === target){
        newNode.next = current.next;
        current.next = newNode;
        break;
      } else {
        current = current.next;
      }
    }
    if(current === undefined){
      throw new Error("The target value is not in the linked list");
    }
  }

  kthFromEnd(target: number): any {
    let size = this.size();
    let current = this.head;

    // edge cases out of range or negative k value
    if (target > size || target < 0) {
      throw new Error("error");
    }
    
    while(target <= size){

      let len = size - target;
      for(let i = 0; i < len; i++) {
          current = current?.next;
      }
      return current?.data;
    }
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
