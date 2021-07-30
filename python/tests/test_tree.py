# @pytest.mark.skip("pending")
from code_challenges.trees.tree import BinaryTree


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


def example_tree():
    tree = BinaryTree()
    tree.root =BT

def test_breadth_frist(example_tree):
    actual = example_tree.breadth()
    expected = [2, 7, 5, 2, 6, 9, 5, 11, 4]
    assert actual == expected

def test_breadth_first_negative(negative_tree):
    actual = negative_tree.breadth()
    expected = ["Apple", "Banana","Coconut", "Date", "Elderberry", "Fig", "Grape"]
    assert actual == expected



