"""
BST.py
Billy Cussen
26/01/2021
"""

from Node import Node

class BST:

    def __init__(self):
        self.root = None

    def isEmpty(self):
        return self.root == None

    def size(self):
        if self.isEmpty():
            return 0
        return self.sizeHelper(self.root)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.left)+self.sizeHelper(current.right)

    def depth(self):
        if self.isEmpty():
            return 0
        return self.depthHelper(self.root)

    def depthHelper(self, current):
        if current == None:
            return 0

        leftDepth = 1 + self.depthHelper(current.left)
        rightDepth = 1 + self.depthHelper(current.right)
        if leftDepth >= rightDepth:
            return leftDepth
        else:
            return rightDepth

    def min(self):
        if self.isEmpty():
            return None
        return self.minHelper(self.root)

    def minHelper(self, current):
        if current.left == None:
            return current.element
        else:
            return self.minHelper(current.left)

    def max(self):
        if (self.isEmpty()):
            return None
        return self.maxHelper(self.root)

    def maxHelper(self, current):
        if current.right == None:
            return current.element
        else:
            return self.maxHelper(current.right)

    def contains(self, element):
        if(self.isEmpty()):
            return False
        return self.containsHelper(self.root, element)

    def containsHelper(self, current, element):
        if current == None:
            return False
        
        if ((element > current.element) - (element < current.element) == 0):
            return True
        elif ((element > current.element) - (element < current.element) <= -1):
            return self.containsHelper(current.left, element)
        else:
            return self.containsHelper(current.right, element)

    def insert(self, element):
        if self.isEmpty():
            self.root = Node(element)
        else:
            self.insertHelper(element, self.root)

    def insertHelper(self, element, current):
        if((element > current.element)-(element < current.element)<=-1):
            if current.left == None:
                current.left = Node(element)
            else:
                self.insertHelper(element, current.left)
        else:
            if current.right == None:
                current.right = Node(element)
            else:
                self.insertHelper(element, current.right)


    def inOrder(self):
        if self.isEmpty():
            print("Can't do inorder traversal, BST is Empty!")
        else:
            print("***BST INORDER TRAVERSAL***")
            self.inOrderHelper(self.root)
            print("***END***")   

    def inOrderHelper(self, current):
        if current == None:
            return
        
        self.inOrderHelper(current.left)
        print(current.toString())
        self.inOrderHelper(current.right)

    def getNode(self, element):
        if self.isEmpty():
            return None
        else:
            return self.getNodeHelper(element, self.root)

    def getNodeHelper(self, element, current):
        if current == None:
            return None

        if (element > current.element) - (element < current.element) == 0:
            return current
        elif (element > current.element) - (element < current.element) == -1:
            return self.getNodeHelper(element, current.left)
        else:
            return self.getNodeHelper(element, current.right)

    def getParentNode(self, element):
        if(self.isEmpty() or self.root.element == element):
            return None
        else:
            return self.getParentNodeHelper(element, self.root)

    def getParentNodeHelper(self, element, current):
        if (element > current.element)-(element < current.element) == -1:
            if (element > current.left.element) - (element < current.left.element) == 0:
                return current
            else:
                return self.getParentNodeHelper(element, current.left)
        else:
            if (element > current.right.element) - (element < current.right.element) == 0:
                return current
            else:
                return self.getParentNodeHelper(element, current.right)