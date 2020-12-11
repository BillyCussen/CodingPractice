"""
BST.py
Billy Cussen
10/12/2020
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
            self.insertHelper(self.root, element)

    def insertHelper(self, current, element):
        if ((element > current.element)-(element < current.element)==-1):
            if current.left == None:
                current.left = BSTNode(element)
            else:
                return self.insertHelper(current.left, element)
        else:
            if current.right == None:
                current.right = BSTNode(element)
            else:
                return self.insertHelper(current.right,element)

    def inOrder(self):
        if self.isEmpty():
            print("Unable to do In Order Traversal, BST is Empty!")
        else:
            print("***BST IN ORDER TRAVERSAL***")
            self.inOrderHelper(self.root)
            print("***END***")

    def inOrderHelper(self, current):
        if current == None:
            return
        self.inOrderHelper(current.left)
        print(current.toString())
        self.inOrderHelper(current.right)

    def max(self):
        if(self.isEmpty()):
            return 0
        else:
            return self.maxHelper(self.root)

    def maxHelper(self, current):
        if current==None:
            return None
        if current.right == None:
            return current.element
        else:
            return self.maxHelper(current.right)

    def min(self):
        if(self.isEmpty()):
            return 0
        return self.minHelper(self.root)

    def minHelper(self, current):
        if current == None:
            return None
        else:
            if current.left == None:
                return current.element
            else:
                return self.minHelper(current.left)

    def remove(self, element):
        if self.isEmpty():
            return "Can't remove "+str(element)+", BST is Empty!"
        elif element == self.root.element:
            return "Can't remove "+str(element)+", element is the Root Node"
        
        toRemove = self.findNode(self.root, element)
        parentNode = self.findParent(self.root, element)

        if toRemove.left == None and toRemove.right == None:
            if((toRemove.element > parentNode.element)-(toRemove.element < parentNode.element)==-1):
                parentNode.left = None
            else:
                parentNode.right = None
            return True
        elif toRemove.left != None and toRemove.right == None:
            if((toRemove.element > parentNode.element)-(toRemove.element < parentNode.element)==-1):
                parentNone.left = toRemove.left
            else:
                parentNode.right = toRemove.left
            return True
        elif toRemove.left == None and toRemove.right != None:
            if((toRemove.element > parentNode.element)-(toRemove.element < parentNode.element)==-1):
                parentNode.left = toRemove.right
            else:
                parentNone.right = toRemove.right
            return True
        elif toRemove.left != None and toRemove.right != None:
            maxElement = self.maxHelper(toRemove.left)

            replacement = self.findNode(maxElement, self.root)
            replacementParent = self.findParent(maxElement, self.root)

            replacementParent.right = replacement.left
            toRemove.element = replacement.element
            return True
        return False
        
    def findNode(self, current, element):
        if current == None:
            return None

        if ((element > current.element)-(element < current.element)==0):
            return current
        elif ((element > current.element)-(element < current.element)==-1):
            return self.findNode(current.left, element)
        else:
            return self.findNode(current.right, element)

    def findParent(self, current, element):
        if current == None:
            return None
        elif element == self.root.element:
            return None

        if ((element > current.element)-(element < current.element)==-1):
            if((element > current.left.element)-(element < current.left.element)==0):
                return current
            else:
                return self.findParent(current.left, element)
        else:
            if((element > current.right.element)-(element < current.right.element)==0):
                return current
            else:
                return self.findParent(current.right, element)

            
