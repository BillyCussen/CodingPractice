"""
BSTNode.py
Billy Cussen
10/12/2020
"""

class BSTNode:

    def __init__(self, element):
        self.element = element
        self.left = None
        self.right = None


    def toString(self):
        leftNode = "NULL" if self.left == None else str(self.left.element)
        rightNode = "NULL" if self.right == None else str(self.right.element)
        return "Current: "+str(self.element)+", Left: "+leftNode+", Right: "+rightNode
