import { Collection, display } from "./Collection";

interface Node<T> {
  data: T,
  next: Node<T> | undefined;
}

export class LinkedList<T> implements Collection<T> {

  head: Node<T> | undefined;

  insert(value: T): void {
    let newNode: Node<T> = {
      data: value,
      next: this.head,
    };
    newNode.next = this.head;
    this.head = newNode;
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
}
