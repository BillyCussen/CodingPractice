"""
EncoderApp.py
Billy Cussen
28/10/2020
"""

#Object
import gc
import Encoder
from Encoder import myEncoder

#Variables
repeat = "y"

while repeat == "y":
    inputCheck = False

    #Input - Sentance
    while inputCheck == False:
        try: 
            sentance = str(input("Please enter the Sentance you would like to Encode: "))
            if (all(x.isalpha() or x.isspace() or x == "." for x in sentance) == False) or len(sentance) <= 5:
                raise Exception
        except Exception as e:
            print("You need to enter a Sentance greater than 5 characters with letters, spaces and full stops only!")
        else:
            inputCheck = True

    #Process & Output
    myEncoderApp = myEncoder(sentance)
    print(myEncoderApp.encodeSentance())
    myEncoderApp = None
    gc.collect()

    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to retry, \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"y\" or \"n\"")

print("Thanks for using my Encoder App!")