package datastructures.queue;

public class Queue<Type>{
  Node<Type> front = null;
  Node<Type> rear = null;


  public void enqueue(Type value) {
    Node<Type> newNode = new Node<>(value);
    if (this.front == null) {
      this.front = newNode;
    } else {
      this.rear.next = newNode;
    }
    this.rear = newNode;
  }

  public Type dequeue() {
    Type node;
    if(this.isEmpty()){
     throw new IllegalArgumentException("Queue is empty");
   }
   node = this.front.value;
   this.front = this.front.next;
   if (this.isEmpty()){
     this.rear = null;
   } return node;
  }

  public Type peek() {
    if(this.isEmpty()) {
      throw new IllegalArgumentException("Queue is empty");
    } return this.front.value;
  }

 public boolean isEmpty(){
    return this.front == null;}
}
