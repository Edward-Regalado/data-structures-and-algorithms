import { Queue } from "./queue";

describe("Queue", () => {
  it("can enqueue", () => {
    const q = new Queue<string>();

    expect(() => q.enqueue("Frodo")).not.toThrow();
  });

  it("enqueues", () => {
    const queue = new Queue<string>();

    queue.enqueue("Frodo");
    queue.enqueue("Sam");

    expect(queue.size).toBe(2);
    expect(queue.peek).toBe("Frodo");
  });

  it("can successfully queue into a queue", () => {
    const queue = new Queue<number>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    expect(queue).toBeDefined();
    expect(queue.size).toBe(3);

  });

  it("can successfully queue multiple values into a queue", () => {
    const queue = new Queue<number>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);

    expect(queue).toBeDefined();
    expect(queue.size).toBe(5);

  });

  it("can successfully dequeue out of a queue the expected value", () => {
    const queue = new Queue<number>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    expect(queue).toBeDefined();
    expect(queue.size).toBe(3);
    expect(queue.dequeue()).toBe(3);

  });

  it("can successfully peek into a queue", () => {
    const queue = new Queue<number>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    expect(queue).toBeDefined();
    expect(queue.size).toBe(3);
    expect(queue.peek).toBe(1);

  });

  it("can successfully empty a queue after multiple dequeues", () => {
    const queue = new Queue<number>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    expect(queue).toBeDefined();
    expect(queue.size).toBe(0);

  });

  it("can successfully empty a queue after multiple dequeues", () => {
    const queue = new Queue<number>();

    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();

    expect(queue).toBeDefined();
    expect(queue.size).toBe(0);

  });

  it("can successfully instantiate an empty queue", () => {
    const queue = new Queue<number>();

    expect(queue).toBeDefined();
    expect(queue.size).toBe(0);

  });

  it("throws an error when dequeue on an empty queue", () => {
    const queue = new Queue<number>();

    expect(queue).toBeDefined();
    expect(() => {queue.dequeue()}).toThrow();

  });

  it("throws an error when peek on an empty queue", () => {
    const queue = new Queue<number>();

    expect(queue).toBeDefined();
    expect(() => {queue.peek}).toThrow();

  });
});
