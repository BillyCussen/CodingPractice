"""
BinApp.py
Billy Cussen
03/10/2020
"""

#Objects
import gc
import Bin 
from Bin import myBin

#Variables
repeat = "y"
inputCheck = True

while repeat == "y":

    #Input - Bin Color?
    while inputCheck:
        try:
            binColor = str(input("Please enter your Bin Color (\"Green\", \"Black\" or \"Brown\"): "))
            binColor = binColor.lower()
        except:
            print("You need to enter the bins color!")
        else:
            if(binColor != "green" and binColor != "black" and binColor != "brown"):
                print("You need to enter \"Green\", \"Black\" or \"Brown\"!")
            else:
                inputCheck = False

    #Input - Apartment Number?
    while inputCheck == False:
        try:
            apartmentNumber = int(input("Please enter your Apartment Number: "))
        except:
            print("You need to enter a number for your apartment!")
        else:
            if(apartmentNumber <= 0 or apartmentNumber > 255):
                print("You need to enter an Integer between 1 and 255!")
            else:
                inputCheck = True

    #Process & Output
    myBinApp = myBin(binColor, apartmentNumber)
    myBinApp.computeCollectionDay()
    myBinApp = None
    gc.collect()

    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"Y\" to continue or \"N\" to quit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat !="n":
            print("You need to enter \"y\" or \"n\"")
    
print("Thanks for using my App!")