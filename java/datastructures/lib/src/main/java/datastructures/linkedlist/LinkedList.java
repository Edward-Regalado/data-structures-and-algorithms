package datastructures.linkedlist;

// import javax.sound.sampled.SourceDataLine;

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

  public void insertBefore(int beforeValue, int value) {
    Node newNode = new Node(value);
    Node current = head;
//    if (current == null) {
//      current = newNode;
//      return;
//    }
    while (current.next != null) {
      if (current.next.value == beforeValue) {
        newNode.next = current.next;
        current.next = newNode;
        current = newNode.next;
      } else {
        current = current.next;
      }
    }
  }

  public void insertAfter(int afterValue, int value) {
    Node newNode = new Node(value);
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

  public void kthValue(int k){

    int length = 0;
    Node current = head;

    while(current != null) {
      current = head;
      length++;
    } if (length < k) {
      System.out.println("The linked list does not have that many indexes");
    }
    current = head;
    for (int i = 1; i < length - k + 1; i++){
      current = current.next;
    }
    System.out.println("Kth Value: " + current);
    }
  }




