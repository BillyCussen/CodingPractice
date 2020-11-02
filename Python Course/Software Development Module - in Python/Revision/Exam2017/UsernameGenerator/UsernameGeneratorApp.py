"""
UsernameGeneratorApp.py
Billy Cussen
02/11/2020
"""

#Object
import os
import gc
import UsernameGenerator
from UsernameGenerator import myUsernameGenerator

#Variables
repeat = "y"
result = ""

while repeat == "y":

    inputCheck = False
    users = []
    history = []

    #Input - Number of Employees
    while inputCheck == False:
        try:
            numberOfUsernames = int(input("Please enter the number of Usernames to be generated: "))
            if numberOfUsernames <= 0 or numberOfUsernames > 5:
                raise Exception
        except Exception:
            print("You need to enter a number between 0 and 5")
        else:
            inputCheck = True

    for i in range(numberOfUsernames):
        users.append("")
        inputCheck = True
        #Input - Get Users Name
        while inputCheck:
            try:
                fullName = str(input("Please enter the Full Name of user "+str(i+1)+": "))
                fullName = fullName.lower()
                if fullName == "":
                    raise Exception
            except Exception as e:
                print("You need to enter a Name!")
            else:
                users[i] = fullName
                inputCheck = False

    #Process
    myUsernameGeneratorApp = myUsernameGenerator(users)
    userNames = myUsernameGeneratorApp.getUserNames()
    myUsernameGeneratorApp = None
    gc.collect()

    #Output
    print("\n***USERNAME GENERATOR RESULTS***")
    for u in userNames:
        result = result + u +"\n"
        print(u)

    history.append(result)

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to retry and \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"y\" or \"n\"")

#Write History to Text File
mydir = 'C:/Users/billy/Desktop/Coding/Python Course/Software Development Module - in Python/Revision/Exam2017/UsernameGenerator'
myfile = 'UsernameGeneratorApp.txt'
filePath = os.path.join(mydir, myfile)

file1 = open(filePath,"r+") 
file1.truncate(0)

file1.write("***USERNAME GENERATOR APP HISTORY***\n")
for result in history:    
    file1.write(result+"\n")
file1.close()
file1 = None

#Read Contents and print Results
with open(filePath) as text_file:
    contents = text_file.read()
print(contents)

gc.collect()

print("Thanks for using my Username Generator App!")