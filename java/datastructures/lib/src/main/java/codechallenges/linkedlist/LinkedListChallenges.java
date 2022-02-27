package codechallenges.linkedlist;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

public class LinkedListChallenges {

  public LinkedList<Integer> zipList(LinkedList<Integer> list1, LinkedList<Integer> list2) {

    if (list1.head == null || list2.head == null){
      if (list1.head == null){
        return list2;
      } else
        return list1;
    }
    Node<Integer> curr1 = list1.head;
    Node<Integer> curr2 = list2.head;

    while (curr1 != null && curr2 != null) {
      Node<Integer> curr1TempNext = curr1.next;
      Node<Integer> curr2TempNext = curr2.next;

      curr2.next = curr1TempNext;
      curr1.next = curr2;

      curr1 = curr1TempNext;
      curr2 = curr2TempNext;
    }
    list2.head = curr2;
    return list1;
  }

}

