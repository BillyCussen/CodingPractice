"""
Node.py
Billy Cussen
18/01/2021
"""

class Node:

    def __init__(self, element):
        self.element = element
        self.left = None
        self.right = None

    def toString(self):
        left = "NULL" if self.left == None else str(self.left.element)
        right = "NULL" if self.right == None else str(self.right.element)
        return "Current: "+str(self.element)+", Left: "+left+", Right: "+right