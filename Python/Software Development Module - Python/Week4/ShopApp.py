"""
ShopApp.py
Billy Cussen
27/09/2020
"""

#Objects
import gc
import Shop
from Shop import myShop

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True

    while inputCheck:
        try:
            hoodies = int(input("Please enter the Number of Hoodies being Purchased: "))
        except:
            print("You need to enter an Integer (e.g. 1)")
        else:
            if hoodies < 0:
                print("You need to enter a number greater than 0")
            else:
                inputCheck = False

    while inputCheck == False:
        try:
            tshirts = int(input("Please enter the Number of Tshirts being Purchased: "))
        except:
            print("You need to enter an Integer (e.g. 1)")
        else:
            if tshirts < 0:
                print("You need to enter a number greater than 0")
            else:
                inputCheck = True

    while inputCheck:
        try:
            caps = int(input("Please enter the Number of Caps being Purchased: "))
        except:
            print("You need to enter an Integer (e.g. 1)")
        else:
            if caps < 0:
                print("You need to enter a number greater than 0")
            else:
                inputCheck = False

    myShopApp = myShop(hoodies,tshirts,caps)
    total = myShopApp.computeTotal()
    myShopApp = None
    gc.collect()
    print ("The total of this purchase is: "+str(total))

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to repeat(\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("Please enter \"Y\" or \"N\"")
    
print ("Thanks for using my App!")