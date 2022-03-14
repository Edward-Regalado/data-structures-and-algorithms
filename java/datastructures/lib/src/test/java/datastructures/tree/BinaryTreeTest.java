package datastructures.tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

  @Test
  @DisplayName("empty tree")
  void testEmptyTree(){
    BinaryTree<Integer> tree = new BinarySearchTree<>();
    assertNotNull(tree);
  }

  @Test
  @DisplayName("insert 3 ints nodes")
  void testInstantiateInteger() {
    BinaryTree<Integer> tree = new BinaryTree<>();
    Node<Integer> n1 = new Node<>(1);
    Node<Integer> n2 = new Node<>(2);
    Node<Integer> n3 = new Node<>(3);
    tree.root = n1;
    tree.root.left = n2;
    tree.root.right = n3;
    assertEquals(tree.root.value, 1);
    assertEquals(tree.root.left.value, 2);
    assertEquals(tree.root.right.value, 3);
  }

  @Test
  @DisplayName("preorder traversal")
  void testPreorderTraversalInteger() {
    BinaryTree<Integer> tree = new BinarySearchTree<>();
    Node<Integer> n1 = new Node<>(1);
    Node<Integer> n2 = new Node<>(2);
    Node<Integer> n3 = new Node<>(3);
    Node<Integer> n4 = new Node<>(4);
    Node<Integer> n5 = new Node<>(5);
    Node<Integer> n6 = new Node<>(6);
    Node<Integer> n7 = new Node<>(7);

    tree.root = n1;
    tree.root.left = n2;
    tree.root.right = n3;
    tree.root.left.left = n4;
    tree.root.left.right = n5;
    tree.root.right.left = n6;
    tree.root.right.right = n7;

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3, 6, 7));
    ArrayList<Integer> list = new ArrayList<>();
    assertEquals(expected, tree.preOrderTraversal(n1, list));
  }


  @Test
  @DisplayName("inorder traversal")
  void testInorderTraversalInteger() {
    BinaryTree<Integer> tree = new BinarySearchTree<>();
    Node<Integer> n1 = new Node<>(1);
    Node<Integer> n2 = new Node<>(2);
    Node<Integer> n3 = new Node<>(3);
    Node<Integer> n4 = new Node<>(4);
    Node<Integer> n5 = new Node<>(5);
    Node<Integer> n6 = new Node<>(6);
    Node<Integer> n7 = new Node<>(7);

    tree.root = n1;
    tree.root.left = n2;
    tree.root.right = n3;
    tree.root.left.left = n4;
    tree.root.left.right = n5;
    tree.root.right.left = n6;
    tree.root.right.right = n7;

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 4, 5, 1, 3, 6, 7));
    ArrayList<Integer> list = new ArrayList<>();
    assertEquals(expected, tree.inOrderTraversal(n1, list));
  }

  @Test
  @DisplayName("inorder traversal")
  void testPostorderTraversalInteger() {
    BinaryTree<Integer> tree = new BinarySearchTree<>();
    Node<Integer> n1 = new Node<>(1);
    Node<Integer> n2 = new Node<>(2);
    Node<Integer> n3 = new Node<>(3);
    Node<Integer> n4 = new Node<>(4);
    Node<Integer> n5 = new Node<>(5);
    Node<Integer> n6 = new Node<>(6);
    Node<Integer> n7 = new Node<>(7);

    tree.root = n1;
    tree.root.left = n2;
    tree.root.right = n3;
    tree.root.left.left = n4;
    tree.root.left.right = n5;
    tree.root.right.left = n6;
    tree.root.right.right = n7;

    ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 2, 6, 7, 3, 1));
    ArrayList<Integer> list = new ArrayList<>();
    assertEquals(expected, tree.postOrderTraversal(n1, list));
  }

  @Test
  @DisplayName("insert 3 string nodes")
  void testInstantiateStrings() {
    BinaryTree<String> tree = new BinaryTree<>();
    Node<String> n1 = new Node<>("a");
    Node<String> n2 = new Node<>("b");
    Node<String> n3 = new Node<>("c");
    tree.root = n1;
    tree.root.left = n2;
    tree.root.right = n3;
    assertEquals("a", tree.root.value);
    assertEquals("b", tree.root.left.value);
    assertEquals("c", tree.root.right.value);
  }

  @Test
  @DisplayName("BFS Strings")
  void testBreathFirstSearchStrings() {
    BinaryTree<String> tree = new BinaryTree<>();
    Node<String> n1 = new Node<>("a");
    Node<String> n2 = new Node<>("b");
    Node<String> n3 = new Node<>("c");
    tree.root = n1;
    tree.root.left = n2;
    tree.root.right = n3;
    System.out.println(tree.breadthFirst());
  }

  @Test
  @DisplayName("BFS Integers")
  void testBreathFirstSearchIntegers() {
    BinaryTree<Integer> tree = new BinaryTree<>();
    Node<Integer> n1 = new Node<>(1);
    Node<Integer> n2 = new Node<>(2);
    Node<Integer> n3 = new Node<>(3);
    Node<Integer> n4 = new Node<>(4);
    Node<Integer> n5 = new Node<>(5);
    tree.root = n1;
    tree.root.left = n2;
    tree.root.right = n3;
    tree.root.left.left = n4;
    tree.root.left.right = n5;
    System.out.println(tree.breadthFirst());
  }

  @Test
  @DisplayName("find max value 1-5")
  void testFindMaxValue() {
    BinarySearchTree<Integer> bt = new BinarySearchTree<>();
    bt.add(bt.root,1);
    bt.add(bt.root,2);
    bt.add(bt.root,3);
    bt.add(bt.root,4);
    bt.add(bt.root,5);
    System.out.println("Max Value in your Tree is: " + bt.findMaxValue());
    assertEquals(5, bt.findMaxValue());
  }

  @Test
  @DisplayName("find max value 1-99")
  void testFindMaxValueLarge() {
    BinarySearchTree<Integer> bt = new BinarySearchTree<>();
    bt.add(bt.root, 50);
    bt.add(bt.root, 1);
    bt.add(bt.root, 34);
    bt.add(bt.root, 42);
    bt.add(bt.root, 99);
    System.out.println("Max Value in your Tree is: " + bt.findMaxValue());
    assertEquals(99, bt.findMaxValue());
  }

  @Test
  @DisplayName("find max value empty tree")
  void testFindMaxValueEmptyTree(){
    BinarySearchTree<Integer> bt = new BinarySearchTree<>();
    assertThrows(IllegalArgumentException.class, bt::findMaxValue);
  }

}


