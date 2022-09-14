const BinaryTree = require('./binaryTree.js');
const Node = require('./node.js');

class BinarySearchTree extends BinaryTree {
  add(number) {
    let newNode = new Node(number);

    if(this.root === undefined){
      this.root = newNode;
      return this;
    }

    let current = this.root;

    while(current){
      if(current.value > number){
        if(current.left === undefined){
          current.left = newNode;
          return this;
        } else {
          current = current.left;
        }
      }
      if(current.value < number){
        if(current.right === undefined){
          current.right = newNode;
          return this;
        } else {
          current = current.right;
        }
      }
      if(current.value === number){
        return this;
      }
      // return newNode;
    }
  }

  contains(number) {
    let current = this.root;
    while(current){
      if(number === current.value){
        return true;
      }
      if(number > current.value){
        current = current.right;
      } else {
        current = current.left;
      }
    }
    return false;
  }
}

module.exports = BinarySearchTree;
