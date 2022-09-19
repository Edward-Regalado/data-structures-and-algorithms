class BinaryTree {
  constructor(root){
    this.root = root;
  }

  preOrder(){
    let elements = [];
    if(this.root === undefined){
      throw new Error('binary tree is empty');
    }

    function traverse(root){
      elements.push(root.value);
      if(root.left){
        traverse(root.left);
      }
      if(root.right){
        traverse(root.right);
      }
    }
    traverse(this.root);
    return elements;
  }

  inOrder(){
    let elements = [];
    if(this.root === undefined){
      throw new Error('binary tree is empty');
    }

    function traverse(root){
      if(root.left){
        traverse(root.left);
      }
      elements.push(root.value);
      if(root.right){
        traverse(root.right);
      }
    }
    traverse(this.root);
    return elements;
  }

  postOrder(){
    let elements = [];
    if(this.root === undefined){
      throw new Error('binary tree is empty');
    }

    function traverse(root){
      if(root.left){
        traverse(root.left);
      }
      if(root.right){
        traverse(root.right);
      }
      elements.push(root.value);
    }
    traverse(this.root);
    return elements;
  }

  kPrint(){
    let elements = [];
    if(this.root === undefined){
      throw new Error('binary tree is empty');
    }
    elements.push(this.root);
    function traverse(root){
      if(root.children){
        root.children.forEach(child => {
          traverse(child);
        });
      }
    }
    traverse(this.root);
    return elements;
  }


  breadthFirstSearch(){
    if(this.root === undefined){
      throw new Error('empty binary tree');
    }

    let queue = [];
    let values = [];
    queue.push(this.root);
    while(queue.length !== 0){
      let front = queue.shift();
      values.push(front.value);
      if(front.left !== undefined){
        queue.push(front.left);
      }
      if(front.right !== undefined){
        queue.push(front.right);
      }
    }
    return values;
  }

  treeMax(){
    if(this.root === undefined){
      throw new Error('empty binary tree');
    }
    let queue = [];
    let maxValue = Number.MIN_SAFE_INTEGER;

    queue.push(this.root);
    while(queue.length !== 0){
      let front = queue.shift();
      if(front.value > maxValue){
        maxValue = front.value;
      }
      if(front.left !== undefined){
        queue.push(front.left);
      }
      if(front.right !== undefined){
        queue.push(front.right);
      }
    }
    return maxValue;
  }
}

module.exports = BinaryTree;
