package datastructures.stack;

public class Node<Type>
{
  Type value;
  Node<Type> next;

  Node(Type value)
  {
    this.value = value;
  }
}
