"""
DLNode.py
Billy Cussen
06/01/2021
"""
class DLNode:
    def __init__(self, element, previous, successor):
        self.element = element
        self.previous = previous
        self.successor = successor