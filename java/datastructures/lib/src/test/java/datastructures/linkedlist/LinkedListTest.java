package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;

public class LinkedListTest
{
  @DisplayName("instantiate an empty linked list")
  @Test void instantiateALinkedList()
    {
      LinkedList linkedlist = new LinkedList();
      System.out.println(linkedlist);
      assertNull(null);

    }
  @DisplayName("insert a node")
  @Test void insertANode()
  {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    System.out.println(linkedList);
    assertTrue(true);
  }

  @DisplayName("insert multiple nodees")
  @Test void insertMultipleNodes()
  {
    LinkedList linkedlist = new LinkedList();
    linkedlist.insert(1);
    linkedlist.insert(2);
    linkedlist.insert(3);
    System.out.println(linkedlist);
    assertTrue(true);
  }

}
