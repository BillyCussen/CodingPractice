"""
Cinema.py
Billy Cussen
27/09/2020
"""

class myCinema:
    def __init__(self,age):
        self.age = age

    def calculateTicketPrice(self):
        if self.age <= 5 or self.age >= 65:
            return "You get in for Free!"
        elif self.age > 5 and self.age <= 14:
            return "Your ticket costs: 5.50"
        else:
            return "Your ticket costs: 10.50"
