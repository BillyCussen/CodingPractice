"""
PayApp.py
Billy Cussen
27/09/2020
"""

import gc
import Pay
from Pay import myPay

repeat = "y"

while repeat == "y":

    inputCheck = True

    #Input - Hours Worked (Regular)
    while inputCheck:
        try:
            hours = float(input("Please enter your Regular Hours worked this week: "))
        except:
            print("You need to enter a number!")
        else:
            if hours < 0:
                print("You need to enter a number greater than 0")
            else:
                inputCheck = False

    #Input - Hours Worked (Overtime)
    while inputCheck == False:
        try:
            overtime = float(input("Pleas enter your Overtime Hours worked this week: "))
        except:
            print("You need to enter a number!")
        else:
            if overtime < 0:
                print("You need to enter a number greater than 0")
            elif hours < 40 and overtime != 0:
                print("You can't enter Overtime if you've worked less than 40 hours, enter 0 please")
            else:
                inputCheck = True

    #Input - Rate of Pay
    while inputCheck:
        try:
            payRate = float(input("Please enter your Rate of Pay Per Hour: "))
        except:
            print("You need to enter a number!")
        else:
            if payRate < 0:
                print("You need to enter a number greater than 0")
            elif payRate < 10.10:
                print("You can't enter under Minimum Wage in Ireland")  
            else:
                inputCheck = False

    #Process & Output
    myPayApp = myPay(hours,overtime,payRate)
    myPayApp.calculatePay()
    print("Your Regular Pay: "+str(myPayApp.totalRegularPay))
    print("Your Overtime Pay: "+str(myPayApp.totalOverTime))  
    print("TOTAL PAY: "+str(myPayApp.totalPay))

    #Input - Use the App Again?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to retry or not(\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print ("You need to enter Y or N!")
        
print ("Thanks for using my App!")
            