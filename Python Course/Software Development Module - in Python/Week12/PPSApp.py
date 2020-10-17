"""
PPSApp.py
Billy Cussen
17/10/2020
"""

#Objects
import gc
import PPS 
from PPS import myPPS

#Variables
retry = "y"


while retry == "y":

    inputCheck = True

    #Input
    while inputCheck:
        try:
            pps = str(input("Please enter your PPS Number: "))
            if(pps == ""):
                raise Exception("You can't enter anything blank, please enter your 8 Character PPS Number")
        except Exception as e:
            print(str(e))
        else:
            inputCheck = False

    myPPSApp = myPPS(pps)
    print(myPPSApp.checkPPS())
    myPPSApp = None
    gc.collect

    retry = ""
    while retry != "y" and retry != "n":
        retry = str(input("Please enter \"Y\" to retry or\"N\" to exit: "))
        retry = retry.lower()
        if retry != "y" and retry != "n":
            print("You need to enter \"Y\" or \"N\" (any case)")

print("Thanks for using my PPS App")