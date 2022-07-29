import { Collection, display } from "./Collection";

interface Node<T> {
  data: T,
  next: Node<T> | undefined;
}

export class LinkedList<T> implements Collection<T> {

  head: Node<T> | undefined;
  tail: Node<T> | undefined;


  insert(value: T): void {
    let newNode: Node<T> = {
      data: value,
      next: this.head,
    };
    newNode.next = this.head;
    this.head = newNode;
    if(this.tail === undefined) {
      this.tail = newNode;
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
      tail = newNode;
    } else {
      this.insert(value);
    }
  };

  insertBefore(target: T, value: T): void {
    let current = this.head;
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
    }
    // traverse through linked list as long as current.next is not undefined
    while(current.next != undefined){
      // check if the next node's data is equal to the value
      if(current.next.data === target){
        newNode.next = current.next;
        current.next = newNode;
        break;
      }
      current = current.next;
    }
    if(current.next === undefined){
      throw new Error("The target value not in linked list");
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
      throw new Error("The target value is not in linked list");
    }
  }

};
