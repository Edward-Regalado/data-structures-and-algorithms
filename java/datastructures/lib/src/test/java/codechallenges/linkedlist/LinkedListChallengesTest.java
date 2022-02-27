package codechallenges.linkedlist;

import datastructures.linkedlist.LinkedList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListChallengesTest {

  @Test
  @DisplayName("zip two linked list- both heads are not null")
  void testZipLists(){
    LinkedListChallenges zipped = new LinkedListChallenges();
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    LinkedList<Integer> linkedList2 = new LinkedList<>();
    linkedList1.append(1);
    linkedList1.append(3);
    linkedList1.append(5);
    linkedList2.append(2);
    linkedList2.append(4);
    linkedList2.append(6);

    System.out.println(zipped.zipList(linkedList1, linkedList2).toString());
    assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> null", zipped.zipList(linkedList1, linkedList2).toString());
  }

  @Test
  @DisplayName("zip two linked list- list one head is null")
  void testZipListsEmptyFirstListArgument() {
    LinkedListChallenges zipped = new LinkedListChallenges();
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    LinkedList<Integer> linkedList2 = new LinkedList<>();
    linkedList2.append(1);
    linkedList2.append(2);
    linkedList2.append(3);
    System.out.println(zipped.zipList(linkedList1, linkedList2).toString());
    assertEquals("{ 1 } -> { 2 } -> { 3 } -> null", zipped.zipList(linkedList1, linkedList2).toString());
  }

  @Test
  @DisplayName("zip two linked list: list two head is null")
  void testZipListsOneEmpty(){
    LinkedListChallenges zipped = new LinkedListChallenges();
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    LinkedList<Integer> linkedList2 = new LinkedList<>();
    linkedList1.append(1);
    linkedList1.append(2);
    linkedList1.append(3);
    System.out.println(zipped.zipList(linkedList1, linkedList2).toString());
    assertEquals("{ 1 } -> { 2 } -> { 3 } -> null", zipped.zipList(linkedList1, linkedList2).toString());
  }

  @Test
  @DisplayName("zip two nodes")
  void testZipTwoNodes(){
    LinkedListChallenges zipped = new LinkedListChallenges();
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    LinkedList<Integer> linkedList2 = new LinkedList<>();
    linkedList1.append(1);
    linkedList2.append(2);
    System.out.println(zipped.zipList(linkedList1, linkedList2).toString());
    assertEquals("{ 1 } -> { 2 } -> null", zipped.zipList(linkedList1, linkedList2).toString());
  }

}
