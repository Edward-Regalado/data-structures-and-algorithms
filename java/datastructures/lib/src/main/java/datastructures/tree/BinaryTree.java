package datastructures.tree;


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
}
