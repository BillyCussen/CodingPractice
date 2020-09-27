"""
CinemaApp.py
Billy Cussen
27/09/2020
"""

#Objects
import gc
import Cinema
from Cinema import myCinema

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            age = int(input("Please enter your Age: "))
        except:
            print ("You need to enter an Integer (e.g. 1, 10, 65)")
        else:
            if age < 0:
                print("You need to enter a Positive Number!")
            else:
                inputCheck = False

    myCinemaApp = myCinema(age)
    print(myCinemaApp.calculateTicketPrice())
    myCinemaApp = None
    gc.collect()

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to retry (\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print ("You need to enter \"Y\" or \"N\"")

print("Thanks for using my App!")