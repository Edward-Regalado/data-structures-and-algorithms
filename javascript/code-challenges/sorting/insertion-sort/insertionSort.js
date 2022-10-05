function insertionSort(arr){
  let arrLength = arr.length;

  if(arrLength === 0) {
    throw new Error('Input array is empty!');
  }

  for(let i = 1; i < arrLength; i++){
    let current = arr[i];
    let j = i - 1;
    while((j > -1) && (arr[j] > current)){
      arr[j + 1] = arr[j];
      j--;
    }
    arr[j + 1] = current;
  }
  return arr;
}

module.exports = insertionSort;
