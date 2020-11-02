"""
SalaryIncrease.py
Billy Cussen
01/11/2020
"""

class mySalaryIncrease:

    def __init__(self, employees):
        self.employees = employees
        self.maxSalary = 0.0
        self.salaryIncreases = []

    def getSalaryIncrease(self):
        newSalary = 0.0
        position = 0
        self.maxSalary = self.employees[0].getSalary()
        for emp in self.employees:
            self.salaryIncreases.append("")
            if emp.getYears() <= 5:
                if emp.getPosition() == "manager":
                    newSalary = emp.getSalary() * 1.02
                elif emp.getPosition() == "team leader":
                    newSalary = emp.getSalary() * 1.025
                else:
                    newSalary = emp.getSalary() * 1.03
            else:
                if emp.getPosition() == "manager":
                    newSalary = emp.getSalary() * 1.03
                elif emp.getPosition() == "team leader":
                    newSalary = emp.getSalary() * 1.04
                else:
                    newSalary = emp.getSalary() * 1.04  

            self.salaryIncreases[position] = "Employee "+str(position+1)+"'s new Salary is: "+str(newSalary)
            position = position + 1
            if newSalary > self.maxSalary:
                self.maxSalary = newSalary
        
        return self.salaryIncreases

    def getMaxSalary(self):
        return self.maxSalary