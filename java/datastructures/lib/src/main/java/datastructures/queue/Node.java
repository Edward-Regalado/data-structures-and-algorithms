package datastructures.queue;

public class Node<Type> {
  public Type value;
  public Node<Type> next = null;

  public Node(Type value) {
    this.value = value;
  }
}
