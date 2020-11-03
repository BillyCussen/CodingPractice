"""
AreaCircle.py
Billy Cussen
23/09/2020
"""
from math import pi

inputCheck = False

while inputCheck == False:

    try:
        radius = float(input("Please enter the Circles Radius: "))
    except:
        print("You need to enter a Number!")
    else:
        if radius <= 0:
            print("Your input needs to be 1 or greater!")
        else:
            inputCheck = True
            print("The Area of this circle is: "+str(round(pi*(radius**2),2)))

print ("Thanks for using my App!")