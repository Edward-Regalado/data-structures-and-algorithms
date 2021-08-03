from code_challenges.tree_fizz_buzz.tree_fizz_buzz import Node, K_aryTree, fizz_buzz_tree
import pytest

def test_empty_tree(empty_tree):
    # tree = K_aryTree(Node())
    actual = empty_tree.fizz_buzz_tree()
    # actual = fizz_buzz_tree(tree)
    expected = "Empty Tree"
    assert actual == expected




@pytest.fixture
def empty_tree():
  empty_tree = K_aryTree()
  return empty_tree
