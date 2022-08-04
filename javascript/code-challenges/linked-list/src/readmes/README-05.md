# Collection: Code Challenge 05 - Singly Linked List

- "A linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list."

## Node

- Create a `Node` class that has properties for the value store in the Node, and a pointer to the next node.

## Linked List

- Create a Linked List class
- Within your Linked List class, include a `head` property.
  - Upon instantiation, an empty Linked List should be created.

## Methods

### insert

- Arguments: value
- Returns: nothing
- Adds a new node with that value to the `head` of the list with `O(1)` time performance.

### includes

- Arguments: value
- Returns: Boolean
  - Indicates whether that value exists as a Node’s value somewhere within the list.

### toString

- Arguments: none
- Returns: a string representing all the values in the Linked List, formatted as: `"{ a } -> { b } -> { c } -> null"`

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

## API

- `.insert(value)`
  - inserts a new node to the beginning of the linked list

- `.includes(value)`
  - traverses through the linked list and returns a boolean if value exists

- `.toString()`
  - displays a string representation of the linked list

## Structure and Testing

1. Can successfully instantiate an empty linked list
2. Can properly insert into the linked list
3. The head property will properly point to the first node in the linked list
4. Can properly insert multiple nodes into the linked list
5. Will return true when finding a value within the linked list that exists
6. Will return false when searching for a value in the linked list that does not exist
7. Can properly return a collection of all the values that exist in the linked list

### Collaboration

- Martha Q., Zayah L., Sarah T., Luis S.

### Whiteboard

![linked list]()
