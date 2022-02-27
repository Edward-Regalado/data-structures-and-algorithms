package datastructures.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
  @Test
  @DisplayName("push onto a stack")
  void pushOntoAStack(){
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    System.out.println(stack);
    assertTrue(true);
  }

  @Test
  @DisplayName("push multiple nodes onto a stack")
  void pushMultiNodesOntoStack(){
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    System.out.println("successfully added multi nodes to stack. Top value is: " + stack.peek());
    assertTrue(true);
  }

  @Test
  @DisplayName("pop node off of stack")
  void popNodesOffStack(){
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println("Top Value to be popped is: " + stack.peek());
    assertEquals(3, stack.pop());
    System.out.println("The new top value is: " + stack.peek());
    assertEquals(2, stack.peek());
  }

  @Test
  @DisplayName("successfully empty a stack after multiple pops")
  void successfullyEmptyAStack(){
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.pop();
    stack.pop();
    assertTrue(stack.isEmpty());
  }

  @Test
  @DisplayName("peek at the next Node in the stack")
  void peekAtTheNextValueInTheStack(){
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println("The next value below the top node is: " + stack.top.next.value);
    assertEquals(2, stack.top.next.value);
  }

  @Test
  @DisplayName("instantiate an empty stack")
  void instantiateAnEmptyStack(){
    Stack<Integer> stack = new Stack<>();
    System.out.println("created an empty statck: " + stack);
    assertTrue(stack.isEmpty());
  }

  @Test
  @DisplayName("peek top value in stack")
  void peekTopValueOfStack(){
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    System.out.println("Top Value in Stack is: " + stack.peek());
    assertTrue(true);
  }

  @Test
  @DisplayName("calling pop or peek on empty stack raises exception")
  void raiseExceptoinOnEmptyStack(){
    Stack<Integer> stack = new Stack<>();
    assertThrows(IllegalArgumentException.class, stack::pop);
    assertThrows(IllegalArgumentException.class, stack::peek);
  }

  @Test
  @DisplayName("check if stack is empty")
  void checkIfStackIsEmpty(){
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    int popped = stack.pop();
    System.out.println("Popped value is: " + popped + " Is the stack empty? " + stack.isEmpty());
    assertTrue(stack.isEmpty());
  }

}
