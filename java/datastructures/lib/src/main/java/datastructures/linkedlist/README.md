# Implementation: Singly Linked List

- "A linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list."

## Features

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
- Returns: a string representing all the values in the Linked List, formatted as: `"{ 1 } -> { 2 } -> { 3 } -> { 4 } -> null"`

#### append

- Arguments
- Returns

#### insertBefore

- Arguments
- Returns

#### insertAfter

- Arguments
- Returns

#### kthValue

- Arguments
- Returns

#### zip

- Arguments: Two Linked Lists
- Returns: New Linked List zipped together


## Approach & Efficiency

- `size()`
  - Time: O(n)
  - Space: O(1)

- `.insert(int value)`
  - Time: O(n)
  - Space: O(1)

- `.includes(int value)`
  - Time: O(n)
  - Space: O(1)

- `.toString()`
  - Time: O(n)
  - Space: O(n)

- `.append(int value)`
  - Time: O(n)
  - Space: O(n)

- `.insertBefore(int nextValue, int value)`
  - Time: O(n)
  - Space: O(n)

- `.insertAfter(int afterValue, int value)`
  - Time: O(n)
  - Space: O(n)

- `.kthValue(int k)`
  - Time: O(n)
  - Space: O(1)

- `.zip(linkedList, linkList)`
  - Time: O(n)
  - Space: O(n)

## API

### `.size()`

### `.insert()`

### `.includes()`

### `.toString()`

### `.append()`

### `.insertBefore()`

### `.insertAfter()`

### `kthValue()`

### `zip()`

## Whiteboards

![Whiteboard... coming soon](/java/datastructures/lib/src/main/java/assets/linkedList.PNG)

### Collab & Credit

- Tony Regalado and Josh McCluskey


