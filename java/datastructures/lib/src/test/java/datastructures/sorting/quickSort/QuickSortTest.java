package datastructures.sorting.quickSort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

  @Test
  @DisplayName("empty array")
  void quickSortEmptyArray(){
    QuickSort sort = new QuickSort();
    int[] myArr = {};
    assertThrows(IllegalArgumentException.class, () -> sort.quickSort(myArr, 0, myArr.length -1));
  }

  @Test
  @DisplayName("merge sort array of integers")
  void quickSort() {
    QuickSort sort = new QuickSort();
    int[] myArr = {8, 4, 23, 42, 16, 15};
    int[] sorted = sort.quickSort(myArr, 0, myArr.length -1);
    int[] expected = {4, 8, 15, 16, 23, 42};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("single integer value")
  void quickSortSingleValue() {
    QuickSort sort = new QuickSort();
    int[] myArr = {8};
    int[] sorted = sort.quickSort(myArr, 0, myArr.length -1);
    int[] expected = {8};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("duplicate values")
  void quickSortDuplicateValues() {
    QuickSort sort = new QuickSort();
    int[] myArr = {8, 8, 8, 8, 8};
    int[] sorted = sort.quickSort(myArr, 0, myArr.length -1);
    int[] expected = {8, 8, 8, 8, 8};
    assertArrayEquals(expected, sorted);
  }

  @Test
  @DisplayName("duplicate values")
  void quickSortNegativeValues() {
    QuickSort sort = new QuickSort();
    int[] myArr = {5, -3, -100, 25, 14};
    int[] sorted = sort.quickSort(myArr, 0, myArr.length -1);
    int[] expected = {-100, -3, 5, 14, 25};
    assertArrayEquals(expected, sorted);
  }
}
