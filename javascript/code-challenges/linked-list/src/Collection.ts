export interface Collection<T> {
  size(): number;
  kthFromEnd(t: number): any;
  insert(t: T): void;
  includes(t: T): boolean;
  toString(): string;
}

export function display(t: any): string {
  if (t?.toString) {
    return t.toString();
  }
  return `${t}`;
}

// export function size(t: any): number {
//   if(t?.size){
//     return t.size();
//   }
//   return `${t}`;
// }
