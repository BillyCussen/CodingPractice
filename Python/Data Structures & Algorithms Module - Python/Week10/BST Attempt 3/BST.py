"""
BST.py
Billy Cussen
09/12/2020
"""

from BSTNode import BSTNode

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

    def insert(self, element):
        if(self.isEmpty()):
            self.root = BSTNode(element)
        else:
            self.insertHelper(element, self.root)

    def insertHelper(self, element, current):
        if ((element > current.element) - (element < current.element) == -1):
            if(current.left == None):
                current.left = BSTNode(element)
            else:
                self.insertHelper(element, current.left)
        else:
            if(current.right == None):
                current.right = BSTNode(element)
            else:
                self.insertHelper(element, current.right)
            
    def inOrder(self):
        if(self.isEmpty()):
            raise Exception("Can't do Traversal, BST is Empty!")
        print("***BST IN ORDER TRAVERSAL***")
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
        return self.getNodeHelper(self.root, element)

    def getNodeHelper(self, current, element):
        if(current == None):
            return None
        elif ((element > current.element) - (element < current.element) == 0):
            return current
        elif ((element > current.element) - (element < current.element) == -1):
            return self.getNodeHelper(current.left, element)
        else:
            return self.getNodeHelper(current.right, element)

    def getParent(self, element):
        if(self.isEmpty()):
            return None
        elif ((element > self.root.element)-(element < self.root.element)==0):
            raise Exception("Can't get parent of "+str(element)+", this is the Root Node!")
        else:
            return self.getParentHelper(self.root, element)

    def getParentHelper(self, current, element):
        if(current == None):
            return None
        elif((element > current.element)-(element < current.element)==-1):
            if((element > current.left.element)-(element < current.left.element)==0):
                return current
            else:
                return self.getParentHelper(current.left,element)
        else:
            if((element > current.right.element)-(element < current.right.element)==0):
                return current
            else:
                return self.getParentHelper(current.right, element)