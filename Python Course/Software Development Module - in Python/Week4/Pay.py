"""
Pay.py
Billy Cussen
27/09/2020
"""

class myPay:
    def __init__(self,hours, overtime, payRate):
        self.hours = hours
        self.overtime = overtime
        self.payrate = payRate
        self.totalPay = 0
        self.totalOverTime = 0
        self.totalRegularPay = 0
        self.overtimeRate = 1.5

    def calculatePay(self):
        self.totalRegularPay = round(self.hours * self.payrate,2)
        self.totalOverTime = round(self.overtime * (self.payrate*self.overtimeRate),2)
        self.totalPay = round(self.totalRegularPay + self.totalOverTime,2)