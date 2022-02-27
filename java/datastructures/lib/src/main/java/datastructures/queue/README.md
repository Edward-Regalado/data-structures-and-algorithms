# Implementation: Queues

- Queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) principle.

## Features

- Using a Linked List as the underlying data storage mechanism, implement both a Stack and a Queue

### Node

- Create a `Node` class that has properties for the value stored in the Node, and a pointer to the next node.

## Queue

- Create a Queue class that has a front property. It creates an empty Queue when instantiated.
- This object should be aware of a default empty value assigned to front when the queue is created.
- The class should contain the following methods:

### enqueue

- Arguments: value
- adds a new node with that value to the back of the queue with an O(1) Time performance.

### dequeue

- Arguments: none
- Returns: the value from node from the front of the queue
- Removes the node from the front of the queue
- Should raise exception when called on empty queue

### peek

- Arguments: none
- Returns: Value of the node located at the front of the queue
- Should raise exception when called on empty stack

### is empty

- Arguments: none
- Returns: Boolean indicating whether the queue is empty
  You have access to the Node class and all the properties on the Linked List class.

## Structure and Testing

- Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

1. Can successfully enqueue into a queue
2. Can successfully enqueue multiple values into a queue
3. Can successfully dequeue out of a queue the expected value
4. Can successfully peek into a queue, seeing the expected value
5. Can successfully empty a queue after multiple dequeues
6. Can successfully instantiate an empty queue
7. Calling dequeue or peek on empty queue raises exception

## Approach & Efficiency

- `.enqueue(Type value)`
  - adds a value into the front of the queue
  - **Big O**
    - Time: O(1)
    - Space: O(1)

- `.dequeue()`
  - dequeues/removes the value at the front of the queue
  - **Big O**
    - Time: O(1)
    - Space: O(1)

- `.peek()`
  - returns the value at the front of the queue
  - **Big O**
    - Time: O(1)
    - Space: O(1)

- `.isEmpty()`
  - checks if the queue is empty
  - **Big O**
    - Time: O(1)
    - Space: O(1)

## API
<!-- Description of each method publicly available to your Stack and Queue-->
