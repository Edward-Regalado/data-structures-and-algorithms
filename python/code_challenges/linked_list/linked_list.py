# Create a node class, which is essentially a sub-class on the LinkedList class.
# Node class next is initialized with None
# The last element/node in a linked list will always be None

class Node:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


# Create a Linked List(singly) class, which is bascially a wrapper that wraps over the node class
# This function creates the head node
# This is used as a placeholder node to point to first element in the list and doesn't actually contain any data
# The user will not be able to access or interact with the head node
# The head node isn't a data node and doesn't count as a node in the LL

class LinkedList:

    def __init__(self, head=None):
        self.head = head

    def insert(self, value):
        # creating a new node in front of the Linked List
        new_node = Node(value)
        # node that comes next will become the head
        if self.head is not None:
            new_node.next = self.head
        # setting new node to head
        self.head = new_node
        # return self

    def includes(self, value):
        # define the head, which is the current variable
        current = self.head

        while current is not None:
            if current.value == value:
                return True
            current = current.next
        return False

    def __str__(self):
        string = ""
        current = self.head

        while current != None:
            string += f"{ {current.value} } -> "
            current = current.next
        string += f"NULL"
        return string

    def append_end(self, value):
        new_node = Node(value)
        current = self.head

        if current is None:
           current = new_node
        else:
            while current.next is not None:
                current = current.next
        current.next = new_node

    def insert_before(self, value, new_value):
        new_node = Node(new_value)
        current = self.head

        if current is None:
            current = new_node
        while current.next is not None:
            if current.next == value:
                current.next = new_node
            else:
                current = current.next

    def insert_after(self, value, new_value):
        new_node = Node(new_value)
        current = self.head

        if current is None:
            current = new_node
        while current.next is not None:
            if current.next == value:
                current.next = new_node
            else:
                current = current.next

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

def zip_list(list1, list2):
    list1_current = list1.head
    list2_current = list2.head

    while list1_current != None and list2_current != None:
        #Save next pointers
        list1_next = list1_current.next
        list2_next = list2_current.next

        list2_current.next = list1_next
        list1_current.next = list2_current

        list1_current = list1_next
        list2_current = list2_next
    list2.head = list2_current

