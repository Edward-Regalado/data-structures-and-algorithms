# Implementation: Stacks and Queues

- Stack is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle.
- Queue is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) principle.

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
- Returns: Boolean indicating whether or not the stack is empty.

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
- Returns: Boolean indicating whether or not the queue is empty
  You have access to the Node class and all the properties on the Linked List class.

## Structure and Testing

- Utilize the Single-responsibility principle: any methods you write should be clean, reusable, abstract component parts to the whole challenge. You will be given feedback and marked down if you attempt to define a large, complex algorithm in one function definition.

1. Can successfully push onto a stack
2. Can successfully push multiple values onto a stack
3. Can successfully pop off the stack
4. Can successfully empty a stack after multiple pops
5. Can successfully peek the next item on the stack
6. Can successfully instantiate an empty stack
7. Calling pop or peek on empty stack raises exception
8. Can successfully enqueue into a queue
9. Can successfully enqueue multiple values into a queue
10. Can successfully dequeue out of a queue the expected value
11. Can successfully peek into a queue, seeing the expected value
12. Can successfully empty a queue after multiple dequeues
13. Can successfully instantiate an empty queue
14. Calling dequeue or peek on empty queue raises exception


Documentation: Your README.md
# Stacks and Queues
<!-- Short summary or background information -->

## Challenge
<!-- Description of the challenge -->

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

## API
<!-- Description of each method publicly available to your Stack and Queue-->
