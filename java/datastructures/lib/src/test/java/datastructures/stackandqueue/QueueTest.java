package datastructures.stackandqueue;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
  @Test
  void instantiateNewQueue(){
    Queue<Type> queue = new Queue<>();
    System.out.println(queue);
    assertTrue(true);
  }
}
