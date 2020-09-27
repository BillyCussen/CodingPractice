"""
Shop.py
Billy Cussen
27/09/2020
"""

#Class Declaration
class myShop:

    #Constructor
    def __init__(self, hoodies, tshirts, caps):
        self.hoodies = hoodies
        self.tshirts = tshirts
        self.caps = caps
        self.PRICEPERHOODY = 25.99
        self.PRICEPERTSHIRT = 12.99
        self.PRICEPERCAP = 6.99

    #Compute
    def computeTotal(self):
        return (self.hoodies*self.PRICEPERHOODY)+(self.tshirts*self.PRICEPERTSHIRT)+(self.caps*self.PRICEPERCAP)
