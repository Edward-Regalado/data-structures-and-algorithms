const BinarySearchTree = require('../bst.js');

describe('Binary Search Tree', () => {

  it('adds & maintains items in order', () => {
    const tree = new BinarySearchTree();
    for (const i of [2, 3, 11, 6, 9, 7, 5, 1]) {
      tree.add(i);
    }
    expect(tree.inOrder()).toEqual([1, 2, 3, 5, 6, 7, 9, 11]);
  });

  it('adds & maintains items in order', () => {
    const tree = new BinarySearchTree();
    tree.add(1);
    tree.add(2);
    tree.add(3);
    expect(tree.inOrder()).toEqual([1, 2, 3]);
  });

  it('throws an error when when you input a string', () => {
    const tree = new BinarySearchTree();
    tree.add(3);
    tree.add(2);
    tree.add(1);
    tree.add(4);
    expect(tree.inOrder()).toEqual([1, 2, 3, 4]);
  });

  it('adds & maintains items in order', () => {
    const tree = new BinarySearchTree();
    tree.add(1);
    expect(tree.contains(1)).toBe(true);
  });

  it('looks up whether an item is in the tree', () => {
    const tree = new BinarySearchTree();
    tree.add(3);
    // tree.add(8);
    expect(tree.contains(3)).toBe(true);
    // expect(tree.contains(8)).toBe(true);
  });
});
