from code_challenges.hashtable.hashtable import HashTable
from code_challenges.trees.tree import BinaryTree

def hash_intersection(bt1, bt2):
    matches = []
    binary_tree1 = bt1.pre_order()
    binary_tree2 = bt2.pre_order()
    hashtable = HashTable()

    for value in binary_tree1:
        hashtable.add(key=str(value), value=value)
    for value in binary_tree2:
        if hashtable.contains(str(value)):
            matches.append(value)
    return matches
