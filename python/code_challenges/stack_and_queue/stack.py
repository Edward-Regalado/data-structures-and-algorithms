class IsEmptyError(Exception):
    pass

class Node:
        def __init__(self, value, next=None):
            self.value = value
            self.next = next

class Stack:
    def __init__(self, node=None):
        self.top = node

    def push(self, value):
        # create a node instance, pass in value(data, string, int, etc)
        new_node = Node(value)
        # this points the new node to top of stack
        new_node.next = self.top
        # assign new_node to the top of stack
        self.top = new_node

    def pop(self):
        # first check to see if stack is empty
        if self.is_empty():
            raise IsEmptyError("The stack is empty, therefore cannot pop.")
        # save the current head/top to variable to return after it is popped/removed
        popped_node = self.top
        # reassign the node below the popped/removed node to be the new top/head
        self.top = self.top.next
        # return the popped nodes value
        return popped_node.value

    def peek(self):
        # first check to see if stack is empty
        if self.is_empty():
            raise IsEmptyError("The stack is empty, therefore cannot peek.")
        # if the above code is False(stack is not empty) return the current top/head value
        return self.top.value

    def is_empty(self):
        # returns True if equal to None or 0, else returns False
        # can also write an if/else statement
        return self.top == None

class Queue:
    # First-In-First-Out
    def __init__(self, node=None):
        # the first node instace in the queue is both the front and rear
        # it's like a single person standing in line for a movie- they're both the front and rear of the line
        self.front = node
        self.rear = node

    def enqueue(self, value):
        # create a node instance, pass in value
        # similar to pushing and popping, but we enqueue elements from the back and dequeue from the front.
        new_node = Node(value)

        # if the queue is empty, then set the new_node instance to both the head/tail or front/rear of the queue
        if self.front is None:
            self.front = new_node
            self.rear = new_node
            return self
        # if the queue isn't empty, then set the new_node to the rear/back of the queue. This is the new tail node.
        else:
            self.rear.next = new_node
            self.rear = new_node
            return self

    def dequeue(self):
        # remove element from queue, front of the line or FIRST-IN-FIRST-OUT
        # first check to see if the queue is empty
        if self.is_empty():
            raise IsEmptyError("The queue is empty, therefore cannot dequeue")
        # if the above code is false, then remove the front value of the queue, save to variable so we can return later
        # set the front.next, which points to the element behind what we just removed to be the new front/head of the queue
        # rinse and repeat until the queue is empty, which will raise an error.
        dequeued_node = self.front.value
        self.front = self.front.next
        if self.is_empty():
            self.rear = None
        return dequeued_node

    def peek(self):
        if self.is_empty:
            raise IsEmptyError("The queue is empty, therefore cannot retrieve.")
        return self.front.value
        # if self.front is None:
        #     return None

        # return self.front.value

    def is_empty(self):
        return self.front == None

if __name__ == "__main__":
    pass
