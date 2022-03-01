package datastructures.stack;

import datastructures.linkedlist.LinkedList;



public class Stack<Type>{

  public Node<Type> top = null;
  public LinkedList<Type> linkedList;
  public int size = 0;

  public void push(Type value){
    Node<Type> newNode = new Node<>(value);
    size++;
    newNode.next = this.top;
    this.top = newNode;
  }

  public Type pop() {
    if (this.isEmpty()){
      throw new IllegalArgumentException("Stack is empty");
    }
    Type poppedValue = this.top.value;
    this.top = this.top.next;
    return poppedValue;
  }

  public Type peek() {
    if (this.isEmpty()){
      throw new IllegalArgumentException("cannot peek on an empty stack");
    } return this.top.value;
  }

  public boolean isEmpty(){
    return this.top == null;
  }
}
