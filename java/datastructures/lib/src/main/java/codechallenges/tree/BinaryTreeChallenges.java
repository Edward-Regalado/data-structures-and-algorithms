package codechallenges.tree;

import datastructures.queue.Queue;
import datastructures.tree.Node;
import datastructures.tree.BinaryTree;
import java.util.ArrayList;

public class BinaryTreeChallenges<Type> {

  public Node<Type> root;

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

}
