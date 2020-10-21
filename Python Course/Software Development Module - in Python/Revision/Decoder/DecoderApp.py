"""
DecoderApp.py
Billy Cussen
21/10/2020
"""

#Objects
import gc
import Decoder
from Decoder import myDecoder

#Variables
repeat = "y"
wordHistory = []

while repeat == "y":

    inputCheck = False

    #Input - Word?
    while inputCheck == False:
        try:
            word = str(input("Please enter the Word you would like to Decode: "))
            for c in word:
                if c == ' ':
                    raise Exception
            if len(word) <= 0:
                raise Exception
        except Exception as e:
            print("Please enter a valid word to be decoded (no spaces)")
        else:
            inputCheck = True

    #Process and Output
    myDecoderApp = myDecoder(word)
    print(myDecoderApp.decodeWord())
    wordHistory.append(myDecoderApp.decodeWord())
    myDecoderApp = None
    gc.collect()

    repeat = ""
    while repeat.lower() != "y" and repeat.lower() != "n":
        repeat = str(input("Please enter \"y\" to repeat and \"n\" to exit: "))
        if repeat.lower() != "y" and repeat.lower != "n":
            print("You need to enter \"y\" or \"n\"")


print("***WORD HISTORY***")
for word in wordHistory:
    print(word)

wordHistory=None
gc.collect()
print("\nThanks for using my Word Decoder App!")