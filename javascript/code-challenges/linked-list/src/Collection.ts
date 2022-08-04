export interface Collection<T> {
  size(): number;
  kthFromEnd(t: number): any;
  insert(t: T): void;
  includes(t: T): boolean;
  toString(): string;
  insertAfter(t: T, value: T): void;
  insertBefore(t: T, value: T): void;
  append(t: T): void;
}

export function display(t: any): string {
  if (t?.toString) {
    return t.toString();
  }
  return `${t}`;
}

