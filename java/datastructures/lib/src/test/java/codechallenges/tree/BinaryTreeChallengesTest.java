package codechallenges.tree;

import datastructures.tree.BinaryTree;
import datastructures.tree.Node;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeChallengesTest {

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
}
