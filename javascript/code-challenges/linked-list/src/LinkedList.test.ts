import { Collection } from "./Collection";
import { LinkedList } from "./LinkedList";


describe("linked list", () => {

//////////////// INSERT, INCLUDES, TOSTRING ///////////////////////
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

  it("should return the size of the linked list", () => {
    const linkedListOfStrings: Collection<number> = new LinkedList<number>();

    linkedListOfStrings.insert(1);
    linkedListOfStrings.insert(2);
    linkedListOfStrings.insert(3);

    expect(linkedListOfStrings.size()).toEqual(3);
  });

  //////////////// APPEND ///////////////////////
  it("should append a single node to the end of the linked list", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);
    linkedList.append(100);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 5 } -> { 4 } -> { 3 } -> { 2 } -> { 1 } -> { 100 } -> NULL"
    );
  });

  it("should append a multiple nodes to the end of the linked list", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);
    linkedList.append(100);
    linkedList.append(200);
    linkedList.append(300);
    linkedList.append(400);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 5 } -> { 4 } -> { 3 } -> { 2 } -> { 1 } -> { 100 } -> { 200 } -> { 300 } -> { 400 } -> NULL"
    );
  });

  it("should append a multiple nodes single to the end of the linked list", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);
    linkedList.append(100);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 5 } -> { 4 } -> { 3 } -> { 2 } -> { 1 } -> { 100 } -> NULL"
    );
  });

  /////////////// INSERT_BEFORE //////////////////
  it("should insert before the target node", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);
    linkedList.insertBefore(2, 100);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 5 } -> { 4 } -> { 3 } -> { 100 } -> { 2 } -> { 1 } -> NULL"
    );
  });

  it("should insert before the target node with only two nodes in the linked list", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insert(2);

    linkedList.insertBefore(1, 100);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 2 } -> { 100 } -> { 1 } -> NULL"
    );
  });

  it("should insert before the target node with only one node in the linked list", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insertBefore(1, 100);

    const str = linkedList.toString()
    expect(str).toEqual("{ 100 } -> { 1 } -> NULL"
    );
  });


  //////////////////////// INSERT_AFTER ////////////////////////
  it("should insert after the target node", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);
    linkedList.insertAfter(3, 100);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 5 } -> { 4 } -> { 3 } -> { 100 } -> { 2 } -> { 1 } -> NULL"
    );
  });

  it("should insert after the target node with only two nodes in the linked list", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insertAfter(1, 100);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 2 } -> { 1 } -> { 100 } -> NULL"
    );
  });

  it("should insert after the target node with only one node in the linked list", () => {
    const linkedList: Collection<number> = new LinkedList<number>();

    linkedList.insert(1);

    linkedList.insertAfter(1, 100);

    const str = linkedList.toString()
    expect(str).toEqual(
      "{ 1 } -> { 100 } -> NULL"
    );
  });

  ///////////////// KTH FROM THE END ////////////////////////

  it("returns kth from the end of the linked list", () => {
    const linkedListOfNumbers: Collection<number> = new LinkedList<number>();

    linkedListOfNumbers.insert(10);
    linkedListOfNumbers.insert(8);
    linkedListOfNumbers.insert(4);
    linkedListOfNumbers.insert(2);
    linkedListOfNumbers.insert(23);

    expect(linkedListOfNumbers.kthFromEnd(4)).toEqual(2);
  });

  it("returns error when kth is greater than our linked list", () => {
    const linkedListOfNumbers: Collection<number> = new LinkedList<number>();

    linkedListOfNumbers.insert(10);
    linkedListOfNumbers.insert(8);
    linkedListOfNumbers.insert(4);

    expect(() => linkedListOfNumbers.kthFromEnd(14)).toThrowError("error");
    expect(() => linkedListOfNumbers.kthFromEnd(10)).toThrow("error");
  });

  it("returns when k is the same length as the linked list", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    linkedListOfStrings.insert('a');
    linkedListOfStrings.insert('b');
    linkedListOfStrings.insert('c');
    linkedListOfStrings.insert('d');
    linkedListOfStrings.insert('e');

    expect(linkedListOfStrings.kthFromEnd(5)).toBe("e");
  });

  it("returns an error is k is a negative number", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    linkedListOfStrings.insert('a');
    linkedListOfStrings.insert('b');
    linkedListOfStrings.insert('c');
    linkedListOfStrings.insert('d');
    linkedListOfStrings.insert('e');

    expect(() => linkedListOfStrings.kthFromEnd(-5)).toThrowError("error");
  });

  it("returns when linked list of size only has one node", () => {
    const linkedListOfStrings: Collection<string> = new LinkedList<string>();

    linkedListOfStrings.insert('a');

    expect(linkedListOfStrings.kthFromEnd(1)).toBe('a');
  });

  it("happy path", () => {
    const linkedListOfNumbers: Collection<number> = new LinkedList<number>();

    linkedListOfNumbers.insert(6);
    linkedListOfNumbers.insert(33);
    linkedListOfNumbers.insert(500);
    linkedListOfNumbers.insert(78);
    linkedListOfNumbers.insert(43);

    expect(linkedListOfNumbers.kthFromEnd(1)).toBe(6);
    expect(linkedListOfNumbers.kthFromEnd(2)).toBe(33);
    expect(linkedListOfNumbers.kthFromEnd(3)).toBe(500);
    expect(linkedListOfNumbers.kthFromEnd(4)).toBe(78);
    expect(linkedListOfNumbers.kthFromEnd(5)).toBe(43);
  });

});

