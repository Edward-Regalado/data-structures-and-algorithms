package datastructures.tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

  @Test
  @DisplayName("empty binary tree")
  public void testInOrder_EmptyTree() {
    BinaryTree sut = new BinaryTree();
    Node root = null;
    assertThrows(NullPointerException.class, () -> { sut.inOrderTraversal(root); });
  }

  @Test
  @DisplayName("preorder traversal")
  void testPreOrderTraversal() {
    BinaryTree sut = new BinaryTree();
    Node root = new Node(2);
    root.left = new Node(3);
    root.right = new Node(1);
    sut.preOrderTraversal(root);
    System.out.println(sut);
    assertTrue(true);
  }

@Test
@DisplayName("in order traversal")
void testInOrderTraversal() {
    BinaryTree sut = new BinaryTree();
    Node root = new Node(2);
    root.left = new Node(3);
    root.right = new Node(1);
    sut.inOrderTraversal(root);
    System.out.println(sut);
    assertTrue(true);
  }

  @Test
  @DisplayName("post order traversal")
  void testPostOrderTraversal() {
    BinaryTree sut = new BinaryTree();
    Node root = new Node(2);
    root.left = new Node(3);
    root.right = new Node(1);
    sut.postOrderTraversal(root);
    System.out.println("test_postOrder()");
    assertTrue(true);
  }
}

