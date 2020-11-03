"""
Airline.py
Billy Cussen
20/10/2020
"""

class myAirline:
    def __init__(self, membership, flights):
        self.membership = membership
        self.flights = flights

    def getPoints(self):
        if self.membership == "bronze":
            if self.flights <= 3:
                return "Congratulations, you earned "+str(self.flights*2)+" points"
            else:
                return "Congratulations, you earned "+str(self.flights*3)+" points"
        elif self.membership == "silver":
            if self.flights <= 3:
                return "Congratulations, you earned "+str(self.flights*4)+" points"
            else:
                return "Congratulations, you earned "+str(self.flights*5)+" points"
        elif self.membership == "gold":
            if self.flights <= 3:
                return "Congratulations, you earned "+str(self.flights*6)+" points"
            else:
                return "Congratulations, you earned "+str(self.flights*7)+" points"
        else:
            return "Somethings went Wrong here!"