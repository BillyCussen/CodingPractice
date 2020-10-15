"""
PhoneNumberApp.py
Billy Cussen
15/10/2020
"""

#Objects
import gc
import PhoneNumber
from PhoneNumber import myPhoneNumber

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = False

    #Input - Phone Number
    while inputCheck == False:
        try:
            phoneNumber = str(input("Please enter a Phone Number: "))
        except Exception as e:
            print("You need to enter a valid phone number")
        else:
            if(phoneNumber.find("-")!=3):
                print("This phone number is invalid, it needs a \"-\" after the prefix (e.g. 083-1234556)")
            elif(len(phoneNumber)!=11):
                print("Your phone number needs to have a length of 11 (e.g. 083-4444444)")
            else:
                inputCheck = True

    #Process and Output
    myPhoneNumberApp = myPhoneNumber(phoneNumber)
    myPhoneNumberApp.computePhoneNumber()
    myPhoneNumberApp = None
    gc.collect()

    #Input - Repeat?
    repeat = ""
    if repeat != "y" and repeat !="n":
        repeat = str(input("Please enter \"y\" to retry, \"n\" to Exit: "))
        if repeat != "y" and repeat != "n":
            print("Please enter \"y\" or \"n\"")
        

print("Thanks for using my Phone Number App!")