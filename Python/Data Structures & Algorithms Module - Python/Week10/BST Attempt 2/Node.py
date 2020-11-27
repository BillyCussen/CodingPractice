"""
Node.py
Billy Cussen
27/11/2020
"""

class Node:
    def __init__(self,element):
        self.element = element
        self.left = None
        self.right = None

    def __str__(self):
        leftNode = "NULL" if self.left == None else self.left.element
        rightNode = "NULL" if self.right == None else self.right.element
        return "Current: "+str(self.element)+", Left: "+str(leftNode)+", Right: "+str(rightNode)