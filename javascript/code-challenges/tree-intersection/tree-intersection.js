// Takes two binary trees, returns an array of their intersecting values
function treeIntersection(bt1, bt2){

  const matches = [];
  const map = new Map();
  const btArr1 = bt1.preOrder();
  const btArr2 = bt2.preOrder();

  for(const item of btArr1){
    map.set(item);
  }

  // use filter
  // const intersection = btArr2.filter((val) => map.has(val));
  // return intersection;

  // use enhanced for loop
  for(const item of btArr2){
    if(map.has(item)){
      matches.push(item);
    }
  }
  return matches;
}

module.exports = treeIntersection;

