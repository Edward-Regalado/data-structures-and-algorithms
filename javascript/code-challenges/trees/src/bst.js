const BinaryTree = require('./bt.js');
const Node = require('./node.js');

class BinarySearchTree extends BinaryTree {
  add(number) {
    let current = this.root;
    let newNode = new Node(number);
    // check if root is empty- set new node to the root
    if(!this.root){
      this.root = newNode;
    }
    // check if root is empty- set new node to root
    if(!current){
      return newNode;
    }
    while(current){
      // check left
      if(current.value > number){
        if(!current.left){
          current.left = newNode;
        } else {
          current = current.left;
        }
      }
      // check right
      if(current.value < number){
        if(!current.right){
          current.right = newNode;
        } else {
          current = current.right;
        }
      }
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
