const BinaryTree = require('../bt.js');
const Node = require('../node.js');
const breadthFirstSearch = require('../bfs.js');


describe('BinaryTree', () => {
  const tree = new BinaryTree(
    new Node(1,new Node(7, new Node(2), new Node(6, new Node(3), new Node(11))), new Node(9, new Node(9, new Node(5)))
    )
  );

  it('does a breadthFirstSearch and prints nodes', () => {
    expect(breadthFirstSearch(tree).toEqual([1, 7, 2, 6, 3, 11, 9, 9, 5]));
  });
});
