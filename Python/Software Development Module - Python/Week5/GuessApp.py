"""
GuessApp.py
Billy Cussen
27/09/2020
"""

#Objects
import gc
import Guess
from Guess import myGuess

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            number = int(input("Please enter a Number between 1 and 10: "))
        except:
            print ("You need to enter an Integer between 1 and 10")
        else:
            if number <= 0 or number > 10:
                print ("Your choice needs to be between 1 and 10")
            else:
                inputCheck = False

    myGuessApp = myGuess(number)
    print(myGuessApp.computeAnswer())
    myGuessApp = None
    gc.collect()

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to repeat(\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("Please enter \"Y\" or \"N\"")
    
print ("Thanks for using my App!")