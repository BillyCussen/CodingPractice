"""
Eggs.py
Billy Cussen
25/09/2020
"""

class myEggs:
    def __init__(self, eggs):
        self.eggs = eggs
        self.dozen = 12
        self.boxes = 0
        self.remainder = 0

    def computeBoxesAndRemainder(self):
        self.boxes = int(self.eggs / self.dozen)
        self.remainder = int(self.eggs % self.dozen)
