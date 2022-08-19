export class Queue<T> {

  storage: T[] = [];

  get size(): number {
    return this.storage.length;
  }

  get peek(): T {
    if(this.isEmpty()){
      throw new Error("Queue is empty");
    } else {
      return this.storage[this.storage.length - 1];
    }
  }

  enqueue(value: T): void {
    this.storage.unshift(value);
  }

  dequeue(): T | undefined {
    if(this.isEmpty()) {
      throw new Error("Queue is empty");
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
