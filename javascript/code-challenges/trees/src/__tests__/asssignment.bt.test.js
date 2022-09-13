const { it } = require('eslint/lib/rule-tester/rule-tester.js');
const BinaryTree = require('../bt.js');
const Node = require('../node.js');

describe('BinaryTree', () => {
  // const tree = new BinaryTree(
  //   new Node(1,new Node(7, new Node(2), new Node(6, new Node(3), new Node(11))), new Node(9, new Node(9, new Node(5)))
  //   )
  // );

  const tree = new BinaryTree();

  let n1 = new Node(1);
  let n2 = new Node(2);
  let n3 = new Node(3);

  tree.root = n1;
  n1.left = n2;
  n1.right = n3;
  // tree.root.right = n3;

  // let node = new Node(10, new Node(4));
  // let node2 = new Node(2);
  // tree(node);
  // it('does an in-order traversal (left, root, right)', () => {
  //   expect(tree.inOrder()).toEqual([2, 7, 3, 6, 11, 1, 9, 5, 9]);
  // });

  // it('does an post-order traversal (left, right, root)', () => {
  //   expect(tree.postOrder(node)).toEqual([2, 3, 11, 6, 7, 5, 9, 9, 1]);
  // });

  it('does an in-order traversal (left, root, right)', () => {
    expect(tree.inOrder(n1)).toEqual([2, 1, 3]);
  });

  it('does an post-order traversal (left, right, root)', () => {
    expect(tree.postOrder(n1)).toEqual([2, 3, 1]);
  });

  it('does an pre-order traversal (root, left, right)', () => {
    expect(tree.preOrder(n1)).toEqual([1, 2, 3]);
  });

  ////////////// Max Values Tests /////////////////////////////
  it('throws error when trying to get the max value if the binary tree is empty', () => {

    const tree = new BinaryTree();

    expect(() => tree.treeMax()).toThrow('empty binary tree');
  });

  it('returns the max value in a binary tree', () => {

    const tree = new BinaryTree();

    let n1 = new Node(1);
    let n2 = new Node(2);
    let n3 = new Node(3);

    tree.root = n1;
    n1.left = n2;
    n1.right = n3;

    expect(tree.treeMax()).toBe(3);
  });

  it('returns the max value in a binary tree with all negative values', () => {

    const tree = new BinaryTree();

    let n1 = new Node(-4);
    let n2 = new Node(-2);
    let n3 = new Node(-1);
    let n4 = new Node(-10);

    tree.root = n1;
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;

    expect(tree.treeMax()).toBe(-1);
  });

  it('returns the max value in a binary tree with negative and positive values', () => {

    const tree = new BinaryTree();

    let n1 = new Node(-4);
    let n2 = new Node(2);
    let n3 = new Node(-1);
    let n4 = new Node(-10);
    let n5 = new Node(5);
    let n6 = new Node(12);

    tree.root = n1;
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    n3.left = n6;

    expect(tree.treeMax()).toBe(12);
  });

  it('returns the max value in a binary tree with repeating values', () => {

    const tree = new BinaryTree();

    let n1 = new Node(5);
    let n2 = new Node(5);
    let n3 = new Node(5);
    let n4 = new Node(10);
    let n5 = new Node(10);
    let n6 = new Node(10);

    tree.root = n1;
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    n3.left = n6;

    expect(tree.treeMax()).toBe(10);
  });

});
