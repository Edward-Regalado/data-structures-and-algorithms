const fizzBuzzTree = require('../tree-fizz-buzz/tree-fizz-buzz.js');
const BinaryTree = require('../../binaryTree.js');
const KNode = require('../../kNode.js');


describe('Binary Tree Breadth-First-Search', () => {

  it('instantiates an empty tree', () => {
    // const tree2 = new BinaryTree();
    // const tree = new BinaryTree(new KNode(5));
    let n1 = new KNode(5);
    let n2 = new KNode(3);
    // let n3 = new KNode(4);
    n1.addChild(n2);
    // n1.addChild(n3);

    const tree = new BinaryTree(n1);

    // expect(fizzBuzzTree(tree)).toEqual(['Buzz', ['Fizz', '4']]);
    expect(fizzBuzzTree(tree)).toEqual(['Buzz', ['Fizz']]);
  });

});
