"""
Node.py
Billy Cussen
02/02/2021
"""

class Node:

    def __init__(self, element):
        self.element = element
        self.left = None
        self.right = None

    def toString(self):
        leftNode = "NULL" if self.left == None else str(self.left.element)
        rightNode = "NULL" if self.right == None else str(self.right.element)
        return "Current: "+str(self.element)+", Left: "+leftNode+", Right: "+rightNode
