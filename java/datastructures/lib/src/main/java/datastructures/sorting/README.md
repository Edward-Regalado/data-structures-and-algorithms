# Sorting

## Insertion Sort

## Assignment

- Review the pseudocode below, then trace the algorithm by stepping through the process with the provided sample array. Document your explanation by creating a blog article that shows the step-by-step output after each iteration through some sort of visual.

Once you are done with your article, code a working, tested implementation of Insertion Sort based on the pseudocode provided.

You may review an example document HERE

## Pseudocode

```
InsertionSort(int[] arr)

    FOR i = 1 to arr.length

      int j <-- i - 1
      int temp <-- arr[i]

      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1

      arr[j + 1] <-- temp
 ```

### Sample Arrays

- In your blog article, visually show the output of processing this input array:

`[8,4,23,42,16,15]`

For your own understanding, consider also stepping through these inputs:

Reverse-sorted: `[20,18,12,8,5,-2]`
Few uniques: `[5,12,7,5,5,7]`
Nearly-sorted: `[2,3,5,7,13,11]`

### Implementation

- Provide a visual step through for each of the sample arrays based on the provided pseudo code
- Convert the pseudo code into working code in your language
- Present a complete set of working tests

## Merge Sort

### Pseudo Code

```
Pseudo Code

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

### Sample Arrays

- In your blog article, visually show the output of processing this input array:

`[8,4,23,42,16,15]`

- For your own understanding, consider also stepping through these inputs:

Reverse-sorted: `[20,18,12,8,5,-2]`
Few uniques: `[5,12,7,5,5,7]`
Nearly-sorted: `[2,3,5,7,13,11]`

### Implementation

- Provide a visual step through for each of the sample arrays based on the provided pseudo code
- Convert the pseudo code into working code in your language
- Present a complete set of working tests

## Quick Sort

### Pseudo Code

```
ALGORITHM QuickSort(arr, left, right)
if left < right
// Partition the array by setting the position of the pivot value
DEFINE position <-- Partition(arr, left, right)
// Sort the left
QuickSort(arr, left, position - 1)
// Sort the right
QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
// set a pivot value as a point of reference
DEFINE pivot <-- arr[right]
// create a variable to track the largest index of numbers lower than the defined pivot
DEFINE low <-- left - 1
for i <- left to right do
if arr[i] <= pivot
low++
Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
DEFINE temp;
temp <-- arr[i]
arr[i] <-- arr[low]
arr[low] <-- temp
```

### Sample Arrays

In your blog article, visually show the output of processing this input array:

`[8,4,23,42,16,15]`

For your own understanding, consider also stepping through these inputs:

- Reverse-sorted: `[20,18,12,8,5,-2]`
- Few uniques: `[5,12,7,5,5,7]`
- Nearly-sorted: `[2,3,5,7,13,11]`
