"""
DLNode.py
Billy Cussen
07/12/2020
"""

class DLNode:
    def __init__(self, element, previous, successor):
        self.element = element
        self.previous = previous
        self.successor = successor