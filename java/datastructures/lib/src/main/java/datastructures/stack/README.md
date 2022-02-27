# Implementation: Stacks

- Stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle.

## Features

- Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue

### Node

- Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.

## Stack

- Create a Stack class that has a top property. It creates an empty Stack when instantiated.
- This object should be aware of a default empty value assigned to top when the stack is created.
- The class should contain the following methods:

### push

- Arguments: value
- adds a new node with that value to the top of the stack with an O(1) - Time performance.

### pop

- Arguments: none
- Returns: the value from node from the top of the stack
- Removes the node from the top of the stack
- Should raise exception when called on empty stack

### peek

- Arguments: none
- Returns: Value of the node located at the top of the stack
- Should raise exception when called on empty stack

### is empty

- Arguments: none
- Returns: Boolean indicating whether the stack is empty.

## Structure and Testing

- Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

1. Can successfully push onto a stack
2. Can successfully push multiple values onto a stack
3. Can successfully pop off the stack
4. Can successfully empty a stack after multiple pops
5. Can successfully peek the next item on the stack
6. Can successfully instantiate an empty stack
7. Calling pop or peek on empty stack raises exception

## Approach & Efficiency

- `.push(Type value)`
  - pushes a value into the top of the stack
  - **Big O**
    - Time: O(1)
    - Space: O(1)

- `pop()`
  - pops/removes the value at the top of the stack
  - **Big O**
    - Time: O(1)
    - Space: O(1)

- `.peek()`
  - returns the value at the top of the stack
  - **Big O**
    - Time: O(1)
    - Space: O(1)

- `.isEmpty()`
  - checks if the stack is empty
  - **Big O**
    - Time: O(1)
    - Space: O(1)

## API
<!-- Description of each method publicly available to your Stack and Queue-->
