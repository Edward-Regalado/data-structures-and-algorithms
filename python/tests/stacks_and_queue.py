from code_challenges.stack_and_queue.stack import Node, Stack, Queue
import pytest

def test_push_to_stack():
    stack = Stack()
    stack.push(1)
    actual = stack.top.value
    expected = 1
    assert actual == expected


