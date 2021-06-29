# from tests.test_linked_list import link_list


class Node:
    # Create a node class, which is essentially a sub-class on the LinkedList class.
    # Node class next is initialized with None
    # The last element/node in a linked list will always be None
    def __init__(self, value, next=None):
        self.value = value
        self.next = next

class LinkedList:
    # Create a Linked List(singly) class, which is bascially a wrapper that wraps over the node class
    # This function creates the head node
    # This is used as a placeholder node to point to first element in the list and doesn't actually contain any data
    # The user will not be able to access or interact with the head node
    # The head node isn't a data node and doesn't count as a node in the LL
    def __init__(self, head=None):
        self.head = head

    def insert(self, value):
        # creating a new node
        node = Node(value)
        # node that comes next will become the head
        if self.head is not None:
            node.next = self.head
        # setting new node to head
        self.head = node
        # return self

    def includes(self, value):
        # define the head, which is the current variable
        current = self.head

        while current is not None:
            if current.value == value:
                return True
            current = current.next
        return False

    def toString(self):
        # return a collection of all the values that exist in the linked list
        pass

    def kth_from_end(self, k):
        length = -1
        temp = self.head
        while temp is not None:
            temp = temp.next
            length += 1
        if length < 2:
            return "List only has 1 item"
        elif k < 0:
            return "Please choose a positive number"
        elif k >= length:
            return "The linked list is not that long. Please choose a smaller number"
        else:
            temp =  self.head
            target = length - k
            for i in range(0, target):
                temp = temp.next
            return temp.value

    def middle_node(self):
        length = -1
        temp = self.head
        while temp is not None:
            temp = temp.next
            length += 1
        if length < 2:
            return "List only has 1 item"
        else:
            temp = self.head
            target = int(length/2)
            for i in range(0, target):
                temp = temp.next
            return temp.value

