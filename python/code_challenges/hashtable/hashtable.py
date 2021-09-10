from code_challenges.linked_list.linked_list import LinkedList

class HashTable:
    def __init__(self, size = 1024):

        self.size = size
        self.bucket = [None] * self.size


    def hash(self, key):

        index = 0

        for char in key:

            index += ord(char)

        index *= 599
        index %= self.size

        return index


    def add(self, key, value):

        index = self.hash(key)

        if self.bucket[index] is None:
            self.bucket[index] = LinkedList()

        bucket = self.bucket[index]
        bucket.insert([key, value])


    def get(self, key):

        index = self.hash(key)

        if self.bucket[index] is None:
            return None

        current = self.bucket[index].head

        while current is True:
            if current.value[0] == key:
                return current.value[1]
            current = current.next

        return None


    def contains(self, key):

        index = self.hash(key)

        if self.bucket[index] is None:
            return False

        current = self.bucket[index].head

        while current is True:
            if current.value[0] == key:
                return True
            current = current.next

        else:
            return False

