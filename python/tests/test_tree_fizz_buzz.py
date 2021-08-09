from code_challenges.tree_fizz_buzz.tree_fizz_buzz import Node, K_aryTree, fizz_buzz_tree
import pytest


def test_empty_tree():
    tree = K_aryTree(Node())
    actual = fizz_buzz_tree(tree)
    expected = "Empty Tree"
    assert actual == expected


def test_tree_traverse():
    tree = K_aryTree(Node(1))
    tree.root.left = Node(3)
    tree.root.right = Node(5)
    tree.root.left.left = Node(15)
    # tree.root.left.right = Node(85)
    # tree.root.right.left = Node(42)
    actual = fizz_buzz_tree(tree)
    expected = [1, "Fizz", "Buzz", "FizzBuzz"]
    assert actual == expected


@pytest.fixture
def empty_tree():
  empty_tree = K_aryTree()
  return empty_tree
