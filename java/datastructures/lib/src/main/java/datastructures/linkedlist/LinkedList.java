package datastructures.linkedlist;

public class LinkedList {
  // linked list fields are made up of type Node Class.
  Node head = null;
  Node tail = null;
  // Node head; <- alt syntax defualts to null
  // Node tail; <- alt alt syntax defualts to null

  // instatitate and insert a new node
  public void insert(int value) {
    Node newNode = new Node(value); // instantiate new node

    if (head != null) { //
      newNode.next = head;
    } else {
      head = newNode;
    }

    // if (head == null){
    //     newNode = head;
    // } else {
    //   head = newNode.next;
    // }
  }

  public boolean includes(int value) {
    Node current = this.head;
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
      // str += current.value;
      current = current.next;
    }
    str += "null";
    return str;
  }
}
