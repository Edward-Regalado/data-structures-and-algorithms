package datastructures.tree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

  @Test
  @DisplayName("instantiate BST")
  void testInstantiateBST() {
    BinarySearchTree<Integer> bst = new BinarySearchTree<>();
    assertNotNull(bst);
  }

  @Test
  @DisplayName("add root node")
  void testAddRootNode() {
    BinarySearchTree<Integer> bst = new BinarySearchTree<>();
    bst.add(bst.root, 1);
    assertEquals(1, bst.root.value);
  }

  @Test
  @DisplayName("add 3 nodes")
  void testAddChildNodes() {
    BinarySearchTree<Integer> bst = new BinarySearchTree<>();
    bst.add(bst.root, 1);
    bst.add(bst.root, 2);
    bst.add(bst.root, 3);
    assertEquals(3, bst.root.right.right.value);
  }

  @Test
  @DisplayName("contains a value")
  void testContainsAValue() {
    BinarySearchTree<Integer> bst = new BinarySearchTree<>();
    bst.add(bst.root, 1);
    bst.add(bst.root, 2);
    bst.add(bst.root, 3);
    bst.add(bst.root, 4);
    bst.add(bst.root, 5);
    assertTrue(bst.contains(5, bst.root));
  }
}


