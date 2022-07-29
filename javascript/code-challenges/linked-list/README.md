# Collection: Singly Linked List

- "A linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list."

## Challenge

### Node

- Create a `Node` class that has properties for the value store in the Node, and a pointer to the next node.

### Linked List

- Create a Linked List class
- Within your Linked List class, include a `head` property.
  - Upon instantiation, an empty Linked List should be created.

### Methods

#### insert

- Arguments: value
- Returns: nothing
- Adds a new node with that value to the `head` of the list with `O(1)` time performance.

#### includes

- Arguments: value
- Returns: Boolean
  - Indicates whether that value exists as a Node’s value somewhere within the list.

#### toString

- Arguments: none
- Returns: a string representing all the values in the Linked List, formatted as: `"{ a } -> { b } -> { c } -> null"`

#### append

- Arguments: value
- Returns: nothing
- Adds a new node with that value to the `tail` of the list with `O(1)` time performance.

#### insertBefore

- Arguments: value, new value
- Returns: nothing
- Adds a new node with the given new value immediately before the first node that has the value specified

#### insertAfter

- Arguments: none
- Returns: nothing
- Adds a new node with the given new value immediately after the node that has the value specified

## Approach & Efficiency

- `.insert(value)`
  - Time: O(n)
  - Space: O(1)

- `.includes(value)`
  - Time: O(n)
  - Space: O(1)

- `.toString()`
  - Time: O(n)
  - Space: O(n)

  - `.append(value)`
  - Time: O(1)
  - Space: O(1)

- `.insertBefore(target value, value)`
  - Time: O(n)
  - Space: O(1)

- `.insertAfter(target value, value)`
  - Time: O(n)
  - Space: O(1)

## API

- `.insert(value)`
  - inserts a new node to the beginning of the linked list

- `.includes(value)`
  - traverses through the linked list and returns a boolean if value exists

- `.toString()`
  - displays a string representation of the linked list

- `.append(value)`
  - inserts a new node to the end of the linked list

- `.insertBefore(target, value)`
  - inserts a new node immediately before the target value

- `.insertAfter(target, value)`
  - inserts a new node immediately after the target value

### Collaboration

- Martha Q., Zayah L., Sarah T., Luis S.

### Whiteboard

[linked list]()

[Assignment instructions](https://codefellows.github.io/common_curriculum/data_structures_and_algorithms/Code_401/class-05/LAB)

## TypeScript Instructions

- Verify your types are correct with `npm run check`
- Verify your implementation is correct with `npm run test`
  - When converting the value in a node to a string, use the `display` function in [`Collection.ts`](./src/Collection.ts).
- DO NOT edit [assignment.test.ts](./src/).
- Add your own tests to [LinkedList.test.ts](./src/LinkedList.test.ts).
- Tests must pass the github workflow for full credit.

## TypeScript resources

- [Typescript Handbook](https://www.typescriptlang.org/docs/handbook/intro.html)

### Common Types

- `boolean` is `true` or `false`.
- `number` is any JavaScript number - `5`, `-17`, `22.356`, `3/10`, `Number.MAX_VALUE`, etc.
- `string` is any JavaScript string - `'hello'`, `'goodbye'`, `\`I am ${age}\``
- `interface Person { name: string; age: number; }` is a JavaScript object with two properties, `name` and `age`. `name` must be a string, and `age` must be a number.
- `(name: string, age: number) => Person` is a function with two parameters, `name` (a string) and `age` (a number), which will return an object of type `Person`.
- `() => void` is a function with no arguments, and returns nothing.
  <!-- - `'hello'`' is the JavaScript string `'hello'` and no other string. -->
  <!-- - `'hello'|'goodbye'` is either the JavaScript string `'hello'` or the string `'goodbye'`, and no other strings. -->
