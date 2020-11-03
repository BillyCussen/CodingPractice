"""
RoomApp.py
Billy Cussen
24/09/2020
"""

#Variables
inputCheck = True
repeat = "y"

#Object
import gc
import Room
from Room import myRoom

while repeat == "y":

    #User Input - Length
    while inputCheck:

        try:
            length = float(input("Enter the length of the Room: "))
            length = round(length, 2)
        except:
            print("You need to enter a Number!")
        else:
            if length < 0:
                print("You need to enter a Number greater than 0")
            else:
                inputCheck = False

    #User Input - Width
    while inputCheck == False:
        try:
            width = float(input("Enter the width of the Room: "))
            width = round(width, 2)
        except:
            print("You need to enter a Number!")
        else:
            if width < 0:
                print("You need to enter a number greater than 0")
            else:
                inputCheck = True

    #Process & Output
    roomApp = myRoom(length,width)
    print("Area of the Room is: "+str(roomApp.getArea()))
    print("Perimeter of the Room is: "+str(roomApp.getPerimeter()))
    #Run GC and free memory
    roomApp = None
    gc.collect()

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = str(input("Would you like to try again (\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if(repeat != "y" and repeat != "n"):
            print("You need to enter Y or N")
    
print("Thanks for using the App!")