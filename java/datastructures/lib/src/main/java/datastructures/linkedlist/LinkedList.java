package datastructures.linkedlist;

// import javax.sound.sampled.SourceDataLine;

public class LinkedList<Type> {

  // linked list fields are made up of type Node Class Object- this is a reference type object.
  public Node<Type> head = null;

  ///////// INSERT ///////////
  public void insert(Type value) {
    Node<Type> newNode = new Node<>(value);
    newNode.next = head;
    head = newNode;
  }

  ////////// INCLUDES ////////////
  public boolean includes(Type value) {
    Node<Type> current = this.head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  ////////// APPEND TO THE END /////////
  public void append(Type value) {
    Node<Type> newNode = new Node<>(value);
    if (head != null) {
      Node<Type> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    } else {
      head = newNode;
    }
  }

  ////////// INSERT BEFORE /////////////
  public void insertBefore(Type targetValue, Type insertValue) {
    Node<Type> newNode = new Node<>(insertValue);
    Node<Type> current = head;
    if (current == null) {
      throw new IllegalArgumentException("empty list");
    }
    if (current.value == targetValue) {
      insert(insertValue);
    }
    while (current.next != null) {
      if (current.next.value == targetValue) {
        newNode.next = current.next;
        current.next = newNode;
        break;
      } current = current.next;
      if (current.next == null) throw new IllegalArgumentException("target value not in list");
    }
  }

  ////////// INSERT AFTER ////////////
  public void insertAfter(Type targetValue, Type insertValue) {
    Node<Type> newNode = new Node<>(insertValue);
    Node<Type> current = head;
    if (current == null){
      throw new IllegalArgumentException("empty list");
    }
    while (current != null) {
      if (current.value == targetValue) {
        newNode.next = current.next;
        current.next = newNode;
        break;
      } else current = current.next;
    }
    if (current == null) throw new IllegalArgumentException("target value not in list");
  }

  ///////// KTH FROM END ////////
  public int kthFromEnd(int k) {
    int n = 0;
    Node<Type> current = head;
    while (current != null) { // traverse to linked list to get the length
      current = current.next; // move curr pointer
      n++; // increment counter
    } // exit while loop
    if (k > n) { // check if k is larger than our list: throw error
      throw new IllegalArgumentException(k + " k value is too large");
    }
    // base case: make sure the linked list is less than or equal to k value
    current = head; // reset head
    int len = n - k;
    for (int i = 0; i < len; i++) {
      current = current.next; // move curr pointer
    }
    assert current != null;
    return (int) current.value;
  }

  //////// PRINT LINKED LIST ////////
  @Override
  public String toString() {
    Node<Type> current = head;
    StringBuilder str = new StringBuilder();
    while (current != null) {
      str.append("{ ").append(current.value).append(" } -> ");
      current = current.next;
    }
    str.append("null");
    return str.toString();
  }

  //////// GET SIZE //////////
  public int size() {
    int size = 0;
    Node<Type> current = head;
    while (current != null) {
      size++;
      current = current.next;
    }
    return size;
  }
}


