"""
SchoolSupplies.py
Billy Cussen
28/10/2020
"""
class mySchoolSupplies:
    def __init__(self, supplyQuantity, supplyCost):
        self.supplyQuantity = supplyQuantity
        self.supplyCost = supplyCost

    def calculateSupplies(self):
        cost = 0.0
        iterator = 0
        for e in self.supplyQuantity:
            cost = cost + (self.supplyQuantity[iterator]*self.supplyCost[iterator])
            iterator=iterator+1

        return "Total is: "+str(cost)