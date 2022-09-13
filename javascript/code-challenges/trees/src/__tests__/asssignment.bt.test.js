const BinaryTree = require('../bt.js');
const Node = require('../node.js');

describe('BinaryTree', () => {
  // const tree = new BinaryTree(
  //   new Node(1,new Node(7, new Node(2), new Node(6, new Node(3), new Node(11))), new Node(9, new Node(9, new Node(5)))
  //   )
  // );

  const tree = new BinaryTree();

  let rootNode = new Node(1);
  let n2 = new Node(2);
  let n3 = new Node(3);

  tree.root = rootNode;
  rootNode.left = n2;
  rootNode.right = n3;
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
    expect(tree.inOrder(rootNode)).toEqual([2, 1, 3]);
  });

  it('does an post-order traversal (left, right, root)', () => {
    expect(tree.postOrder(rootNode)).toEqual([2, 3, 1]);
  });

  it('does an pre-order traversal (root, left, right)', () => {
    expect(tree.preOrder(rootNode)).toEqual([1, 2, 3]);
  });
});


// Node(9, undefined, new Node(9, new Node(5)))
