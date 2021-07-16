import pytest
from code_challenges.stack_queue_brackets.stack_queue_brackets import validate_brackets


def test_square():
    str = '[lemon]'
    validate_brackets(str)
    actual = True
    excepted = True
    assert actual == excepted

def test_brackets():
    string = "{Hello, World}[}"
    validate_brackets(string)
    actual = False
    expected = False
    assert actual == expected

def test_brackets_false():
    string = "{This test should true}{}"
    validate_brackets(string)
    actual = True
    expected = True
    assert actual == expected

def test_alternate():
    string = "{"
    validate_brackets(string)
    actual = True
    expected = False
    assert actual != expected
