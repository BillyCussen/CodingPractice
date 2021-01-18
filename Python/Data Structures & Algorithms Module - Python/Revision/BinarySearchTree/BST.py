"""
BST.py
Billy Cussen
18/01/2021
"""

from Node import Node

class BST:

    def __init__(self):
        self.root = None

    def size(self):
        if self.isEmpty():
            return 0
        return self.sizeHelper(self.root)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.left)+self.sizeHelper(current.right)

    def insert(self, element):
        if self.isEmpty():
            self.root = Node(element)
        else:
            self.insertHelper(element, self.root)

    def insertHelper(self, element, current):
        if ((element > current.element)-(element < current.element) == -1):
            if(current.left == None):
                current.left = Node(element)
            else:
                self.insertHelper(element, current.left)
        else:
            if(current.right == None):
                current.right = Node(element)
            else:
                self.insertHelper(element, current.right)

    def depth(self):
        if(self.isEmpty()):
            return 0
        else:
            return self.depthHelper(self.root)

    def depthHelper(self, current):
        if current == None:
            return 0

        leftNode = 1 + self.depthHelper(current.left)
        rightNode = 1 + self.depthHelper(current.right)
        if leftNode >= rightNode:
            return leftNode
        else:
            return rightNode

    def min(self):
        if self.isEmpty():
            raise Exception("Unable to get Min, BST is Empty!")
        else:
            return self.minHelper(self.root)

    def minHelper(self, current):
        if current == None:
            return None

        if current.left == None:
            return current.element
        else:
            return self.minHelper(current.left)

    def max(self):
        if self.isEmpty():
            raise Exception("Can't get Max, BST is Empty!")
        else:
            return self.maxHelper(self.root)

    def maxHelper(self,current):
        if current == None:
            return None

        if current.right == None:
            return current.element
        else:
            return self.maxHelper(current.right)

    def inOrder(self):
        if self.isEmpty():
            raise Exception("Unable to do in order traversal, BST is Empty!")
        print("***IN ORDER BST TRAVERSAL***\n")
        self.inOrderHelper(self.root)
        print("***END***\n")

    def inOrderHelper(self, current):
        if current == None:
            return
        
        self.inOrderHelper(current.left)
        print(current.toString())
        self.inOrderHelper(current.right)

    def isEmpty(self):
        return self.root == None