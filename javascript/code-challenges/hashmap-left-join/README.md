# Code Challenge - Hashmap Left Join

- Joins two hashmaps into a single data structure

## Feature Tasks

- Write a function that `LEFT JOINs` two hashmaps into a single data structure.
  - Write a function called left join.
  - Arguments: two hashmaps
    - The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
    - The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
  - Returns: The returned data structure that holds the results is up to you. It doesn't need to exactly match the output below, so long as it achieves the LEFT JOIN logic.

### Approach & Efficiency

- create a results array
- loop through leftMap and push all key/value pairs as a nested array to our results array
- loop through results array
  - check if rightMap has the key/string at index 0 of the nested array at the current i index => `results[i][0]`
  - If key exists, retrieve the value and push it to nested array at the current i index
  - If key does not exist, push null to the nested array at the current i index
- return the results matrix

### Big O

- Time: O(n)
- Space: O(n)

### API

- leftJoin(leftMap, rightMap, string)
  - Arguments: two hash maps and optional string of 'right' to perform right join.
  - Returns: a matrix of values with a left join logic applied

### Whiteboard

![Left Join](../assets/leftJoin.PNG)
