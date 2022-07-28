import { Collection } from "./Collection";
import { LinkedList } from "./LinkedList";

describe("linked list", () => {
  it("instantiate a new linked list", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    expect(linkedListOfStrings).toBeDefined();

  });

  it("can properly insert into linked list", () => {
    const linkedListOfNumbers: Collection<number> = new LinkedList<number>();

    linkedListOfNumbers.insert(10);
    linkedListOfNumbers.insert(5);
    linkedListOfNumbers.insert(2);
    linkedListOfNumbers.insert(1);

    expect(linkedListOfNumbers).toBeDefined();
    expect(linkedListOfNumbers.includes(10)).toBe(true);
    expect(linkedListOfNumbers.includes(5)).toBe(true);
    expect(linkedListOfNumbers.includes(2)).toBe(true);
    expect(linkedListOfNumbers.includes(1)).toBe(true);

  });

  it("the head property will point to the first node in the linked list", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    linkedListOfStrings.insert('tail');
    linkedListOfStrings.insert('node3');
    linkedListOfStrings.insert('node2');
    linkedListOfStrings.insert('head');

    expect(linkedListOfStrings.toString()).toEqual("{ head } -> { node2 } -> { node3 } -> { tail } -> NULL");
  });

  it("can properly insert multiple nodes into the linked list", () => {
    const linkedListOfNumbers: Collection<number> = new LinkedList<number>();

    linkedListOfNumbers.insert(6);
    linkedListOfNumbers.insert(5);
    linkedListOfNumbers.insert(4);
    linkedListOfNumbers.insert(3);
    linkedListOfNumbers.insert(2);
    linkedListOfNumbers.insert(1);

    expect(linkedListOfNumbers).toBeDefined();
    expect(linkedListOfNumbers.includes(1)).toBe(true);
    expect(linkedListOfNumbers.includes(2)).toBe(true);
    expect(linkedListOfNumbers.includes(3)).toBe(true);
    expect(linkedListOfNumbers.includes(4)).toBe(true);
    expect(linkedListOfNumbers.includes(5)).toBe(true);
    expect(linkedListOfNumbers.includes(6)).toBe(true);

  });

  it("will return true when finding a value within the linked list that exists", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    linkedListOfStrings.insert('a');
    linkedListOfStrings.insert('b');
    linkedListOfStrings.insert('c');
    linkedListOfStrings.insert('d');
    linkedListOfStrings.insert('e');
    linkedListOfStrings.insert('f');

    expect(linkedListOfStrings).toBeDefined();
    expect(linkedListOfStrings.includes('a')).toBe(true);
    expect(linkedListOfStrings.includes('b')).toBe(true);
    expect(linkedListOfStrings.includes('this string does not exist in our list')).toBe(false);
  });

  it("will return false when searching for a value in the link list does not exist", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    linkedListOfStrings.insert('a');
    linkedListOfStrings.insert('b');
    linkedListOfStrings.insert('c');
    linkedListOfStrings.insert('d');
    linkedListOfStrings.insert('e');
    linkedListOfStrings.insert('f');

    expect(linkedListOfStrings).toBeDefined();
    expect(linkedListOfStrings.includes('x')).toBe(false);
    expect(linkedListOfStrings.includes('h')).toBe(false);
    expect(linkedListOfStrings.includes('z')).toBe(false);
    expect(linkedListOfStrings.includes('this string does not exist in our list')).toBe(false);
  });

  it("can properly return a collection of all the values that exist in the linked list", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    linkedListOfStrings.insert('a');
    linkedListOfStrings.insert('b');
    linkedListOfStrings.insert('c');

    expect(linkedListOfStrings.toString()).toEqual(
      "{ c } -> { b } -> { a } -> NULL"
    );
  });

});
