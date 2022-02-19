package datastructures.linkedlist;

public class LinkedList {
  Node head = null;
  Node tail = null;

  public void insert(int value) {
    Node newNode = new Node(value);
    if (head != null) {
      newNode.next = head;
    } else {
      head = newNode;
    }

  }

  public boolean includes(int value) {
    Node current = head;
    while (current != null){
      if(current.value == value){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString(){
    String str = "";
    Node current = head;
    while(current != null) {
      str += "{ " + current.value + " } -> ";
      current = current.next;
    }
    str += "null";
    return str;
  }

}

