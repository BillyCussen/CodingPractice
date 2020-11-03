"""
ServiceApp.py
Billy Cussen
27/09/2020
"""

import gc
import Service
from Service import myService

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            serviceType = str(input("Please enter the Type of Service You Would like (\"Pre\",\"Interim\" or \"Full\"): "))
            serviceType = serviceType.lower()
        except:
            print("You need to enter one of the Above listed Types")
        else:
            if serviceType != "pre" and serviceType != "interim" and serviceType != "full":
                print("You need to enter \"Pre\",\"Interim\" or \"Full\"")
            else:
                inputCheck = False

    while inputCheck == False:
        try:
            serviceLocation = str(input("Please enter where you want to Attend (\"Drogheda\" or \"Blanchardstown\"): "))
            serviceLocation = serviceLocation.lower()
        except:
            print("You need to enter one of the Above listed Types")
        else:
            if serviceLocation != "drogheda" and serviceLocation != "blanchardstown":
                print("You need to enter \"Drogheda\" or \"Blanchardstown\"")
            else:
                inputCheck = True

    myServiceApp = myService(serviceType,serviceLocation)
    print(myServiceApp.computeAndGetServiceDay())
    myServiceApp = None
    gc.collect()
    
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to repeat(\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("Please enter \"Y\" or \"N\"")
    
print ("Thanks for using my App!")