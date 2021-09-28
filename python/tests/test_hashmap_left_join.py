from code_challenges.hashmap_left_join.left_join import left_join
import pytest

def test_empty_left():
    right = {
    "fond": "averse",
    "wrath": "delight",
    "diligent": "idle",
    "guide": "follow",
    "flow": "jam"}

    actual = left_join({}, right)
    expected = []
    assert actual == expected

def test_empty_right():
    left = {
    "fond": "enamored",
    "wrath": "anger",
    "diligent": "employed",
    "outfit": "garb",
    "guide": "usher",
    }

    actual = left_join(left, {})
    expected = [["fond", "enamored", None], ["wrath", "anger", None], ["diligent", "employed", None], ["outfit", "garb", None], ["guide", "usher", None]]
    assert actual == expected

def test_both_empty():
    actual = left_join({}, {})
    expected = []
    assert actual == expected


