class Tree {
  constructor(value, children = []) {
    this.value = value;
    this.children = children;
  }

  addChild(tree) {
    this.children.push(tree);
  }

  preOrder() {
    return [this.value, this.children.map((child) => child.preOrder())];
  }

  pOrder(root, value = []){
    if(!root) return value;
    value.push(root.value);
    for(let child of root.children){
      this.preOrder(child, value);
    }
  }
}

function fizzBuzz(tree) {
  if(tree.value % 3 === 0 && tree.value % 5 === 0){
    tree.value = 'FizzBuzz';
  if(tree.value % 5 === 0){
    tree.value = 'Buzz';
  if(tree.value % 3 === 0){
    tree.value = 'Fizz';
  }
  const nodes = tree.preOrder();
  return tree;
}

module.exports = {
  Tree,
  fizzBuzz,
};
