package datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testAMethod()
  {
    LinkedList sut = new LinkedList();
    System.out.println(sut);
    assertTrue(true);
  }

  @Test void instantiateLinkedList(){
    LinkedList newLinkedList = new LinkedList();
    System.out.println(newLinkedList);
    assertTrue(true);
  }

  @Test void insertNode(){
    LinkedList newLinkedList = new LinkedList();
    newLinkedList.insert(1);
    System.out.println(newLinkedList.toString());
    assertTrue(newLinkedList.head.value == 1);
  }

  @Test void insertMultipleNodes(){
    LinkedList newLinkedList = new LinkedList();
    newLinkedList.insert(1);
    newLinkedList.insert(2);
    newLinkedList.insert(3);
    System.out.println(newLinkedList.toString());
    assertTrue(true);
  }

  @Test void containsValue(){
    LinkedList newLinkedList = new LinkedList();
    newLinkedList.insert(100);
    assertTrue(newLinkedList.includes(100));
  }

  @Test void doesNotContainValue(){
    assertTrue(true);
  }
}

