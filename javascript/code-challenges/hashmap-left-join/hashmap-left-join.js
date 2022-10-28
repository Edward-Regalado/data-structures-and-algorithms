function leftJoin(leftMap, rightMap){
  const results = [];
  // check if we have an empty map, throw an error
  if(!leftMap.size || !rightMap.size){
    throw new Error('empty hashmap!');
  }
  // push a new nested array of key/value pairs into our results array
  for(const [key, value] of leftMap){
    results.push([key, value]);
  }
  // loop through our results array and check if map2 has the key
  // if key is found, push the value to our nested array at index[i]
  for(let i = 0; i < results.length; i++){
    if(rightMap.has(results[i][0])){
      const value = rightMap.get(results[i][0]);
      results[i].push(value);
    } else {
      results[i].push(null);
    }
  }
  return results;
}

module.exports = leftJoin;
