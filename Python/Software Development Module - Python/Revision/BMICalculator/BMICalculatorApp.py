"""
BMICalculatorApp.py
Billy Cussen
21/10/2020
"""

#Objects
import gc
import BMICalculator
from BMICalculator import myBMICalculator

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = False

    #Input - Weight?
    while inputCheck == False:
        try:
            weight = float(input("Please enter Weight in KG: "))
            if weight <= 0:
                raise Exception
        except Exception as e:
            print("Please enter a Valid Number as your weight (e.g. 82)")
        else:
            inputCheck = True

    #Input - Height?
    while inputCheck:
        try:
            height = float(input("Please enter your your Height in Metres (e.g. 1.7): "))
            if height <= 0:
                raise Exception
        except Exception as e:
            print("You need to enter a Valid Number as your Height (e.g. 1.8)!")
        else:
            inputCheck = False

    #Process and Output
    myBMICalculatorApp = myBMICalculator(weight,height)
    print(myBMICalculatorApp.calculateBMI())
    myAirlineApp = None
    gc.collect()

    repeat = ""
    while repeat.lower() != "y" and repeat.lower() != "n":
        repeat = str(input("Please enter \"y\" to repeat and \"n\" to exit: "))
        if repeat.lower() != "y" and repeat.lower != "n":
            print("You need to enter \"y\" or \"n\"")

print("Thanks for using my BMI Calculator App")