package datastructures.tree;

import datastructures.queue.Queue;
import java.util.ArrayList;


public class BinaryTree<Type> {

  public Node<Type> root;


  public ArrayList<Type> preOrderTraversal(Node<Type> node, ArrayList<Type> value){
    if(root == null){ root = node; }
    value.add(node.value);
    if(node.left != null) {this.preOrderTraversal(node.left, value);}
    if(node.right != null) {this.preOrderTraversal(node.right, value);}
    return value;
  }

  public ArrayList<Type> inOrderTraversal(Node<Type> node, ArrayList<Type> value){
    if(root == null){ root = node; }
    if(node.left != null) {this.preOrderTraversal(node.left, value);}
    value.add(node.value);
    if(node.right != null) {this.preOrderTraversal(node.right, value);}
    return value;
  }

  public ArrayList<Type> postOrderTraversal(Node<Type> node, ArrayList<Type> value){
    if(root == null){ root = node; }
    if(node.left != null) {this.postOrderTraversal(node.left, value);}
    if(node.right != null) {this.postOrderTraversal(node.right, value);}
    value.add(node.value);
    return value;
  }


  public ArrayList<Type> breadthFirst() {
    ArrayList<Type> list = new ArrayList<>();
    Queue<Node<Type>> queue = new Queue<>();
    queue.enqueue(root);
    Node<Type> front;
    while (!queue.isEmpty()) {
      front = queue.dequeue();
      list.add(front.value);
      if (front.left != null)
        queue.enqueue(front.left);
      if (front.right != null)
        queue.enqueue(front.right);
    }
    return list;
  }


  public Integer findMaxValue() {
    if (root == null)
      throw new IllegalArgumentException("tree is empty");
    Queue<Node<Integer>> queue = new Queue<>();
    queue.enqueue((Node<Integer>) root);
    Integer maxValue = (Integer)root.value;
    while(!queue.isEmpty()) {
      Node<Integer> current = queue.dequeue();
      if (current.value.compareTo(maxValue) > 0)
        maxValue = current.value;
      if (current.left != null)
        queue.enqueue(current.left);
      if (current.right != null)
        queue.enqueue(current.right);
    }
    return maxValue;
  }

}
