import { SetOfStacks } from "./set_of_stacks";

describe("SetOfStacks", () => {
  it("peeks and pops with strings", () => {
    const stack = new SetOfStacks(3);

    stack.push("Frodo");
    stack.push("Sam");
    stack.push("Merry");
    stack.push("Pippin");

    expect(stack.peek).toBe("Pippin");

    stack.pop();

    expect(stack.peek).toBe("Merry");
  });

  it("peeks and pops with numbers", () => {
    const stack = new SetOfStacks(3);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    expect(stack.pop()).toBe(4);
    expect(stack.peek).toBe(3);
    expect(stack.pop()).toBe(3);
    expect(stack.peek).toBe(2);
  });


  // BONUS QUESTION (2 points)
  it("tracks total size with strings", () => {
    const stack = new SetOfStacks(3);

    expect(stack.size).toBe(0);

    stack.push("Frodo");
    stack.push("Sam");
    stack.push("Merry");
    stack.push("Pippin");

    expect(stack.size).toBe(4);

    stack.pop();

    expect(stack.size).toBe(3);
  });

  it("tracks total size with numbers", () => {
    const stack = new SetOfStacks(3);

    expect(stack.size).toBe(0);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    expect(stack.size).toBe(5);
    stack.pop();
    stack.pop();
    expect(stack.size).toBe(3);
  });
});
