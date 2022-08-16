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

export class SetOfStacks<T> {

  stacks: Stack<T>[];

  constructor(private readonly maxHeight: number) {

    if(arguments.length < 1){
      throw new Error("maxHeight is required!");
    }
    this.maxHeight = maxHeight;
    this.stacks = [new Stack<T>(this.maxHeight)];
  }

  push(value: T): void {
    if(this.stacks[this.stacks.length - 1].size >= this.maxHeight){
      let stack = new Stack<T>(this.maxHeight);
      stack.push(value);
      this.stacks.push(stack);
    } else {
      this.stacks[this.stacks.length - 1].push(value);
    }
  }

  pop(): T | undefined {
    let popped = this.stacks[this.stacks.length - 1].pop();
    if(this.stacks.length !== 1 && this.stacks[this.stacks.length - 1].size === 0){
      this.stacks.pop();
    }
  return popped;
}

  get peek(): T | undefined {
    return this.stacks[this.stacks.length - 1].peek;
  }

  // BONUS QUESTION
  get size(): number | undefined {
    let sum = 0;
    if(this.stacks[0].size === 0){
      return sum;
    } else {
      for(let i = 0; i < this.stacks.length; i++){
        sum += this.stacks[i].size ? this.stacks[i].size : 1;
      }
    }
    return sum;
  }

  isEmpty(): boolean {
    if(this.stacks[0].size === 0){
      return true;
    } else {
      return false;
    }
  }
}
