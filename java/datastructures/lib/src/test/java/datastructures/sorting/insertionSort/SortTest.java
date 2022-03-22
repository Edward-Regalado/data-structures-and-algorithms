package datastructures.sorting.insertionSort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {


  @Test
  @DisplayName("empty array")
  void insertioSortEmptyArray(){
    Sort insertionSort = new Sort();
    int[] myArr = {};
    assertThrows(IllegalArgumentException.class, () ->insertionSort.insertSort(myArr));
  }

  @Test
  @DisplayName("array of integers")
  void insertionSort() {
    Sort insertionSort = new Sort();
    int[] myArr = {1, 4, 5, 7, 8, 3};
    int[] sorted = insertionSort.insertSort(myArr);
    int[] expected = {1, 3, 4, 5, 7, 8};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("single integer value")
  void insertionSortSingleValue() {
    Sort insertionSort = new Sort();
    int[] myArr = {5};
    int[] sorted = insertionSort.insertSort(myArr);
    int[] expected = {5};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("duplicate values")
  void insertionSortDuplicateValues() {
    Sort insertionSort = new Sort();
    int[] myArr = {5, 5, 5, 5, 5};
    int[] sorted = insertionSort.insertSort(myArr);
    int[] expected = {5, 5, 5, 5, 5};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("negative integer values")
  void insertionSortNegativeValues() {
    Sort insertionSort = new Sort();
    int[] myArr = {5, -3, -100, 25, 14};
    int[] sorted = insertionSort.insertSort(myArr);
    int[] expected = {-100, -3, 5, 14, 25};
    assertArrayEquals(expected, sorted);
  }
}
