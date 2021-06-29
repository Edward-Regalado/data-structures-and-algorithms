from code_challenges.linked_list.linked_list import LinkedList, Node


def test_node_instance():
    node1 = Node("apple")
    actual = node1.value
    expected = "apple"
    assert actual == expected
    assert node1.next == None

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



def test_first_node():
    pass

def test_multiple_nodes_insert():
    pass

def test_includes():
    pass

def test_str():
    pass


