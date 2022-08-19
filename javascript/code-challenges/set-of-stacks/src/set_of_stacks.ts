export class SetOfStacks<T> {

  container: Stack<T>[];


  constructor(private readonly maxHeight: number) {

    if(arguments.length < 1){
      throw new Error("maxHeight is required!");
    }
    this.maxHeight = maxHeight;
    this.container = [new Stack<T>(this.maxHeight)];
  }

  push(value: T): void {
    let lastIndex = this.container.length - 1;
    if(this.container[lastIndex].size >= this.maxHeight){
      let nestedStack = new Stack<T>(this.maxHeight);
      nestedStack.push(value);
      this.container.push(nestedStack);
    } else {
      this.container[lastIndex].push(value);
    }
  }

  pop(): T | undefined {
    let lastIndex = this.container.length - 1;
    let poppedValue = this.container[lastIndex].pop();
    if(this.container.length !== 1 && this.container[this.container.length - 1].size === 0){
      this.container.pop();
    }
  return poppedValue;
}

  get peek(): T | undefined {
    let lastIndex = this.container.length - 1;
    return this.container[lastIndex].peek;
  }

  // BONUS QUESTION
  get size(): number | undefined {
    let sum = 0;
    if(this.isEmpty()){
      return sum;
    } else {
      for(let i = 0; i < this.container.length; i++){
        sum += this.container[i].size ? this.container[i].size : 1;
      }
    }
    return sum;
  }

  isEmpty(): boolean {
    if(this.container[0].size === 0){
      return true;
    } else {
      return false;
    }
  }
}

class Stack<T> {
  readonly _arr: T[] = [];
  constructor(private readonly maxHeight: number) {}

  push(t: T) {
    if (this._arr.length > this.maxHeight) {
      throw new Error("Stack toppled over!");
    }
    this._arr.push(t);
  }

  pop() {
    return this._arr.pop();
  }

  get peek(): T | undefined {
    return this._arr.at(-1);
  }

  get size(): number {
    return this._arr.length;
  }
}
