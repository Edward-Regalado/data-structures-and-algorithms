package datastructures.linkedlist;

public class LinkedList {

  // linked list fields are made up of type Node Class.
  Node head = null;
  Node tail = null;
//  int size = 0;

  // helper function
  public int size() {
    int size = 0;
    Node current = head;
    while (current != null) {
      size++;
      current = current.next;
    }
    return size;
  }

  // instantiate and insert a new node
  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;
  }

  // check if value exist inside linked list
  public boolean includes(int value) {
    Node current = this.head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    Node current = head;
    String str = "";
    while (current != null) {
      str += "{ " + current.value + " } -> ";
      current = current.next;
    }
    str += "null";
    return str;
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (head != null) {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    } else {
      head = newNode;
    }
  }

  public void insertBefore(int nextValue, int value) {
    Node newNode = new Node(value);
    Node current = head;
//    if (current == null) {
//      current = newNode;
//      return;
//    }
    while (current.next != null) {
      if (current.next.value == nextValue) {
        newNode.next = current.next;
        current.next = newNode;
        current = newNode.next;
      } else {
        current = current.next;
      }
    }
  }

  public void insertAfter(int value, int newValue) {
    Node newNode = new Node(newValue);
    Node current = head;
//    if (current == null){
//      current = newNode;
//    }
    while(current.next != null){
      if(current.next.value == value){
        newNode.next = current.next;
        current.next = newNode;
      } else current = current.next;
    }
  }
}


