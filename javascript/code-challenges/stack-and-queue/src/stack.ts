export class Stack<T> {

  storage: T[] = [];

  get size(): number {
    return this.storage.length;
  }

  get peek(): T | undefined {
    if(this.isEmpty()){
      throw new Error("Stack is empty");
    } else {
      return this.storage[this.size - 1];
    }
  }

  push(value: T): void {
    this.storage.push(value);
  }

  pop(): T | undefined {
    if(this.isEmpty()) {
      throw new Error("Stack is empty");
    } else {
      return this.storage.pop();
  }
}

  isEmpty(): boolean {
    if(this.storage.length === 0){
      return true;
    } else {
      return false;
    }
  }
}
