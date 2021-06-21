class Node:
    """
    Create a node class
    """

    def __init_(self, value, next=None):
        self.value = value
        self.next = next

class LinkedList:
    """
    Linked List(singly)
    """

    def __init__(self, node=None):
        self.head = None

    def insert(self, value):
        node = Node(value)
        node.next = self.head
        self.head = node
        return self

    def includes(self, value):
        current = self.head
        # While loop to return Ture or False


    def toString(self):
        # return a collection of all teh values that exist in the linked list
