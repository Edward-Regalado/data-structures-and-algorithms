package datastructures.queue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
  @Test
  @DisplayName("enqueue into a queue")
  void enqueueSingleNodeIntoQueue(){
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    System.out.println(queue);
    assertTrue(true);
  }

  @Test
  @DisplayName("enqueue multiple values into a queue")
  void enqueueMultiNodesIntoQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println(queue);
    assertTrue(true);
  }

  @Test
  @DisplayName("dequeue out of the queue the expected value")
  void dequeueValueFromQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    System.out.println("First in, First out value in the queue is " + queue.peek());
    assertEquals(1, queue.dequeue());
  }

  @Test
  @DisplayName("peek into a queue and see the expected value")
  void peekAtFrontValueInQueue() {
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println("The front of the queue is " + queue.peek());
    assertEquals(1, queue.peek());
  }

  @Test
  @DisplayName("successfully empty queue after multiple dequeues")
  void emptyQueueAfterMultiDequeues(){
    Queue<Integer> queue = new Queue<>();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.dequeue();
    queue.dequeue();
    assertThrows(IllegalArgumentException.class, queue::peek);
    assertTrue(queue.isEmpty());
  }

  @Test
  @DisplayName("successfully instantiate an empty queue")
  void instantiateAnEmptyQueue(){
    Queue<Integer> queue = new Queue<>();
    System.out.println("created an empty queue: " + queue);
    assertTrue(queue.isEmpty());
  }

  @Test
  @DisplayName("calling deque or peek on empty queue raises exception")
  void raiseExceptionOnEmptyQueue(){
    Queue<Integer> queue = new Queue<>();
    assertThrows(IllegalArgumentException.class, queue::dequeue);
    assertThrows(IllegalArgumentException.class, queue::peek);
  }

}
