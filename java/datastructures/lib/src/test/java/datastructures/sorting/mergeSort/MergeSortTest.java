package datastructures.sorting.mergeSort;

import datastructures.sorting.insertionSort.Sort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

  @Test
  @DisplayName("empty array")
  void mergeSortEmptyArray(){
    MergeSort sort = new MergeSort();
    int[] myArr = {};
    assertThrows(IllegalArgumentException.class, () -> sort.mergeSort(myArr));
  }

  @Test
  @DisplayName("merge sort array of integers")
  void mergeSort() {
    MergeSort sort = new MergeSort();
    int[] myArr = {4, 1, 5, 7, 8, 3};
    int[] sorted = sort.mergeSort(myArr);
    int[] expected = {1, 3, 4, 5, 7, 8};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("single integer value")
  void mergeSortSingleValue(){
    MergeSort sort = new MergeSort();
    int[] myArr = {5};
    int[] sorted = sort.mergeSort(myArr);
    int[] expected = {5};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("duplicate values")
  void mergeSortDuplicateValues(){
    MergeSort sort = new MergeSort();
    int[] myArr = {5, 5, 5, 5, 5};
    int[] sorted = sort.mergeSort(myArr);
    int[] expected = {5, 5, 5, 5, 5};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("negative integer values")
  void mergeSortNegativeValues() {
    MergeSort sort = new MergeSort();
    int[] myArr = {5, -3, -100, 25, 14};
    int[] sorted = sort.mergeSort(myArr);
    int[] expected = {-100, -3, 5, 14, 25};
    assertArrayEquals(expected, sorted);
  }
}
