package datastructures.queue;

public class Queue<T>{
  Node<T> front = null;
  Node<T> rear = null;


  public void enqueue(T value) {
    Node<T> newNode = new Node<>(value);
    if (this.front == null) {
      this.front = newNode;
    } else {
      this.rear.next = newNode;
    }
    this.rear = newNode;
  }

  public T dequeue() {
    T node;
    if(this.isEmpty()){
     throw new IllegalArgumentException("Queue is empty");
   }
   node = this.front.value;
   this.front = this.front.next;
   if (this.isEmpty()){
     this.rear = null;
   } return node;
  }

  public T peek() {
    if(this.isEmpty()) {
      throw new IllegalArgumentException("Queue is empty");
    } return this.front.value;
  }

 public boolean isEmpty(){
    return this.front == null;}
}
