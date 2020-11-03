"""
Bakery.py
Billy Cussen
27/09/2020
"""

class myBakery:
    def __init__(self,items):
        self.items = items
        self.boxes = 0
        self.trips = 0
        self.itemsPerBox = 6
        self.boxesPerTrip = 2

    def calculateBoxesAndTrips(self):
        self.boxes = int(self.items/self.itemsPerBox)
        self.trips = int(self.boxes/self.boxesPerTrip)