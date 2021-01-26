"""
Node.py
Billy Cussen
26/01/2021
"""

class Node:

    def __init__(self, element):
        self.element = element
        self.left = None
        self.right = None

    def toString(self):
        leftNode = "NULL" if self.left == None else self.left.element
        rightNode = "NULL" if self.right == None else self.right.element
        return "Element: "+str(self.element)+", Left: "+str(leftNode)+", Right: "+str(rightNode)