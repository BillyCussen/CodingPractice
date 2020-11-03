"""
SalaryIncreaseApp.py
Billy Cussen
01/11/2020
"""

#Object
import os
import gc
import SalaryIncrease
from SalaryIncrease import mySalaryIncrease
import EmployeeInfo
from EmployeeInfo import myEmployeeInfo

#Variables
repeat = "y"
result = ""
maxSalary = 0.0

while repeat == "y":

    inputCheck = False
    employees = []
    salaryIncreases = []
    history = []

    #Input - Number of Employees
    while inputCheck == False:
        try:
            numberOfEmployees = int(input("Please enter the number of Employees to be checked (5 max): "))
            if numberOfEmployees <= 0 or numberOfEmployees > 5:
                raise Exception
        except Exception:
            print("You need to enter a number between 0 and 5")
        else:
            inputCheck = True

    for i in range(numberOfEmployees):
        employees.append(myEmployeeInfo())
        inputCheck = True
        #Input - Get Employees Position
        while inputCheck:
            try:
                position = str(input("Please enter Position for Employee "+str(i+1)+" (\"Manager\", \"Team Leader\" or \"Software Developer\"): "))
                position = position.lower()
                if position != "manager" and position != "team leader" and position != "software developer":
                    raise Exception
            except Exception as e:
                print("You need to select \"Manager\", \"Team Leader\" or \"Software Developer\"")
            else:
                employees[i].setPosition(position)
                inputCheck = False

        #Input - Get Employee Salary
        while inputCheck == False:
            try:
                salary = float(input("Please enter the Salary for Employee "+str(i+1)+": "))
                if salary <= 0.0:
                    raise Exception
            except Exception:
                print("You need to enter a valid number for the Employees salary")
            else:
                employees[i].setSalary(salary)
                inputCheck = True

        #Input - Get Number of Years worked
        while inputCheck:
            try:
                years = int(input("Please enter Number of Years Worked for Employee "+str(i+1)+": "))
                if years < 0:
                    raise Exception
            except Exception:
                print("You need to enter an Integer to represent the Years Worked!")
            else:
                employees[i].setYears(years)
                inputCheck = False

    #Process
    mySalaryIncreaseApp = mySalaryIncrease(employees)
    salaryIncreases = mySalaryIncreaseApp.getSalaryIncrease()
    maxSalary = mySalaryIncreaseApp.getMaxSalary()
    mySalaryIncreaseApp = None
    gc.collect()

    #Output
    print("\n***SALARY INCREASE RESULTS***")
    for employee in salaryIncreases:
        result = result + employee +"\n"
        print(employee)

    history.append(result)
    print("Max Salary is: "+str(maxSalary))

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to retry and \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"y\" or \"n\"")

#Write History to Text File
mydir = 'C:/Users/billy/Desktop/Coding/Python Course/Software Development Module - in Python/Revision/Exam2017/SalaryIncrease'
myfile = 'SalaryIncreasesApp.txt'
filePath = os.path.join(mydir, myfile)

file1 = open(filePath,"r+") 
file1.truncate(0)

file1.write("***SALARY INCREASES APP HISTORY***\n")
for result in history:    
    file1.write(result+"\n")
file1.close()
file1 = None

#Read Contents and print Results
with open(filePath) as text_file:
    contents = text_file.read()
print(contents)

gc.collect()

print("Thanks for using my Salary Increase Calculator App!")