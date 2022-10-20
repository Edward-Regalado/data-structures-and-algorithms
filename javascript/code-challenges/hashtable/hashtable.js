class HashMap {
  constructor(size){
    this.size = size; // track size
    this.map = new Array(size).fill(); // create a new array which will be used for our 'map'
  }

  // adds new object to hashMap
  set(key, value) {
    // create a hashed index to random insert each key/value pair
    let hashIndex = this.hash(key);

    const object = {};
    object['key'] = key;
    object['value'] = value;

    // if array already exist in map[hashIndex], push object
    if(this.map[hashIndex]){
      this.map[hashIndex].push(object);
    } else {
      // push
      this.map[hashIndex] = new Array();
      this.map[hashIndex].push(object);
    }
  }

  // return the values for the key
  get(key){
    // get hashed index so we can look up values at that index
    let hashIndex = this.hash(key);
    if(this.map[hashIndex]){
      // console.log('---------this.map[hashIndex]--------', this.map[hashIndex]);
      return this.map[hashIndex]; // returns all the values at this nested array
    } else {
      return undefined;
    }
  }

  // returns a boolean true if the key exists in the hashMap
  has(key){
    let hashIndex = this.hash(key);
    return this.map[hashIndex];
  }

  // retrieves all unique keys in the hashMap
  keys(){
    let set = new Set();
    let results = [];
    for(let i = 0; i < this.map.length; i++){
      // check if the sub array at index[i] is greater than one element & map through that subarray
      if(this.map[i] !== undefined){
        if(this.map[i].length > 1){
          this.map[i].map(x => {
            if(!set.has(x.key)){
              set.add(x.key);
            }
          });
        } else {
          if(!set.has(this.map[i][0].key)){
            set.add(this.map[i][0].key);
          }
        }
      }
    }
    set.forEach(element => {
      results.push(element);
    });
    return results;
  }


  // takes in a key 'string', converts to random number between 0 and map.length
  hash(key){
    // loop through our string each character at a time, grab unicode value, add to previous value, then calculate hashed index
    let sum = key.split(',').reduce((accumulate, current) => {
      let unicodeValue = current.charCodeAt(0);
      let total = accumulate + unicodeValue;
      return total;
    }, 0);
    let hashIndex = sum * 599 % this.size;
    return hashIndex;
  }
}

module.exports = HashMap;











// class HashMap {
//   constructor(size){
//     this.size = size; // track size
//     this.map = new Array(size).fill(); // create a new array which will be used for our 'map'
//   }

//   // adds new object to hashMap
//   set(key, value) {
//     // create a hashed index to random insert each key/value pair
//     let hashIndex = this.hash(key);
//     // const person = {};
//     // person['firstName'] = 'Tony';

//     // if the index is undefined, create a new array at that index
//     if(this.map[hashIndex] === undefined){
//       this.map[hashIndex] = new Array();
//     }

//     // push our object into the nested array at that index
//     // the [] around key sets the string passed to an actual object property
//     // for example: let obj = { ['name']: 'Tony' } --> { name: 'Tony' } --> obj.name = 'Tony'
//     let obj = { [key] : value};
//     this.map[hashIndex].push(obj);
//   }

//   // return the values for the key
//   get(key){
//     // get hashed index so we can look up values at that index
//     let hashIndex = this.hash(key);
//     if(this.map[hashIndex]){
//       return this.map[hashIndex]; // returns all the values at this nested array
//     } else {
//       return undefined;
//     }
//   }

//   // returns a boolean true if the key exists in the hashMap
//   has(key){
//     let hashIndex = this.hash(key);
//     return this.map[hashIndex];
//     // if(this.map[hashIndex]){
//     //     return true;
//     //   } else {
//     //     return false;
//     //   }
//     // }
//   }

//   keys(){
//     if(this.map.length > 0){
//       let results = [];
//       for(let i = 0; i < this.map.length; i++){
//         if(this.map[i] !== undefined){
//           for(const item in this.map[i]){
//             results.push(item.key);
//           }
//         }
//       }
//       return results;
//     }
//   }

//   // takes in a key and hashes the index
//   hash(key){
//     // loop through our string each character at a time, grab unicode value, add to previous value, then calculate hashed index
//     let sum = key.split(',').reduce((accumulate, current) => {
//       let unicodeValue = current.charCodeAt(0);
//       let total = accumulate + unicodeValue;
//       return total;
//     }, 0);
//     let hashIndex = sum * 599 % this.size;
//     return hashIndex;
//   }
// }

// module.exports = HashMap;
