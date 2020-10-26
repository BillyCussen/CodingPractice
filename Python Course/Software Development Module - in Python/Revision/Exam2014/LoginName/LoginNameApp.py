"""
LoginNameApp.py
Billy Cussen
26/10/2020
"""
#A startup company has an application that creates login names for their employees. The application prompts the user to enter a name (in lowercase letters) in the format "forename surname".
#a. the login name starts with the surname
#b. the forename without the consonants is added after the surname (i.e. the modified version of the forename keeps only the vowels).

#Object
import re
import gc
import LoginName
from LoginName import myLoginName

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = False

    #Input - Full Name
    while inputCheck == False:
        try:
            fullname = input(str("Please enter your full name: "))
            fullname = fullname.lower()
            if re.search("^[a-zA-z ]*$", fullname)==False or len(fullname)==0:
                raise Exception
        except Exception as e:
            print("Your name needs to be in the format \"Forname Surname\" (e.g. Joe Bloggs)")
        else:
            inputCheck = True

    #Process & Output
    myLoginNameApp = myLoginName(fullname)
    print(myLoginNameApp.generateUsername())
    myLoginNameApp = None
    gc.collect()

    #Input - Retry?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to continue and \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter either \"y\" or \"n\"!")

print("Thanks for using my Login App!")