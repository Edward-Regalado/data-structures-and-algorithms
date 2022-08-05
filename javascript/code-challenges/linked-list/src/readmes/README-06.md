# Code Challenge: Class 06

- Extend a Linked List to allow various insertion methods

## Methods

### append

- Arguments: value
- Returns: nothing
- Adds a new node with that value to the `tail` of the list with `O(1)` time performance.

### insertBefore

- Arguments: value, new value
- Returns: nothing
- Adds a new node with the given new value immediately before the first node that has the value specified

### insertAfter

- Arguments: none
- Returns: nothing
- Adds a new node with the given new value immediately after the node that has the value specified

## Approach & Efficiency

- `.append(value)`
  - Time: O(1)
  - Space: O(1)

- `.insertBefore(target value, value)`
  - Time: O(n)
  - Space: O(1)

- `.insertAfter(target value, value)`
  - Time: O(n)
  - Space: O(1)

## Structure and Testing

1. Can successfully add a node to the end of the linked list
2. Can successfully add multiple nodes to the end of a linked list
3. Can successfully insert a node before a node located i the middle of a linked list
4. Can successfully insert a node before the first node of a linked list
5. Can successfully insert after a node in the middle of the linked list
6. Can successfully insert a node after the last node of the linked list

## Collaboration

- Martha Q., Sarah T., Luis S.

## Whiteboard

![whiteboard]()
