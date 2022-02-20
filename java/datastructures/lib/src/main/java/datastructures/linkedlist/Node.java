package datastructures.linkedlist;

public class Node {
  // node fields - the attributes of our Node Class.
  public int value;
  public Node next = null;

  // node constructor - gets called when you instantiate a new Node(value);
  Node(int value) {
    this.value = value;
  }
}
