"""
BSTNode.py
Billy Cussen
09/12/2020
"""

class BSTNode:
    def __init__(self, element):
        self.element = element
        self.left = None
        self.right = None

    def toString(self):
        left = "NULL" if self.left == None else str(self.left.element)
        right = "NULL" if self.right == None else str(self.right.element)
        return "Current: "+str(self.element)+", Left: "+left+", Right: "+right
