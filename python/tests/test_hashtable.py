from code_challenges.hashtable.hashtable import HashTable

def test_instantiate_hasttable():
    hashtable = HashTable()
    assert hashtable
    assert hashtable.size == 1024
    assert len(hashtable.bucket) == 1024

def test_valid_index():
    hashtable = HashTable()
    index = hashtable.hash('dog')
    expected = 694
    assert index == expected

def test_return_value_within_range():
    hashtable = HashTable()
    actual = hashtable.hash('dog')
    assert actual <= 1024
    assert actual >= 0

def test_return_none_does_not_exist():
    hashtable = HashTable()
    hashtable.add('dog', 1)
    assert hashtable.get('dog') is None

def test_add():
    hashtable = HashTable()
    index = hashtable.hash('dog')
    assert hashtable.bucket[index] is None
    hashtable.add('dog', 'cat')
    bucket = hashtable.bucket[index]
    assert bucket

def test_return_value():
    pass
    # hashtable = HashTable()
    # hashtable.add('dog', 1)
    # actual = hashtable.get('dog')
    # expected = 1
    # assert actual == expected

def test_does_not_contain_value():
    hashtable = HashTable()
    hashtable.add('dog', 1)
    hashtable.add('cat', 2)
    assert hashtable.contains('fish') == False

def test_similar_values():
    hashtable = HashTable()
    key1 = 'dog'
    key2 = 'god'
    assert hashtable.hash(key1) == hashtable.hash(key2)
    pass

