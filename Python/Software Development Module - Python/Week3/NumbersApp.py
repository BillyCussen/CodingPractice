""""
NumbersApp.py
Billy Cussen
25/09/2020
"""

import Numbers
from Numbers import myNumbers

inputCheck = True
repeat = "y"

while repeat == "y":

    #User Input - Number 1
    while inputCheck:

        try:
            one = int(input("Please enter Number 1: "))
        except:
            print("You need to enter an Integer")
        else:
            if one <= 0:
                print("Your input needs to be greater than 0")
            else:
                inputCheck = False

    #User Input - Number 2
    while inputCheck == False:

        try:
            two = int(input("Please enter Number 2: "))
        except:
            print("You need to enter an Integer")
        else:
            if two <= 0:
                print("Your input needs to be greater than 0")
            else:
                inputCheck = True

    #Process & Output
    numberApp = myNumbers(one,two)
    print("The Sum of these Numbers is: "+str(numberApp.getSum()))

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to retry or not (\"y\" or \"n\"): "))
        repeat = repeat.lower()
        if(repeat != "y" and repeat != "n"):
            print("You need to enter Y or N")

print("Thanks for using the App!")