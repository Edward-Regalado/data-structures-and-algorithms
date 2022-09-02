// const Node = require('./node.js');

class BinaryTree{
  constructor(){
    this.root = null;
  }

  preOrder(node, elements = []){
    // let elements = [];
    elements.push(this.value);
    if(this.left){
      this.preOrder(node.left, elements);
      // elements = elements.concat(left);
    }
    if(this.right){
      this.right.preOrder(node.right, elements);
      // elements = elements.concat(right);
    }
    return elements;
  }

  inOrder(node, elements = []){
    // let elements = [];
    if(node.left){
      this.left.inOrder(node.left);
      // elements.push(left);
    }
    elements.push(node.value);
    if(this.right){
      this.right.inOrder(this.right);
      // elements.push(right);
    }
    return elements;
  }

  postOrder(node, elements = []){
    // let elements = [];
    if(this.left){
      this.left.postOrder(node, elements);
      // elements.push(left);
    }
    if(this.right){
      this.right.postOrder(node.right);
      // elements.push(right);
    }
    elements.push(node.value);
    return elements;
  }

  treeMax(){
    //TODO: extending an implementation- find max values in binary tree
  }
}

module.exports = BinaryTree;

