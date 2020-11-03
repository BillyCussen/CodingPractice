"""
SchoolSuppliesApp.py
Billy Cussen
28/10/2020
"""

#Object
import gc
import Encoder
from SchoolSupplies import mySchoolSupplies

repeat = "y"

while repeat == "y":

    inputCheck = False
    #Input - Supply Types?
    while inputCheck == False:
        try: 
            quantity = int(input("Please enter the Number of Supply Types you will be requesting: "))
            if quantity <= 0:
                raise Exception
        except Exception as e:
            print("You need to enter a number greater than 0")
        else:
            inputCheck = True

    supplyQuantity = []
    supplyCost = []
    iterator = 0

    #Quantity of each!
    while iterator < quantity:
        inputCheck = True
        while inputCheck:
            try: 
                numTemp = int(input("Please enter the Quantity of Supply Type "+str(iterator+1)+": "))
                if numTemp <= 0:
                    raise Exception
            except Exception as e:
                print("You need to enter a number greater than 0")
            else:
                inputCheck = False
                supplyQuantity.append(numTemp)

        iterator=iterator+1
    
    #Cost of each!
    iterator = 0
    while iterator < quantity:
        inputCheck = True
        while inputCheck:
            try: 
                numTemp = float(input("Please enter the Cost of Supply Type "+str(iterator+1)+": "))
                if numTemp <= 0:
                    raise Exception

            except Exception as e:
                print("You need to enter a number greater than 0")
            else:
                inputCheck = False
                supplyCost.append(numTemp)
        iterator=iterator+1

    #Process and Output
    mySchoolSuppliesApp = mySchoolSupplies(supplyQuantity, supplyCost)
    print(mySchoolSuppliesApp.calculateSupplies())
    mySchoolSuppliesApp = None
    gc.collect()

    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to retry, \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"y\" or \"n\"")

print("Thanks for using my School Supply App!")