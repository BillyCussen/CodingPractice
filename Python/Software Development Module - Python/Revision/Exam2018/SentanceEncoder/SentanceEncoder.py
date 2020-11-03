"""
SentanceEncoder.py
Billy Cussen
02/11/2020
"""

class mySentanceEncoder:

    def __init__(self, sentance):
        self.sentance = sentance

    def getEncodedSentance(self):
        index = 0
        new_sentance = ""
        for c in reversed(self.sentance):
            if c == ' ':
                new_sentance = new_sentance + "+"
            elif (index+1) % 4 == 0 and not (c == ' ' or c == '.'):
                new_sentance = new_sentance + "!"
            else:
                new_sentance = new_sentance + c
            index = index + 1
            
        print("Encoded Sentance is: "+new_sentance)
        self.getCharacterCount(new_sentance)

    def getCharacterCount(self, new_sentance):
        exclamation_count = 0
        plus_count = 0
        for c in new_sentance:
            if c == '!':
                exclamation_count = exclamation_count + 1
            elif c == '+':
                plus_count = plus_count + 1

        print("Total number of Exclamation Marks: "+str(exclamation_count))
        print("Total number of Plus Signs: "+str(plus_count))