from code_challenges.hashmap_repeated_word.hashmap import repeated_word
from code_challenges.hashtable.hashtable import HashTable

def test_instantiate_hashmap():
    hashmap = HashTable()
    assert hashmap

def test_empty_string():
    string = ''
    actual = repeated_word(string)
    assert actual == None

def test_no_repeat():
    string = "dog cat fish"
    actual = repeated_word(string)
    assert actual == None


