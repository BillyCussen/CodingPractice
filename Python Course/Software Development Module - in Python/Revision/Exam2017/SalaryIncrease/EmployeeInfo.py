"""
EmployeeInfo.py
Billy Cussen
01/11/2020
"""

class myEmployeeInfo:
    def __init__(self, position, years, salary):
        self.position = position
        self.years = years
        self.salary = salary

    def __init__(self):
        self.position = ""
        self.years = 0
        self.salary = 0.0

    def setPosition(self, position):
        self.position = position

    def setYears(self, years):
        self.years = years
    
    def setSalary(self, salary):
        self.salary = salary

    def getPosition(self):
        return self.position

    def getYears(self):
        return self.years

    def getSalary(self):
        return self.salary
