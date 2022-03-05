package datastructures.tree;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class BinaryTree {

//  ArrayList<Integer> elementsPre = new ArrayList<>();
//  ArrayList<Integer> elementsIn = new ArrayList<>();
  ArrayList<Integer> elements = new ArrayList<>();

  public ArrayList<Integer> preOrderTraversal(Node root){
    if(root == null){
      return elements;
    }
    elements.add(root.value);
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
    System.out.println("preorder: " + elements);
    return elements;
  }

  public ArrayList<Integer> inOrderTraversal(Node root){
    if(root == null){
//      System.out.println("empty tree");
      throw new NullPointerException();
    }
    preOrderTraversal(root.left);
    elements.add(root.value);
    preOrderTraversal(root.right);
    return elements;
  }

  public ArrayList<Integer> postOrderTraversal(Node root){
    if(root == null){
      return elements;
    }
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
    elements.add(root.value);
    return elements;
  }

}
