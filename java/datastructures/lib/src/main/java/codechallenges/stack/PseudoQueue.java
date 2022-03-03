package codechallenges.stack;

import datastructures.stack.Stack;

public class PseudoQueue<Type> {
    Stack<Type> s1 = new Stack<>();
    Stack<Type> s2 = new Stack<>();


  public void enqueue (Type value) {
      this.s1.push(value);
    }

  public void dequeue(){
    if(s1.isEmpty() && s2.isEmpty()) {
      throw new IllegalArgumentException("queue is empty");
    } else if (s2.isEmpty()) {
      while (!s1.isEmpty()) {
        Type top = s1.pop();
        s2.push(top);
      }
    }
  }

  @Override
  public String toString() {
    return "pseudoQueue{" +
      ", s1=" + s1 +
      ", s2=" + s2 +
      '}';
  }
}
