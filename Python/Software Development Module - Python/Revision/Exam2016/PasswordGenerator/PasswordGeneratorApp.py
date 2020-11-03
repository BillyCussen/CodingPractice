"""
PasswordGeneratorApp.py
Billy Cussen
31/10/2020
"""

#Object
import os
import gc
import PasswordGenerator
from PasswordGenerator import myPasswordGenerator

#Variables
i = 0
repeat = "y"
passwordHistory = []

while repeat == "y":

    #Input - Ticket Type
    inputCheck = True
    while inputCheck:
        try:
            fullName = input(str("Please enter Your Full Name: "))
            fullName = fullName.lower()
            if len(fullName) <= 0:
                raise Exception
        except Exception:
            print("You need to enter your full name (e.g. \"John Doe\")")
        else:
            inputCheck = False

    #Process & Output
    myPasswordGeneratorApp = myPasswordGenerator(fullName)
    try:
        password = myPasswordGeneratorApp.getPassword()
        print(password)
        passwordHistory.append("Name: "+str(fullName)+", Password: "+str(password))
    except Exception as e:
        print(e)
    else:
        myPasswordGeneratorApp = None
        gc.collect

    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = input(str("Please enter \"y\" to retry, enter \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"y\" or \"n\"")

#Write History to Text File
mydir = 'C:/Users/billy/Desktop/Coding/Python Course/Software Development Module - in Python/Revision/Exam2016/PasswordGenerator'
myfile = 'PasswordGeneratorApp.txt'
filePath = os.path.join(mydir, myfile)

file1 = open("PasswordGeneratorApp.txt","r+") 
file1.truncate(0)

file1.write("***PASSWORD GENERATOR APP HISTORY***\n")
for password in passwordHistory:    
    file1.write(password+"\n")
file1.close()
file1 = None

#Read Contents and print Results
with open(filePath) as text_file:
    contents = text_file.read()
print(contents)

gc.collect()

print("Thanks for using my Password Generator App!")