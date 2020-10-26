"""
EncoderApp.py
Billy Cussen
22/10/2020
"""

#Objects
import Encoder
from Encoder import myEncoder
import gc

#Variables
repeat = "y"
wordHistory = []

while repeat == "y":

    #Input - Enter Word to be encoded
    inputCheck = False
    while inputCheck == False:
        try:
            word = str(input("Please enter the word you would like to encode: "))
            if len(word) <= 0 or " " in word:
                raise Exception
        except Exception as e:
            print("You need to enter a valid word (no spaces!)")
        else:
            inputCheck = True

    #Process & Output
    myEncoderApp = myEncoder(word)
    result = myEncoderApp.encodeWord()
    print(result)
    wordHistory.append(result)
    myEncoderApp = None
    gc.collect()
    
    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to repeat and \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print ("Please enter \"y\" or \"n\"")

print("***WORD HISTORY***")
for w in wordHistory:
    print (w)

wordHistory = None
gc.collect()
print("\nThanks for using my Encoder App!")