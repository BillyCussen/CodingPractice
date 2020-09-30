"""
AverageApp.py
Billy Cussen
01/10/2020
"""

#Object
import gc
import Average
from Average import myAverage

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            arraySize = int(input("Please enter the Size of the Array (between 1 and 10): "))
        except:
            print("You need to enter an Integer between 1 and 10!")
        else:
            if arraySize <= 0 or arraySize > 10:
                print("You need to enter an Integer between 1 and 10!")
            else:
                inputCheck = False
    
    arrayNumbers = []

    for i in range(arraySize):
        inputCheck = True
        while inputCheck:
            try:
                arrayNumbers.append(int(input("Please enter Number "+str(i+1)+" of the Array: ")))
            except:
                print("You need to enter an Integer!")
            else:
                if arrayNumbers[i] <= 0:
                    print("You need to enter an Integer greater than 0!")
                else:
                    inputCheck = False

    #Process & Output
    myAverageApp = myAverage(arrayNumbers)
    myAverageApp.calculateAverage()
    print("Average of the Array is: "+str(myAverageApp.average))
    print("Maximum Value is: "+str(myAverageApp.max))
    print("Minimum Value is: "+str(myAverageApp.min))
    myAverageApp = None
    gc.collect()

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"Y\" to retry, enter \"N\" to Exit: "))
        repeat = repeat.lower()

        if repeat !="y" and repeat!="n":
            print("You need to enter \"Y\" or \"N\"")
    
print ("Thanks for using my App!")