# Implementation: Binary Trees

- "A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child."

## Features

### Node

- Create a `Node` class that has properties for the value stored in the node, the `left` child node, and the `right` child node.

### Binary Tree

- Create a Binary Tree class
- Define a method for each of the depth first traversals:

### Methods

#### pre order

- text here..

#### in order

- text here...

#### post order

- which returns an array of the values, ordered appropriately.

#### breadth-first

- breadth

#### Find Max Value

- Arguments: none
- Returns: Integer


## Binary Search Tree

- Create a Binary Search Tree class
- This class should be a subclass (or your languages equivalent) of the `Binary Tree`
Class, with the following additional methods:

#### Add

- Arguments: value
- Return: nothing
- Adds a new node with that value in the correct location in the binary search tree.

#### Contains

- Argument: value
- Returns: boolean indicating whether the value is in the tree at least once.

## Approach & Efficiency

- `preOrder()`
  - Time:
  - Space:

- `inOrder()`
  - Time:
  - Space:

- `postOrder()`
  - Time:
  - Space:

- `breadthFirst()`
  - Time:
  - Space:

- `findMaxValue()`
  - Time:
  - Sapce;

### Binary Search Tree Methods

- `add()`
  - Time:
  - Space:

- `contains()`'
  - Time:
  - Spring:

## Whiteboards

![Trees](../../assets/binaryTree.PNG)

### Structure and Testing

- Write tests to prove the following functionality:

- Can successfully instantiate an empty tree
- Can successfully instantiate a tree with a single root node
- For a Binary Search Tree, can successfully add a left child and right child properly to a node
- Can successfully return a collection from a preorder traversal
- Can successfully return a collection from an inorder traversal
- Can successfully return a collection from a postorder traversal
- Returns true	false for the contains method, given an existing or non-existing node value
- Ensure your tests are passing before you submit your solution.

Stretch Goal
Create a new branch called k-ary-tree, and, using the resources available to you online, implement a k-ary tree, where each node can have any number of children.


## Collaborations and Credit

- Hambalieu Jallow, Josh Mccluskey, Tony Regalado

## Sources and References

### [stackoverflow](https://stackoverflow.com/questions/61037306/why-can-i-not-use-compareto-when-comparing-the-key-of-a-a-node-in-a-bst-to-0)
