
class Node:
    def __init__(self, value = None, left = None, right = None):
        self.value = value
        self.left = left
        self.right = right

class K_aryTree:

    def __init__(self, root = None):
        self.root = root

    def pre_order(self):
        list = []

        def traverse(root):

            if root is None:
                return "Empty Tree"

            list.append(root.value)
            traverse(root.left)
            traverse(root.right)

        traverse(self.root)
        return list


# @staticmethod
def fizz_buzz_tree(tree):

    root = tree.root
    list = []

    if root.value is None:
      return "Empty Tree"

    def traverse(root):

        if root is None:
           return
        if root.value % 3 == 0 and root.value % 5 == 0:
            root.value = "FizzBuzz"
        elif root.value % 3 == 0:
            root.value == "Fizz"
        elif root.value % 5 == 0:
            root.value = "Buzz"
            list.append(root.value)
            traverse(root.left)
            traverse(root.right)

        traverse(root)



