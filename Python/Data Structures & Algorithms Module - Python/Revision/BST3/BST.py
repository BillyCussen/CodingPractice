"""
BST.py
Billy Cussen
03/02/2021
"""
from Node import Node

class BST:

    def __init__(self):
        self.root = None

    def isEmpty(self):
        return self.root == None

    def insert(self, element):
        if self.isEmpty():
            self.root = Node(element)
        else:
            self.insertHelper(element, self.root)

    def insertHelper(self, element, current):
        if (element > current.element)-(element < current.element)==-1:
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
            return "Its Empty!"
        result = "***BST IN ORDER TRAVERSAL***\n"
        result+= self.inOrderHelper(self.root)
        result+= "***END***"
        return result

    def inOrderHelper(self, current):
        result=""
        if current == None:
            return ""
        result+= self.inOrderHelper(current.left)
        result+= current.toString()+"\n"
        result+= self.inOrderHelper(current.right)
        return result

    def contains(self, element):
        if self.isEmpty():
            return False
        return self.containsHelper(element, self.root)

    def containsHelper(self, element, current):
        if current == None:
            return False
        elif (element > current.element)-(element < current.element)==0:
            return True
        elif (element > current.element)-(element < current.element)==-1:
            return self.containsHelper(element, current.left)
        else:
            return self.containsHelper(element, current.right)

    def findNode(self, element):
        if self.isEmpty() or self.contains(element)==False:
            return None
        return self.findNodeHelper(element, self.root)

    def findNodeHelper(self, element, current):
        if (element > current.element)-(element < current.element)==0:
            return current
        elif (element > current.element)-(element < current.element)==-1:
            return self.findNodeHelper(element, current.left)
        else:
            return self.findNodeHelper(element, current.right)

    def findParent(self, element):
        if self.isEmpty() or self.contains(element)==False or self.root.element == element:
            return None
        return self.findParentHelper(element, self.root)

    def findParentHelper(self, element, current):
        if(element > current.element)-(element < current.element)==-1:
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
        if self.isEmpty() or self.contains(element)==False:
            return False
        
        toRemove = self.findNode(element)
        parentNode = self.findParent(element)

        if toRemove.left == None and toRemove.right == None:
            if (toRemove.element > parentNode.element)-(toRemove.element < parentNode.element) == -1:
                parentNode.left = None
            else:
                parentNode.right = None
            return True
        elif toRemove.left != None and toRemove.right == None:
            if (toRemove.element > parentNode.element)-(toRemove.element < parentNode.element) == -1:
                parentNode.left = toRemove.left
            else:
                parentNode.right = toRemove.left
            return True
        elif toRemove.left == None and toRemove.right != None:
            if (toRemove.element > parentNode.element)-(toRemove.element < parentNode.element) == -1:
                parentNode.left = toRemove.right
            else:
                parentNode.right = toRemove.right
            return True
        return False

    
