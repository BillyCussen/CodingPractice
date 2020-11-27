"""
BinarySearchTree.py
Billy Cussen
25/11/2020
"""

from BSTNode import BSTNode

class BinarySearchTree:

    def __init__(self):
        self.root = None

    def insert(self, element):
        if self.isEmpty():
            self.root = BSTNode(element)
        else:
            self.insertHelper(element,self.root)

    def insertHelper(self, element, current):
        if ((element > current.element) - (element < current.element)) == -1:
            if(current.left == None):
                current.left = BSTNode(element)
            else:
                self.insertHelper(element,current.left)
        elif ((element > current.element) - (element < current.element)) == 1:
            if(current.right == None):
                current.right = BSTNode(element)
            else:
                self.insertHelper(element,current.right)

    def inOrder(self):
        if self.isEmpty():
            raise Exception("Can't do in order traversal, the BST is empty!")
        print("***BST In Order Traversal***\n")
        self.inOrderHelper(self.root)
        print("***END***")

    def inOrderHelper(self, current):
        if current == None:
            return
        
        self.inOrderHelper(current.left)
        print(current.toString())
        self.inOrderHelper(current.right)

    def isEmpty(self):
        return self.root == None

    def size(self):
        if self.isEmpty():
            raise Exception("Can't get Size, BST is Empty!")
        return self.sizeHelper(self.root)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.left)+self.sizeHelper(current.right)

    def getMin(self):
        if self.isEmpty():
            raise Exception("Can't get Minimum, BST is empty!")
        return self.getMinHelper(self.root)

    def getMinHelper(self,current):
        if current.left == None:
            return current.element
        else:
            return self.getMinHelper(current.left)   

    def getMax(self):
        if self.isEmpty():
            raise Exception("Can't get Max, BST is Empty!") 
        return self.getMaxHelper(self.root)

    def getMaxHelper(self, current):
        if(current.right==None):
            return current.element
        else:
            return self.getMaxHelper(current.right)

    def getNode(self, element):
        if self.isEmpty():
            raise Exception("Can't get Node, BST is Empty!")
        return self.getNodeHelper(self.root,element)

    def getNodeHelper(self, current, element):
        if(current==None):
            return None
        if ((element > current.element)-(element < current.element)) == 0:
            return current.toString()
        elif ((element > current.element)-(element < current.element)) == -1:
            return self.getNodeHelper(current.left,element)
        else:
            return self.getNodeHelper(current.right,element)

    def getParent(self, element):
        if self.isEmpty():
            raise Exception("Unable to get Parent, BST is Empty!")
        elif ((element > self.root.element)-(element < self.root.element))==0:
            raise Exception("Unable to get Parent, this element is the Root!")
        return self.getParentHelper(self.root,element)

    def getParentHelper(self, current, element):
        if(current==None):
            return None

        if ((element > current.element)-(element < current.element)) == -1:
            if((element > current.left.element)-(element < current.left.element)==0):
                return current.toString()
            else:
                return self.getParentHelper(current.left, element)
        else:
            if((element > current.right.element) - (element < current.right.element)==0):
                return current.toString()
            else:
                return self.getParentHelper(current.right, element)