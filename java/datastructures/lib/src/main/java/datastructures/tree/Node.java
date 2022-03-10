package datastructures.tree;

public class Node<Type> {
  public Type value;
  public Node<Type> left;
  public Node<Type> right;

  public Node() {}

  public Node(Type value) {
    this.value = value;

  }
}
