"""
EncryptApp.py
Billy Cussen
29/09/2020
"""

#Objects
import gc
import Encrypt
from Encrypt import myEncryption

#Variables
repeat = "y"

#Greeting
print("***ENCRYPTION APP***")

while repeat == "y":

    inputCheck = True

    #User Input
    while inputCheck:
        try:
            sentance = str(input("Please enter the Sentance you want Encrypted: "))
        except:
            print("You need to enter a String (i.e. a Sentance or some characters..)")
        else: 
            if len(sentance) <= 5:
                print("You need to enter a String with a length of 5 Characters or more")
            else:
                inputCheck = False

    #Process and Output
    myDecryptionApp = myEncryption(sentance)
    myDecryptionApp.encryptSentance()
    print(myDecryptionApp.result)

    myDecryptionApp = None
    gc.collect()

    repeat = ""

    #Input - Retry?
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter if you would like to repeat(\"Y\" or \"N\"): "))
        repeat = repeat.lower()

        if repeat != "y" and repeat != "n":
            print ("You need to enter \"Y\" or \"N\"!")

print ("Thanks for using my App!")