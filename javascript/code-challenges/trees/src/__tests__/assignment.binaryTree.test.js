const BinarySearchTree = require('../binaryTree.js');
const Node = require('../node.js');

describe('BinarySearchTree', () => {

  ///////////// IN-ORDER, PRE-ORDER AND POST-ORDER TRAVERSAL ///////////////////
  it('instantiates a binary search tree', () => {
    const tree = new BinarySearchTree();
    expect(tree).toBeDefined();
  });

  it('throws an error if tree is empty when calling inOrder traversal', () => {
    const tree = new BinarySearchTree();
    expect(() => tree.inOrder()).toThrow('binary tree is empty');
  });

  it('throws an error if tree is empty when calling preOrder traversal', () => {
    const tree = new BinarySearchTree();
    expect(() => tree.preOrder()).toThrow('binary tree is empty');
  });

  it('throws an error if tree is empty when calling postOrder traversal', () => {
    const tree = new BinarySearchTree();
    expect(() => tree.postOrder()).toThrow('binary tree is empty');
  });

  it('adds a single node to the tree and does a inOrder traversal', () => {
    const tree = new BinarySearchTree(new Node(1));
    expect(tree.inOrder()).toEqual([1]);
  });

  it('adds a single node to the tree and does a preOrder traversal', () => {
    const tree = new BinarySearchTree(new Node(1));
    expect(tree.preOrder()).toEqual([1]);
  });

  it('adds a single node to the tree and does a postOrder traversal', () => {
    const tree = new BinarySearchTree(new Node(1));
    expect(tree.postOrder()).toEqual([1]);
  });

  it('adds multiple nodes to the tree and does a inOrder traversal', () => {
    const tree = new BinarySearchTree(new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7))));
    expect(tree.inOrder()).toEqual([4, 2, 5, 1, 6, 3, 7]);
  });

  it('adds multiple nodes to the tree and does a preOrder traversal', () => {
    const tree = new BinarySearchTree(new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7))));
    expect(tree.preOrder()).toEqual([1, 2, 4, 5, 3, 6, 7]);
  });

  it('adds multiple nodes to the tree and does a postOrder traversal', () => {
    const tree = new BinarySearchTree(new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7))));
    expect(tree.postOrder()).toEqual([4, 5, 2, 6, 7, 3, 1]);
  });

  ////////////////// BREADTH FIRST SEARCH TRAVERSAL ////////////////////////
  it('adds a single node to the tree and does a breadth first search traversal', () => {
    const tree = new BinarySearchTree(new Node(1));
    expect(tree.breadthFirstSearch()).toEqual([1]);
  });

  it('adds multiple nodes to the tree and does a breadth-first search', () => {
    const tree = new BinarySearchTree(new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7))));
    expect(tree.breadthFirstSearch()).toEqual([1, 2, 3, 4, 5, 6, 7]);
  });

  /////////////////// TREE MAX //////////////////////////////////
  it('adds a single node to the tree and returns that value', () => {
    const tree = new BinarySearchTree(new Node(1));
    expect(tree.treeMax()).toEqual(1);
  });

  it('adds a new node to the tree and returns the largest values in the tree', () => {
    const tree = new BinarySearchTree(new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3, new Node(6), new Node(7))));
    expect(tree.treeMax()).toEqual(7);
  });

});
