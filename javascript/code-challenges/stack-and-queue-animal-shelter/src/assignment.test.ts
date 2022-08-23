import { Shelter } from "./shelter";

describe("Animal Shelter", () => {
  it("gets the next cat", () => {
    const shelter = new Shelter();

    shelter.enqueue("Pippin", "cat");
    shelter.enqueue("Oliver", "dog");
    shelter.enqueue("Greylien", "cat");

    expect(shelter.dequeue("cat")).toBe("Pippin");
    expect(shelter.dequeue("cat")).toBe("Greylien");
  });

  it("gets the next dog", () => {
    const shelter = new Shelter();

    shelter.enqueue("Pippin", "cat");
    shelter.enqueue("Oliver", "dog");
    shelter.enqueue("Greylien", "cat");

    expect(shelter.dequeue("dog")).toBe("Oliver");
  });

  it("gets the next friend", () => {
    const shelter = new Shelter();

    shelter.enqueue("Pippin", "cat");
    shelter.enqueue("Oliver", "dog");
    shelter.enqueue("Greylien", "cat");

    expect(shelter.dequeue()).toBe("Pippin");
    expect(shelter.dequeue()).toBe("Oliver");
  });

  it("throws an error because the queue is empty", () => {
    const shelter = new Shelter();

    expect(() => {shelter.dequeue()}).toThrow();
    expect(shelter.container.length).toBe(0);
  });
});
