class InvalidOperationError(BaseException):
    pass

class Node:
        def __init__(self, value, next=None):
            self.value = value
            self.next = next

class Stack:
    def __init__(self, node=None):
        self.top = node

    def push(self, value):
        # create a node, pass in value
        node = Node(value)
        # this points the new node to top of stack
        node.next = self.top
        # assign node to the top of stack
        self.top = node

    def pop(self, value):
        if self.is_empty():
            raise InvalidOperationError("Method not allowed on empty collection")
        node = self.top
        self.top = self.top.next
        return node.value

    def peek(self):
        if self.is_empty():
            raise InvalidOperationError("Method not allowed on empty collection")

    def is_empty(self):
        if self.top == None:
            return True
        else:
            return False

class Queue:
    # First-In-First-Out
    def __init__(self, node=None):
        self.front = node
        self.rear = Node

    def enqueue(self, value):
        node = Node(value)

        if self.front is None:
            self.front = node
            self.rear = node
            return self

        self.rear.next = node
        self.rear = node
        return self

    def dequeue(self):

        if self.front is None:
            return None

        deque = self.front.value
        self.front = self.front.next
        return deque

    def peek(self):

        if self.front is None:
            return None

        return self.front.value

    def isEmpty(self):
        return self.front == None

if __name__ == "__main__":
    pass
