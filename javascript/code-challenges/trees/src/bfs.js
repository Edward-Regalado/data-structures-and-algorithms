function breadthFirstSearch(bt){

  if(bt === undefined){
    return;
  }

  let queue = [];
  let nodes = [];
  while(queue.length !== 0){
    let front = queue.shift();
    nodes.push(front.value);
    if(front.left !== undefined){
      queue.push(front.left);
    }
    if(front.right !== undefined){
      queue.push(front.right);
    }
  }
  return nodes;
}

module.exports = breadthFirstSearch;
