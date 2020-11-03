"""
SentanceEncoderApp.py
Billy Cussen
02/11/2020
"""

#Object
import re
import gc
import SentanceEncoder
from SentanceEncoder import mySentanceEncoder

#Variable
repeat = "y"
regex = re.compile('[@_!#$%^&*()<>?/\|}{~:]') 

while repeat == "y":
    spaceCheck = False
    digitCheck = False
    inputCheck = False

    while inputCheck == False:
        try:
            sentance = str(input("Please enter the sentance you would like encoded: "))
            for c in sentance:
                if c == ' ':
                    spaceCheck = True
                if c.isdigit():
                    digitCheck = True
            if spaceCheck == False or digitCheck or sentance[-1]!='.' or regex.search(sentance)!=None:
                raise Exception
        except Exception:
            print("You need to enter a Sentance with only Letters, Spaces and Full Stops")
        else:
            inputCheck = True

    #Process & Output
    mySentanceEncoderApp = mySentanceEncoder(sentance)
    mySentanceEncoderApp.getEncodedSentance()
    mySentanceEncoderApp = None
    gc.collect()

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"y\" to retry, enter \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat !="n":
            print ("You need to enter \"y\" or \"n\".")
        
print("Thanks for using my Sentance Encoder App!")