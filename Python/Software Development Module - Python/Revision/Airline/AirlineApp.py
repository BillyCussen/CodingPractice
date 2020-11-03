"""
AirlineApp.py
Billy Cussen
20/10/2020
"""
#Objects
import Airline
from Airline import myAirline
import gc

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = False

    #Input - Membership?
    while inputCheck == False:
        try:
            membership = str(input("Please enter your Membership Level (\"Gold\", \"Silver\" or \"Bronze\"): "))
            membership = membership.lower()
            if membership != "gold" and membership != "silver" and membership != "bronze":
                raise Exception
        except Exception as e:
            print("You need to enter Gold, Silver or Bronze")
        else:
            inputCheck = True

    #Input - Flights this year
    while inputCheck:

        try:
            flights = int(input("Please enter your your total flights with us this year: "))
            if flights < 0:
                raise Exception
        except Exception as e:
            print("You need to enter a Valid Number (e.g. 0, 1, 2)!")
        else:
            inputCheck = False

    #Process and Output
    myAirlineApp = myAirline(membership,flights)
    print(myAirlineApp.getPoints())
    myAirlineApp = None
    gc.collect()

    repeat = ""
    while repeat.lower() != "y" and repeat.lower() != "n":
        repeat = str(input("Please enter \"y\" to repeat and \"n\" to exit: "))
        if repeat.lower() != "y" and repeat.lower != "n":
            print("You need to enter \"y\" or \"n\"")

print("Thanks for using my Airline App")