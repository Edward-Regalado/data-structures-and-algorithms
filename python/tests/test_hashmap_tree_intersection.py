from code_challenges.hashmap_tree_intersection.hashmap_tree import hash_intersection
from code_challenges.trees.tree import BinaryTree, Node
import pytest

def test_tree_instance():
    bt = BinaryTree()
    assert bt

def test_node_instance():
    node = Node()
    tree = BinaryTree()
    assert node
    assert tree

def test_tree_duplicates(bt1, bt2):
    actual = hash_intersection(bt1, bt2)
    expected = [1, 13]
    assert actual == expected

def test_tree_no_duplicates(bt1, bt3):
    actual = hash_intersection(bt1, bt2)
    expected = []
    assert actual == expected


@pytest.fixture
def bt1():
    tree1 = BinaryTree()
    tree1.root = Node(1)
    tree1.root.left = Node(3)
    tree1.root.right = Node(5)
    tree1.root.left.left = Node(7)
    tree1.root.left.right = Node(9)
    tree1.root.right.left = Node(11)
    tree1.root.right.right = Node(13)
    return tree1

@pytest.fixture
def bt2():
    tree2 = BinaryTree()
    tree2.root = Node(1)
    tree2.root.left = Node(4)
    tree2.root.right = Node(6)
    tree2.root.left.left = Node(8)
    tree2.root.left.right = Node(10)
    tree2.root.right.left = Node(12)
    tree2.root.right.right = Node(13)
    return tree2

@pytest.fixture
def bt3():
    tree3 = BinaryTree()
    tree3.root = Node(14)
    return tree3


