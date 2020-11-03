"""
InterestCalculator.py
Billy Cussen
02/11/2020
"""

class myInterestCalculator:

    def __init__(self):
        self.interestTotal = 0.0

    def getInterest(self, amount, months, accessMoney):
        if months == 6:  
            if accessMoney:
                self.interestTotal = amount * 0.0002
            else:
                self.interestTotal = amount * 0.0005
        elif months == 12:
            if accessMoney:
                self.interestTotal = amount * 0.0015
            else:
                self.interestTotal = amount * 0.002
        elif months == 18:
            if accessMoney:
                self.interestTotal = amount * 0.002
            else:
                self.interestTotal = amount * 0.004
        else:
            raise Exception
        return self.interestTotal

    def getHighestInterest(self, allDeposits):
        highestInterest = allDeposits[0]
        for d in allDeposits:
            if d > highestInterest:
                highestInterest = d
        return highestInterest