"""
PasswordCheckerApp.py
Billy Cussen
31/10/2020
"""

#Write a Java(Python here) App takes in as a parameter a one-dimensional array of Strings which contains passwords
#The method should search (i.e. traverse) the array of passwords and display all the passwords which are weak.

#Password rules:
#A password must contain at least 10 characters.
#A password must consist of letters, digits & Characters.
#A password should contain at least two Characters.
#A password should contain at least one uppercase letter

#Object
import gc
import PasswordChecker
from PasswordChecker import myPasswordChecker

#Variables
repeat = "y"
passwordsList = []

while repeat == "y":

    #Input - Ticket Type
    inputCheck = False
    while inputCheck == False:
        try:
            numberOfPasswords = input("Please enter the number of Passwords to be checked: ")
            numberOfPasswords = int(numberOfPasswords)
            if numberOfPasswords <= 0 or numberOfPasswords > 10:
                raise Exception
        except Exception:
            print("Please enter a Valid number (e.g. 3)\nPlease remember you can only try a maximum of 10 Passwords per Check")
        else:
            inputCheck = True

    for i in range(numberOfPasswords):
        inputCheck = True
        while inputCheck:
            try:
                password = input(str("Please enter Password "+str(i+1)+": "))
                if len(password) < 10:
                    raise Exception
            except Exception:
                print("Password"+str(i+1)+" needs at least 10 characters!")
            else:
                passwordsList.append(password)
                inputCheck = False


    #Process & Output
    myPasswordCheckerApp = myPasswordChecker(passwordsList)
    try:
        print(myPasswordCheckerApp.getPasswords())
    except Exception as e:
        print(e)
    else:
        myPasswordCheckerApp = None
        passwordsList = []
        gc.collect

    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = input(str("Please enter \"y\" to retry, enter \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"y\" or \"n\"")

print("Thanks for using my Password Checker App!")