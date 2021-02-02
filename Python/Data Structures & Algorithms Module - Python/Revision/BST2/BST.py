"""
BST.py
Billy Cussen
02/02/2021
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

    def max(self):
        if self.isEmpty():
            return None
        return self.maxHelper(self.root)

    def maxHelper(self, current):
        if current.right == None:
            return current.element
        return self.maxHelper(current.right)

    def min(self):
        if self.isEmpty():
            return None
        return self.minHelper(self.root)

    def minHelper(self, current):
        if current.left == None:
            return current.element
        return self.minHelper(current.left)

    def insert(self, element):
        if self.isEmpty():
            self.root = Node(element)
        else:
            self.insertHelper(self.root, element)

    def insertHelper(self, current, element):
        if (element > current.element)-(element < current.element)==-1:
            if current.left == None:
                current.left = Node(element)
            else:
                self.insertHelper(current.left, element)
        else:
            if current.right == None:
                current.right = Node(element)
            else:
                self.insertHelper(current.right, element)

    def inOrder(self):
        if self.isEmpty():
            return "Can't do inorder traversal, BST is Empty!"
        else:
            print("***BST IN ORDER TRAVERSAL***")
            self.inOrderHelper(self.root)
            print("***END***\n")

    def inOrderHelper(self, current):
        if current == None:
            return
        self.inOrderHelper(current.left)
        print(str(current.toString()))
        self.inOrderHelper(current.right)

    def findNode(self, element):
        if self.isEmpty():
            return None
        return self.findNodeHelper(element, self.root)

    def findNodeHelper(self, element, current):
        if current == None:
            return None

        if (element > current.element)-(element < current.element)==0:
            return current
        elif (element > current.element)-(element < current.element)==-1:
            return self.findNodeHelper(element, current.left)
        else:
            return self.findNodeHelper(element, current.right)

    def findParent(self, element):
        if self.isEmpty() or element == self.root.element or self.size() <= 1:
            return None
        return self.findParentHelper(element, self.root)

    def findParentHelper(self, element, current):
        if current == None:
            return None

        if (element > current.element) - (element < current.element)==-1:
            if (element > current.left.element)-(element < current.left.element)==0:
                return current
            else:
                return self.findParentHelper(element, current.left)
        else:
            if (element > current.right.element)-(element < current.right.element)==0:
                return current
            else:
                return self.findParentHelper(element, current.right)


    def remove(self, element):

        toRemove = self.findNode(element)
        parentNode = self.findParent(element)

        if self.isEmpty() or self.root.element == element or toRemove == None:
            return False
        elif toRemove.left == None and toRemove.right == None:
            if (toRemove.element > parentNode.element)-(toRemove.element < parentNode.element) == -1:  
                parentNode.left = None
            else:
                parentNode.right = None
            return True
        elif toRemove.left != None and toRemove.right == None:
            if (toRemove.element > parentNode.element)-(toRemove.element<parentNode.element) == -1:
                parentNode.left = toRemove.left
            else:
                parentNode.right = toRemove.left
            return True
        elif toRemove.left == None and toRemove.right != None:
            if(toRemove.element > parentNode.element)-(toRemove.element < parentNode.element)== -1:
                parentNode.left = toRemove.right
            else:
                parentNode.right = toRemove.right
            return True
        return False


