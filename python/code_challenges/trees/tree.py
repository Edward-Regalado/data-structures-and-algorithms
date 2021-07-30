

class Node:
    """
    Create a Node which has properties of the value stored in the Node, left and right child nodes.
    """
    def __init__ (self, value = None, left = None, right = None):
        self.value = value
        self.left = left
        self.right = right

#//////////////////////////////////////////////////////////////////#

class BinaryTree:
    """
    Create a Binary Class Tree, which has methods to traverse the tree called preorder, inorder, and post order. This will return the values in binary tree in the correct order.

    """
    def __init__(self, root = None):
        self.root = Node(root)

     # Preorder Method: Traverse a Binary Tree from root >> left >> right.
    def pre_order(self):

        elements = []

        # check it root value is empty before running the traverse method, this will return a string and end the pre_order function, else run the traverse method.
        if self.root is None:
            return "Empty Tree"

        def traverse(root):

            elements.append(root.value)
            # If root node has a left value (True), recursively call the traverse method until it returns None.
            if root.left:
                traverse(root.left)
            # If root node has a right value (True), recrusively call the traverse helper method unit it returns None.
            if root.right:
                traverse(root.right)

        traverse(self.root)

        return elements


    # InOrder Method: Traverse a Binary Tree from left >> root >> right.
    def in_order(self):

        elements = []

        # check it root value is empty before running the traverse method, this will return a string and end the in_order function, else run the traverse method.
        if self.root is None:
            return "Empty Tree"

        def traverse(root):
            # vist left tree.
            if root.left:
                traverse(root.left)

            elements.append(root.value)

        # visit right tree
            if root.right:
                traverse(root.right)

        traverse(self.root)

        return elements


    # PostOrder Method: Traverse a Binary Tree from left >> right>> root.
    def post_order(self):

        elements = []

        if self.root is None:
            return "Empty Tree"

        def traverse(root):
            if root.left:
                traverse(root.left)

            if root.right:
                traverse(root.right)

            elements.apend(root.value)

        traverse(self.root)

        return elements

    # Find Max Value Method: Traverse a Binary Tree and find the max value.
    def max_value(self):
        max_value = self.root.value

        def traverse(root):
            nonlocal max_value

            if root.value > max_value:
                max_value = root.value

            if root.left:
                traverse(root.left)

            if root.right:
                traverse(root.right)

        traverse(self.root)
        return max_value

    def breadth(self):

        root = self.root

        if root is None:
            return "Tree is empty"

        else:
            order = []
            queue = Queue()
            queue.enque(root)

            while not queue.isEmpty():
                front = queue.dequeue()
                order.append(front.value)
                if front.left:
                    queue.enqueue(front.left)
                if front.right:
                    queue.enqueue(front.left)
        return order


#/////////////////////////////////////////////////////////////////////#

class BinarySearchTree(BinaryTree):
    """
    Add a node to the binary search tree. BST only contains intergers/numbers.
    """
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def add(self, value):


        if value == self.value:
            return Node(value)

        if value < self.value:

            if self.left:
                self.left.add(value)

            else:
                self.left = BinaryTree(value)

        else:
            if self.right:
                self.right.add(value)
            else:
                self.right = BinaryTree(value)


    def contains(self, value):
        """
        Search to see if the BST contains a certain value. Returns a boolean to see if value is already inside the tree
        """
        if self.value == value:
            return True

        if value < self.value:
            if self.left:
                self.left.contains(value)
            else:
                return False

        if value > self.value:
            if self.right:
                self.right.contains(value)
            else:
                return False
