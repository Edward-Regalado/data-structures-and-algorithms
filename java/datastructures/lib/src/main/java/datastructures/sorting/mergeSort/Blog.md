# Merge Sort

- Merge Sort is a divide and conquer sorting algorithm.
- It works by recursively dividing the problem into two or more sub-problems of the same or related type until they become simple enough to be solved.
- The solutions to the sub-problems are then reassembled to return a solution to the original problem.
- We'll be using an array and we'll start by breaking down that array into equals parts, then combine those sub-arrays in a sorted manner.

### Pseudo Code

```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length

    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1

        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left
```
## Step 1

- If we only have one element in our array, it's already sorted. Simply return the array.
- For our example, we start with an unsorted array/list of integers.

![Unsorted Array](assets/initial.png)

## Step 2

- Divide the array recursively into two halves until we end up with single element arrays.

![Unsorted Array](assets/s2.png)

## Step 3

- Merge the smaller arrays into a new array in sorted order.

![Unsorted Array](assets/s3.png)

### Efficiency

- Time Complexity: O(Log n * n)
- Additional Space: O(n)
