from code_challenges.hashtable.hashtable import HashTable
import re

def repeated_word(string):

    if len(string) == 0:
        return None

    hash_map = HashTable()
    lowered = string.lower()
    array = re.findall(r"\w+", lowered)

    for word in array:
        if hash_map.contains(word):
            return word
        else:
            hash_map.add(word, word)

    return None

