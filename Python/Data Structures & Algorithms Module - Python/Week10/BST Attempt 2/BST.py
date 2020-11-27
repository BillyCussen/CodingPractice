"""
BST.py
Billy Cussen
27/11/2020
"""

from Node import Node

class BST:
    def __init__(self):
        self.root = None

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

    def insert(self,element):
        if self.isEmpty():
            self.root = Node(element)
        else:
            self.insertHelper(self.root, element)

    def insertHelper(self, current, element):
        if ((element > current.element)-(element < current.element))==-1:
            if current.left == None:
                current.left = Node(element)
            else:
                self.insertHelper(current.left, element)
        else:
            if current.right == None:
                current.right = Node(element)
            else:
                self.insertHelper(current.right,element)

    def depth(self):
        if self.isEmpty():
            raise Exception("Can't get Depth, BST is Empty!")
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
            raise Exception("Can't get Min, BST is Empty!")
        return self.minHelper(self.root)

    def minHelper(self,current):
        if current == None:
            return None

        if current.left == None:
            return current.element
        return self.minHelper(current.left)

    def max(self):
        if self.isEmpty():
            raise Exception("Can't get Max, BST is Empty!")
        return self.maxHelper(self.root)

    def maxHelper(self, current):
        if current == None:
            return None

        if current.right == None:
            return current.element
        return self.maxHelper(current.right)

    def contains(self, element):
        if self.isEmpty():
            raise Exception("Can't locate "+str(element)+", BST is Empty!")
        return self.containsHelper(self.root, element)

    def containsHelper(self, current, element):
        if current == None:
            return False

        if ((element > current.element)-(element < current.element))==0:
            return True
        elif ((element > current.element)-(element < current.element))==-1:
            return self.containsHelper(current.left, element)
        else:
            return self.containsHelper(current.right, element)

    def findParent(self, element):
        if self.isEmpty():
            raise Exception("Can't find parent of "+str(element)+", BST is Empty!")
        elif element == self.root.element:
            raise Exception("Can't get Parent of "+str(element)+", this is the Root Node's value")
        else:
            return self.findParentHelper(self.root, element)

    def findParentHelper(self, current, element):
        if current == None:
            raise Exception("Parent doesn't exist for "+str(element))
        
        if((element > current.element)-(element < current.element)==-1):
            if((element > current.left.element)-(element < current.left.element) == 0):
                return current
            else:
                return self.findParentHelper(current.left,element)
        else:
            if((element > current.right.element)-(element < current.right.element) == 0):
                return current
            else:
                return self.findParentHelper(current.right,element)


    def getNode(self, element):
        if self.isEmpty():
            raise Exception("Can't get Node, BST is Empty!")
        return self.getNodeHelper(self.root, element)

    def getNodeHelper(self, current, element):
        if current == None:
            return 

        if((element > current.element)-(element < current.element))==0:
            return current
        elif((element > current.element)-(element < current.element))==-1:
            return self.getNodeHelper(current.left, element)
        else:
            return self.getNodeHelper(current.right, element)

    def inOrder(self):
        if self.isEmpty():
            raise Exception("Unable to perform In Order Traversal, BST is Empty!")
            
        print("***BST IN ORDER TRAVERSAL***")
        self.inOrderHelper(self.root)
        print("***END***")

    def inOrderHelper(self, current):
        if(current==None):
            return

        self.inOrderHelper(current.left)
        print(current)
        self.inOrderHelper(current.right)



    def remove(self, element):
        if self.isEmpty():
            raise Exception("Can't remove "+str(element)+", the BST is Empty!")
        current = self.getNode(element)

        if current == None:
            raise Exception("Can't remove "+str(element)+", it does not exist in the BST!")

        parent = self.findParent(element)

        if current.left == None and current.right == None:
            if ((current.element > parent.element)- (current.element < parent.element) == -1):
                parent.left = None
            else:
                parent.right = None
            return element
        elif current.left != None and current.right == None:
            if ((current.element > parent.element)-(current.element < parent.element)==-1):
                parent.left = current.left
            else:
                parent.right = current.left
            return element
        elif current.left == None and current.right != None:
            if ((current.element > parent.element)-(current.element < parent.element)==-1):
                parent.left = current.right
            else:
                parent.right = current.right
            return element
        elif current.left != None and current.right != None:
            maxVal = self.maxHelper(current.left)
            replacement = self.getNode(maxVal)
            replacementParent = self.findParent(maxVal)
            replacementParent.right = replacement.left
            current.element = replacement.element
            return element
        return None
