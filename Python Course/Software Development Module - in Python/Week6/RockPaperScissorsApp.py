"""
RockPaperScissorsApp.py
Billy Cussen
28/09/2020
"""

import gc
import AddLoop
from RockPaperScissors import myRockPaperScissors

repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            number = int(input("Please enter a Number between 1 and 3 (1 is \"Rock\", 2 is \"Paper\", 3 is \"Scissors\"): "))
        except:
            print("You need to enter a number!")
        else:
            if(number < 1 or number > 3):
                print("You need to enter a number between 1 and 3 - 1 is \"Rock\", 2 is \"Paper\", 3 is \"Scissors\"")
            else:
                inputCheck = False

    myRPSApp = myRockPaperScissors(number)
    myRPSApp.checkWinner()
    myRPSApp = None
    gc.collect()

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter Y or N to repeat: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"Y\" or \"N\"!")
        
print("Thanks for using my App")