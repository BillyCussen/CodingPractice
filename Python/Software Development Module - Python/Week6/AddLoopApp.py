"""
AddLoopApp.py
Billy Cussen
28/09/2020
"""

import gc
import AddLoop
from AddLoop import myLoop

repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            number = int(input("Please enter a Number: "))
        except:
            print("You need to enter a number!")
        else:
            if(number <= 0):
                print("You need to enter a number greater than 0")
            else:
                inputCheck = False

    myLoopApp = myLoop(number)
    myLoopApp.executeLoop()
    myLoopApp = None
    gc.collect()

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter Y or N to repeat: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"Y\" or \"N\"!")
        
print("Thanks for using my App")