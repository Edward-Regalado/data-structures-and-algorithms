package datastructures.stack;

public class Node<Type>
{
  public Type value;
  Node<Type> next;

  Node(Type value)
  {
    this.value = value;
  }
}
