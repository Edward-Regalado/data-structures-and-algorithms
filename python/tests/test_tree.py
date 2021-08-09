# @pytest.mark.skip("pending")
from code_challenges.trees.tree import Node, BinaryTree, BinarySearchTree
import pytest

#//////////// In-Class Test from 401 Repo ////////////

def test_node_has_value():
    node = Node("apple")
    assert node.value == "apple"


# @pytest.mark.skip("pending")
def test_node_has_left_of_none():
    node = Node("apple")
    assert node.left is None


# @pytest.mark.skip("pending")
def test_node_has_right_of_none():
    node = Node("apple")
    assert node.right is None


# @pytest.mark.skip("pending")
def test_create_binary_tree():
    tree = BinaryTree()
    assert tree


# @pytest.mark.skip("pending")
def test_binary_tree_has_root():
    tree = BinaryTree()
    assert tree.root is None


# @pytest.mark.skip("pending")
def test_create_binary_search_tree():
    tree = BinarySearchTree()
    assert tree


#//////////////// Binaary Tree Tests //////////////////

def test_pre_order_on_empty_tree(empty_tree):
    actual = empty_tree.pre_order()
    expected = "Empty Tree"
    assert actual == expected

def test_in_order_on_empty_tree(empty_tree):
    actual = empty_tree.in_order()
    expected = "Empty Tree"
    assert actual == expected

def test_post_order_on_empty_tree(empty_tree):
    actual = empty_tree.post_order()
    expected = "Empty Tree"
    assert actual == expected

def test_pre_order(letter_tree):
    actual = letter_tree.pre_order()
    expected = ["A", "B", "C", "D", "E", "F", "G"]
    assert actual == expected

def test_in_order(letter_tree):
    actual = letter_tree.in_order()
    expected = ["C", "B", "D", "A", "F", "E", "G"]
    assert actual == expected

def test_post_order(letter_tree):
    actual = letter_tree.post_order()
    expected = ["C", "D", "B", "F", "G", "E", "A"]
    assert actual == expected


#//////////// Binary Search Tree //////////////////

def test_add_node_to_empty_BST():
    tree = BinarySearchTree()
    tree.add(1)
    actual = tree.root.value
    expected = 1
    assert actual == expected

def test_add_string_to_BST():
    tree = BinarySearchTree()
    actual = tree.add("Programmer")
    expected = "Node must contain a number"
    assert actual == expected

def test_add_empty_node_to_BST():
    tree = BinarySearchTree()
    actual = tree.add("")
    expected = "Node must contain a number"
    assert actual == expected

def test_add_two_nodes_BST():
    tree = BinarySearchTree()
    tree.add(1)
    tree.add(2)
    actual = tree.root.right.value
    expected = 2
    assert actual == expected

def test_add_node():
    tree = BinarySearchTree()
    tree.add(1)
    tree.add(2)
    tree.add(3)
    actual = tree.root.right.right.value
    expected = 3
    assert actual == expected

def test_contains_false():
    tree = BinarySearchTree()
    tree.add(1)
    tree.add(2)
    tree.add(3)
    tree.add(4)
    actual = tree.contains(5)
    expected = False
    assert actual == expected


# #///////// Code Challenge 16 //////////////////




# #///////// Code Challenge 17 //////////////////

def example_tree():
    tree = BinaryTree()
    tree.root = Node

def test_breadth_frist(example_tree):
    actual = example_tree.breadth()
    expected = [1, 2, 2, 3, 3, 3, 3]
    assert actual == expected

def test_breadth_first_negative(negative_tree):
    actual = negative_tree.breadth()
    expected = [-1, -2, -2, -3, -3, -3, -3]
    assert actual == expected



#//////////// Fixtures //////////////
# Credit to Kassive Bradshaw for the fixtures idea!!

@pytest.fixture
def empty_tree():
  empty_tree = BinaryTree()
  return empty_tree

@pytest.fixture
def number_tree():
  tree = BinaryTree()
  tree.root = Node(50)
  tree.root.left = Node(25)
  tree.root.left.left = Node(15)
  tree.root.left.right = Node(30)
  tree.root.right = Node(75)
  tree.root.right.left = Node(60)
  tree.root.right.right = Node(80)
  return tree

@pytest.fixture
def example_tree():
  # the tree we were given in the instructions
  tree = BinaryTree()
  tree.root = Node(1)
  tree.root.left = Node(2)
  tree.root.left.left = Node(3)
  tree.root.left.right = Node(4)
  tree.root.left.right.left = Node(5)
  tree.root.left.right.right = Node(6)
  tree.root.right = Node(7)
  tree.root.right.right = Node(8)
  tree.root.right.right.left = Node(9)
  return tree

@pytest.fixture
def negative_tree():
  # testing a tree with all negative numbers
  tree = BinaryTree()
  tree.root = Node(-1)
  tree.root.left = Node(-2)
  tree.root.left.left = Node(-3)
  tree.root.left.right = Node(-4)
  tree.root.left.right.left = Node(-5)
  tree.root.left.right.right = Node(-6)
  tree.root.right = Node(-7)
  tree.root.right.right = Node(-8)
  tree.root.right.right.left = Node(-9)
  return tree

@pytest.fixture
def letter_tree():
  tree = BinaryTree()
  tree.root = Node("A")
  tree.root.left = Node("B")
  tree.root.left.left = Node("C")
  tree.root.left.right = Node("D")
  tree.root.right = Node("E")
  tree.root.right.left = Node("F")
  tree.root.right.right = Node("G")
  return tree


