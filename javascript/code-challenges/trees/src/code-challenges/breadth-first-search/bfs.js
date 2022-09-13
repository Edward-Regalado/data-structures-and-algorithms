function breadthFirstSearch(bt){

  if(bt.root === undefined){
    throw new Error('empty binary tree');
  }

  let queue = [];
  let values = [];

  queue.push(bt.root);

  while(queue.length !== 0) {
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

module.exports = breadthFirstSearch;
