// const { root } = require('cheerio/lib/static.js');
const BinaryTree = require('../../binaryTree.js');
const KNode = require('../../kNode.js');
// const KNode = require('../../kNode.js');

function fizzBuzzTree(kt){

  if(kt.root === undefined){
    throw new Error('input tree is empty');
  }
  let newTree = new BinaryTree();
  newTree.root = kt.root;


  function traverse(root){
    fizzBuzz(root);
    if(root.children){
      root.children.forEach(childNode => {
        traverse(childNode);
      });
    }
  }

  function fizzBuzz(node){
    if(node.value % 3 === 0 && node.value % 5 === 0){
      node.value = 'FizzBuzz';
    } else if(node.value % 5 === 0){
      node.value = 'Buzz';
    } else if(node.value % 3 === 0){
      node.value = 'Fizz';
    } else {
      node.value = node.value.toString();
    }
  }

  function print(tree){
    let elements = [];
    if(tree.root === undefined){
      throw new Error('binary tree is empty');
    }
    function printTraverse(root){
      elements.push(root.value);
      if(root.children){
        root.children.forEach(child => {
          elements.push(child.value);
          traverse(child);
        });
      }
    }
    printTraverse(tree.root);
    return elements;
  }

  traverse(newTree.root);
  let nodes = print(newTree);
  return nodes;
}

module.exports = fizzBuzzTree;
