from abc import abstractclassmethod
from code_challenges.linked_list.linked_list import LinkedList, Node

def test_import():
    assert LinkedList

def test_node_instance():
    node = Node('lemon', None)
    actual = node.value
    expected = 'lemon'
    assert actual == expected

def link_list():
    linked_list1 = LinkedList()
    actual = linked_list1.head
    expected = None
    assert actual == expected

def test_insert():
    linked_list2 = LinkedList()
    # 1 becomes the head
    linked_list2.insert("1")
    # now 2 becomes the head as we insert the next node
    linked_list2.insert("2")
    # actual is equal to the head
    actual = linked_list2.head.value
    # expected is what we are excepting the value to be
    expected = "2"
    # this is comparing our actual and expected variables and returns True or False
    assert actual == expected



# def test_first_node():
#     pass

# def test_multiple_nodes_insert():
#     pass

# def test_includes():
#     pass

# def test_str():
#     pass

# Code Challenge 6 test

def test_append():
    linked_list = LinkedList(Node('d', Node('o', Node('g'))))
    linked_list.append_end('s')
    actual = str(linked_list)
    expected = "{'d'} -> {'o'} -> {'g'} -> {'s'} -> NULL"
    assert actual == expected

def test_insert_before():
    linked_list = LinkedList(Node('1', Node('3', Node('4'))))
    linked_list.insert_before('3', '2')
    actual = link_list.__str__()
    expected = "{'1'} -> {'2'} -> {'3'} -> {'4'} -> NULL"

def test_insert_after():
    linked_list = LinkedList(Node('1', Node('2', Node('4'))))
    linked_list.insert_after('2', '3')
    actual = link_list.__str__()
    expected = "{'1'} -> {'2'} -> {'3'} -> {'4'} -> NULL"

# Code Challenge 7 tests

def test_kth_from_end():
    linked_list = LinkedList(Node('d',(Node('a', Node('b', Node('c'))))))
    actual = linked_list.kth_from_end(1)
    expected = 'b'
    assert actual == expected

def test_kth_negative():
    link_list = LinkedList(Node('d',(Node('a', Node('b', Node('c'))))))
    actual = link_list.kth_from_end(-6)
    expected = 'Please choose a positive number'
    assert actual == expected

def test_kth_too_large():
    link_list = LinkedList(Node('d',(Node('a', Node('b', Node('c'))))))
    actual = link_list.kth_from_end(6)
    expected = 'The linked list is not that long. Please choose a smaller number'
    assert actual == expected

def test_kth_1():
    link_list = LinkedList()
    link_list.insert('a')
    actual = link_list.kth_from_end(2)
    expected = 'List only has 1 item'
    assert actual == expected
