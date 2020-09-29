"""
CountingApp.py
Billy Cussen
29/09/2020
"""

#Objects
import re
import gc
import Counting
from Counting import myCounting

#Variables
repeat = "y"

#Greeting
print("***CHARACTER COUNTER APP***")

while repeat == "y":

    inputCheck = True

    #User Input
    while inputCheck:
        try:
            sentance = str(input("Please enter a Sentance: "))
        except:
            print("You need to enter a String (i.e. a Sentance or some characters..)")
        else: 
            if len(sentance) <= 3 or bool(re.search(r"\s", sentance)) == False:
                print("You need to enter a Sentance (e.g. with a few words!")
            else:
                inputCheck = False

    #Process and Output
    myCountingApp = myCounting(sentance)
    myCountingApp.calculateCharacters()
    myCountingApp = None
    gc.collect()

    repeat = ""

    #Input - Retry?
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to repeat(\"Y\" or \"N\"): "))
        repeat = repeat.lower()

        if repeat != "y" and repeat != "n":
            print ("You need to enter \"Y\" or \"N\"!")

print ("Thanks for using my App!")