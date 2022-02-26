package datastructures.linkedlist;

// import javax.sound.sampled.SourceDataLine;
import java.lang.reflect.Type;

public class LinkedList<Type> {

  // linked list fields are made up of type Node Class.
  Node<Type> head = null;
  Node<Type> tail = null;

  // helper function
  public int size() {
    int size = 0;
    Node<Type> current = head;
    while (current != null) {
      size++;
      current = current.next;
    }
    return size;
  }

  // instantiate and insert a new node
  public void insert(Type value) {
    Node<Type> newNode = new Node<>(value);
    newNode.next = head;
    head = newNode;
  }

  // check if value exist inside linked list
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

  @Override
  public String toString() {
    Node<Type> current = head;
    String str = "";
    while (current != null) {
      str += "{ " + current.value + " } -> ";
      current = current.next;
    }
    str += "null";
    return str;
  }

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

  // need to refactor and write tests
  public void insertBefore(Type beforeValue, Type value) {
    Node<Type> newNode = new Node<>(value);
    Node<Type>current = head;
    if (current == null) {
      current = newNode;
      return;
    }
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

//   need to refactor and write tests
  public void insertAfter(Type afterValue, Type value) {
    Node<Type> newNode = new Node<>(value);
    Node<Type> current = head;
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

  // need to refactor and write tests
//  public void kthValue(Type k){
//
//    int length = 0;
//    Node<Type> current = head;
//
//    while(current != null) {
//      current = head;
//      length++;
//    } if (length < k) {
//      System.out.println("The linked list does not have that many indexes");
//    }
//    current = head;
//    for (int i = 1; i < length - k + 1; i++){
//      current = current.next;
//    }
//    System.out.println("Kth Value: " + current);
//    }

//     not finished
//    public void zip(LinkedList listA, LinkedList listB) {
//
//      LinkedList zippedLinkedList = new LinkedList();
//      Node currentA = listA.head;
//      Node currentB = listB.head;
//
//    while (currentA != null and currentB != null){
//
//        // save node pointers
//        currentA = currentA.next;
//        currentB = currentB.next;
//
//        // work in progress...

  }
