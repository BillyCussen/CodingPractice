"""
BakeryApp.py
Billy Cussen
27/09/2020
"""
import gc
import Bakery
from Bakery import myBakery

repeat = "y"

while repeat == "y":

    inputCheck = True

    #Input - Get Items
    while inputCheck:

        try:
            items = int(input("Please enter how many items there are today: "))
        except:
            print("You need to enter an Integer (e.g. 1, 12)!")
        else:
            if items < 0:
                print ("You can't enter less than 0")
            else:
                inputCheck = False

    #Process & Output
    myBakeryApp = myBakery(items)
    myBakeryApp.calculateBoxesAndTrips()
    print("Total Boxes today: "+str(myBakeryApp.boxes))
    print("Total Trips today: "+str(myBakeryApp.trips))
    #GC to Free up Memory
    myBakeryApp = None
    gc.collect()

    repeat = ""
    #Input - Retry?
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to retry or not (\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print ("You need to enter \"Y\" or \"N\"!")

print("Thanks for using my App!")
            