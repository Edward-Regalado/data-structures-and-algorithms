from code_challenges.stack_and_queue.stack import IsEmptyError, Node, Stack, Queue
import pytest


# Stacks
def test_push_to_stack():
    stack = Stack()
    stack.push(1)
    actual = stack.top.value
    expected = 1
    assert actual == expected

def test_push_mult_values():
    stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    actual = stack.top.value
    expected = 3
    assert actual == expected

def test_pop_from_stack():
    stack = Stack()
    stack.push(1)
    stack.push(2)
    actual = stack.pop()
    expected = 2
    assert actual == expected

def test_pop_all_from_stack():
    stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.pop()
    stack.pop()
    stack.pop()
    actual = stack.is_empty()
    expected = True
    assert actual == expected

def test_peek_next_item_in_stack():
    stack = Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    actual = stack.peek()
    expected = 3
    assert actual == expected

def test_empty_stack_raises_exception():
    stack = Stack()
    with pytest.raises(IsEmptyError) as e:
        stack.pop()
    assert str(e.value) == "The stack is empty, therefore cannot pop."


# Queue
def test_queue_to_queue():
    q = Queue()
    q.enqueue(1)
    assert q.front.value == 1

def test_mult_queue_to_queue():
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    assert q.front.value == 1
    assert q.rear.value == 3

def test_deque_out_of_queue():
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    actual = q.dequeue()
    expected = 1
    assert actual == expected

def test_empty_queue_after_mult_dequeue():
    q = Queue()
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)

    with pytest.raises(IsEmptyError) as e:
        while q.peek():
            q.dequeue()
    assert str(e.value) == "The queue is empty, therefore cannot retrieve."
   

def test_instantiate_empty_queue():
    q = Queue()
    assert q.front == None
    assert q.rear == None

def test_dequeue_on_empty_queue_raise_expection():
    q = Queue()
    with pytest.raises(IsEmptyError) as e:
        q.dequeue()
    assert str(e.value) == "The queue is empty, therefore cannot dequeue"

