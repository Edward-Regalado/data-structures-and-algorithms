class Node:
    """
    Docstring
    """
    def __init__ (self, data = None, left = None, right = None):
        self.data = data
        self.left = left
        self.right = right

    pass

class BinaryTree:
    """
    Docstring

    """
    def __init__(self, root = None):
        self.root = root


    def pre_order():
        # root >> left >> right
        elements = []

        pass

    def in_order(self):
        elements = []

        # visit left tree
        if self.left:
            elements += self.left.in_order()

        # visit base node
        elements.append(self.data)

        # visit rigth tree
        if self.right:
            elements += self.left.in_order()

        return elements

    def post_order():
        # left >> right >> root
        pass




class BinarySearchTree(BinaryTree):
    """
    Docstring
    """
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

    def add(self, data):
        if data == self.data:
            return Node(val)

        if data < self.data:

            if self.left:
                self.left.add(data)

            else:
                self.left = BinaryTree(data)

        else:
            if self.right:
                self.right.add(data)
            else:
                self.right = BinaryTree(data)


    def contains(self, val):

        if self.data == val:
            return True

        if val < self.data:
            if self.left:
                self.left.contains(val)
            else:
                return False

        if val > self.data:
            if self.right:
                self.right.contains(val)
            else:
                return False


if __name__ == '__main__':

