"""
EggsApp.py
Billy Cussen
25/09/2020
"""
#Objects
import gc
import Eggs
from Eggs import myEggs

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            eggs = int(input("Please enter the number of eggs collected today: "))
        except:
            print("You need to enter an Integer (e.g. 1, 2)")
        else:
            if eggs < 0:
                print("You need to enter a number of 0 or greater")
            else:
                inputCheck = False

    eggsApp = myEggs(eggs)
    eggsApp.computeBoxesAndRemainder()
    print("Number of Boxes: "+str(eggsApp.boxes))
    print("Remaining Eggs: "+str(eggsApp.remainder))
    #Run GC and free memory
    eggsApp = None
    gc.collect()

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to repeat(\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter Y or N")
        
print("Thanks for using my App")