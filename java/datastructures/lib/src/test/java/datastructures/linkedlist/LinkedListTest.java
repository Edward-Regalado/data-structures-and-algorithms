package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
  @DisplayName("instantiate an empty linked list")
  @Test
  void instantiateALinkedList() {
    LinkedList linkedlist = new LinkedList();
    System.out.println(linkedlist);
    assertNull(null);
  }

  @DisplayName("insert a node")
  @Test
  void insertANode() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    System.out.println(linkedList);
    assertTrue(true);
  }

  @DisplayName("insert multiple nodes")
  @Test
  void insertMultipleNodes() {
    LinkedList linkedlist = new LinkedList();
    linkedlist.insert(1);
    linkedlist.insert(2);
    linkedlist.insert(3);
    linkedlist.insert(4);
    System.out.println(linkedlist.size());
    assertEquals(4, 4);
  }

  @DisplayName("string output")
  @Test
  void verifyStringOutput() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(4);
    assertEquals("{ 4 } -> { 3 } -> { 2 } -> { 1 } -> null", linkedList.toString());
  }

  @DisplayName("includes a value")
  @Test
  void valueExistInLinkedList() {
    LinkedList linkedlist = new LinkedList();
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    assertTrue(linkedList.includes(3));
  }

  @DisplayName("append to end")
  @Test
  void addNodeToEndOfLinkedList() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.append(3);
    assertEquals("{ 2 } -> { 1 } -> { 3 } -> null", linkedList.toString());
  }

  @DisplayName("insert after")
  @Test
  void insertValueAfter() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    linkedList.insert(2);
    linkedList.insert(3);
    linkedList.insert(5);
    linkedList.insertAfter(5, 4);
    System.out.println(linkedList.toString());
    assertEquals("{ 5 } -> { 3 } -> { 2 } -> { 1 } -> null", linkedList.toString());
  }

}

//  @DisplayName("insert after empty linked list")
//  @Test
//  void insertAfterEmptyLinkedList() {
//    LinkedList linkedList = new LinkedList();
//    linkedList.insertAfter(2, 1);
////    System.out.println(linkedList.toString());
//    assertEquals("{ 1 } -> null", linkedList.toString());
//  }

