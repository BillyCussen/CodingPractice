"""
TemperatureApp.py
Billy Cussen
19/10/2020
"""

#Objects
import math
import gc
import Temperature
from Temperature import myTemperature

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:

        try:
            weeks = int(input("Please enter weeks to be checked (between 1 and 3): "))
            if weeks < 1 or weeks > 3:
                raise Exception
        except Exception as e:
            print("You need to enter a number between 1 and 3")
        else:
            if weeks >= 1 and weeks <= 3:
                inputCheck = False

    temperature = [[0 for j in range(7)] for i in range(weeks)] 

    for i in range(weeks):

        for j in range(7):

            while inputCheck == False:
                
                try:
                    temperature[i][j] = float(input("Please enter the Temperature for Week "+str(i+1)+", Day "+str(j+1)+": "))
                    if math.isnan(temperature[i][j]):
                        raise Exception
                except Exception as e:
                    print("You need to enter a valid number as the Temperature for Week "+str(i+1)+", day "+str(j+1)+"!")
                else:
                    inputCheck = True

            inputCheck = False

    #Process and Output
    myTemperatureApp = myTemperature(weeks,temperature)
    myTemperatureApp.getAverages()
    myTemperatureApp = None
    gc.collect()

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to retry or \"n\" to exit: "))
        if repeat.lower() != "y" and repeat.lower() != "n":
            print("You need to enter \"y\" or \"n\"")

print("Thanks for using my Temperature App!")