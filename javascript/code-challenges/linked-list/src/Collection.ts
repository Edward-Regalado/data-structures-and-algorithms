import { LinkedList } from "./LinkedList";

export interface Collection<T> {
  // required methods for class implementation of Collection
  size(): number;
  kthFromEnd(t: number): any;
  insert(t: T): void;
  includes(t: T): boolean;
  toString(): string;
  insertAfter(t: T, value: T): void;
  insertBefore(t: T, value: T): void;
  append(t: T): void;
  zipList(ll1: LinkedList<T>, ll2: LinkedList<T>): LinkedList<T>;
}

export function display(t: any): string {
  if (t?.toString) {
    return t.toString();
  }
  return `${t}`;
}

