package codechallenges.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class pesudoQueueTest {

  @Test
  @DisplayName("instantiate an empty stack")
  void instantiateApseudoQueue(){
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    System.out.println("empty pseudo " + pseudoQueue);
  }

  @Test
  @DisplayName("enqueue into pseudo queue")
  void enqueueIntoStack(){
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    pseudoQueue.enqueue(2);
    System.out.println("pseudo queue: " + pseudoQueue);
    assertEquals(2, pseudoQueue.s1.peek());
  }

  @Test
  @DisplayName("dequeue off stack one")
    void dequeueOffPseudoQueue() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    pseudoQueue.enqueue(2);
    pseudoQueue.enqueue(3);
    pseudoQueue.dequeue();
    assertEquals(1, pseudoQueue.s2.peek());
  }

  @Test
  @DisplayName("dequeue entire stack")
    void dequeueEntireStack() {
    PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();
    pseudoQueue.enqueue(1);
    pseudoQueue.enqueue(2);
    pseudoQueue.enqueue(3);
    pseudoQueue.dequeue();
    pseudoQueue.dequeue();
    pseudoQueue.dequeue();
    assertEquals(1, pseudoQueue.s2.peek());
  }

}
