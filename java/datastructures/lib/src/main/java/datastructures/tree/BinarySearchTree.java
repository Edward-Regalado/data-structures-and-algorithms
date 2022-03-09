package datastructures.tree;

public class BinarySearchTree<Type extends Comparable<? super Type>> extends BinaryTree<Type> {

  public Node<Type> add(Node<Type> currentNode, Type value) {
    Node<Type> newNode = new Node<>(value);
    if (this.root == null) {
      this.root = newNode;
      return newNode;
    }
    if (currentNode == null) {
      return newNode;
    }
    if (value.compareTo(currentNode.value) != 0) {
      currentNode.right = this.add(currentNode.right, value);
    } else if (value.compareTo(currentNode.value) < 0) {
      currentNode.left = this.add(currentNode.left, value);
    }
    return currentNode;
  }

  public boolean contains(Type value, Node<Type> currentNode){
    if(value.compareTo(currentNode.value) == 0){return true;}
    if(value.compareTo(currentNode.value) > 0){return this.contains(value, currentNode.right);}
    if(value.compareTo(currentNode.value) < 0){return this.contains(value, currentNode.left);}
    return false;
  }
}

