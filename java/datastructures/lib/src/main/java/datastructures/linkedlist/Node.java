package datastructures.linkedlist;

public class Node<Type> {
  // node fields - the attributes of our Node Class.
  public Type value;
  public Node<Type> next = null;

  // node constructor - gets called when you instantiate a new Node(value);
  Node(Type value) {
    this.value = value;
  }
}
