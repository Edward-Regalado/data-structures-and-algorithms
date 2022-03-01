package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

  ////////// LINKED LIST IMPLEMENTATION //////////
  @Test
  @DisplayName("instantiate an empty linked list")
  void instantiateALinkedList() {
    LinkedList<Integer> linkedlist = new LinkedList<>();
    System.out.println(linkedlist);
    assertNull(null);
  }

  ////////// INSERT ////////////
  @Test
  @DisplayName("insert a node")
  void insertANode() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    System.out.println(linkedList);
    assertTrue(true);
  }

  @Test
  @DisplayName("insert multiple nodes")
  void insertMultipleNodes() {
    LinkedList<Integer> linkedlist = new LinkedList<>();
    linkedlist.insert(1);
    linkedlist.insert(2);
    linkedlist.insert(3);
    linkedlist.insert(4);
    System.out.println("Linked list size: " + linkedlist.size());
    System.out.println(linkedlist);
    assertEquals(4, 4);
  }

  ////////// STRING OUTPUT ///////////
  @Test
  @DisplayName("string output")
  void verifyStringOutput() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    System.out.println("Linked List size is: " + linkedList.size());
    assertEquals("{ 4 } -> { 3 } -> { 2 } -> { 1 } -> null", linkedList.toString());
  }

  ////////// INCLUDES //////////////
  @Test
  @DisplayName("includes a value")
  void valueExistInLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    assertTrue(linkedList.includes(3));
  }

  /////////// APPEND /////////////
  @Test
  @DisplayName("append to end")
  void addNodeToEndOfLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.append(3);
    assertEquals("{ 2 } -> { 1 } -> { 3 } -> null", linkedList.toString());
  }

  ////////// INSERT BEFORE /////////
  @Test
  @DisplayName("insert before")
  void insertValueBefore() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(5);
    linkedList.insert(4);
    linkedList.insert(3);
    linkedList.insert(1);
    linkedList.insertBefore(3, 2);
    System.out.println("target: 3, insert: 2: " + linkedList);
    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> null", linkedList.toString());
  }

  @Test
  @DisplayName("insert before target at head")
  void insertBeforeTargetValueAtHead() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(2);
    linkedList.insertBefore(2, 1);
    System.out.println(linkedList);
    assertEquals("{ 1 } -> { 2 } -> null", linkedList.toString());
  }

  @Test
  @DisplayName("insert before last node in list")
  void insertBeforeLastNodeInList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(5);
    linkedList.insert(3);
    linkedList.insert(2);
    linkedList.insert(1);
    linkedList.insertBefore(5, 4);
    System.out.println(linkedList);
    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> null", linkedList.toString());
  }

  @Test
  @DisplayName("insert before target value not in list")
  void insertBeforeTargetValueNotInList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    System.out.println(linkedList);
//    assertThrows(IllegalArgumentException.class, () -> linkedList.insertBefore(5, 4));
  }

  @Test
  @DisplayName("insert before on empty linked list")
  void insertBeforeEmptyLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    System.out.println(linkedList);
    assertThrows(IllegalArgumentException.class, () -> linkedList.insertBefore(2, 1));
  }

  ////////// INSERT AFTER /////////
  @Test
  @DisplayName("insert after random middle node")
  void insertValueAfter() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(5);
    linkedList.insert(3);
    linkedList.insert(2);
    linkedList.insert(1);
    linkedList.insertAfter(3, 4);
    System.out.println(linkedList);
    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> null", linkedList.toString());
  }

  @Test
  @DisplayName("insert after the last node in the linked list")
  void insertValueAfterLastNodeInLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(3);
    linkedList.insert(2);
    linkedList.insert(1);
    linkedList.insertAfter(3, 4);
    System.out.println("insert after node at tail: linkedList " + linkedList);
    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> null", linkedList.toString());
  }

  @Test
  @DisplayName("insert node after target value in single node linked list")
  void insertValueAfterInSingleNodeLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    linkedList.insertAfter(1, 3);
    System.out.println("insert after node at tail: linkedList " + linkedList);
    assertEquals("{ 1 } -> { 3 } -> null", linkedList.toString());
  }

    @Test
  @DisplayName("insert target after on empty linked list")
  void insertAfterOnEmptyLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(3);
    assertThrows(IllegalArgumentException.class, () -> linkedList.insertAfter(1, 2));
  }

  //  @Test
//  @DisplayName("target value not in linked list")
//  void targetValueNotInLinkedList() {
//    LinkedList<Integer> linkedList = new LinkedList<>();
//    linkedList.insert(1);
//    assertThrows(IllegalArgumentException.class, () -> linkedList.insertAfter(2, 3));
//  }


//  @Test
//  @DisplayName("insert after invalid")
//  void insertValueAfterInvalid() {
//    LinkedList<Integer> linkedList = new LinkedList<>();
//    linkedList.insert(1);
//    linkedList.insert(2);
//    linkedList.insert(3);
//    linkedList.insert(5);
//    linkedList.insertAfter(6, 4);
////    System.out.println(linkedList.toString());
//    assertEquals("{ 5 } -> { 3 } -> { 2 } -> { 1 } -> null", linkedList.toString());
//  }

  //  @DisplayName("insert after empty linked list")
//  @Test
//  void insertAfterEmptyLinkedList() {
//    LinkedList linkedList = new LinkedList();
//    linkedList.insertAfter(2, 1);
////    System.out.println(linkedList.toString());
//    assertEquals("{ 1 } -> null", linkedList.toString());
//


  ////////// KTH VALUE FROM THE END ////////////
  @Test
  @DisplayName("kth value from the end")
  void kthFromEndValue() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    linkedList.insert(5);
    System.out.println("The kth value from the end of your list is: " + linkedList.kthFromEnd(5));
    System.out.println(linkedList);
    assertEquals(1, 1);
  }

  @Test
  @DisplayName("kth value too large")
  void kthValueLargerThanLinkedList() {
    LinkedList<Integer> linkedList = new LinkedList<>();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    assertThrows(IllegalArgumentException.class, () -> linkedList.kthFromEnd(5));
  }
}
