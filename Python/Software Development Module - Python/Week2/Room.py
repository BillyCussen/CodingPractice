"""
Room.py
Billy Cussen
24/09/2020
"""

class myRoom:
    #Constructor
    def __init__(self, length, width):
        self.length = length
        self.width = width

    #Compute & Getters
    def getArea(self):
        return self.length * self.width

    def getPerimeter(self):
        return 2 * (self.length+self.width)