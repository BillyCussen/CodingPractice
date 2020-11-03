"""
Counting.py
Billy Cussen
29/09/2020
"""

import re

class myCounting:
    def __init__(self, sentance):
        self.sentance = sentance
        self.VOWEL = "aeiou"
        self.CONSONANT = "bcdfghjklmnpqrstvwxyz"
        self.NUMBER = "0123456789"
        self.vowelCount = 0
        self.consonantCount = 0
        self.numberCount = 0
        self.spaceCount = 0

    def calculateCharacters(self):

        for i in self.sentance:
            
            if bool(re.search(r"\s", i)):
                self.spaceCount=self.spaceCount+1

            for a in self.VOWEL:
                if i == a:
                    self.vowelCount=self.vowelCount+1
                    break
            for b in self.CONSONANT:
                if i == b:
                    self.consonantCount=self.consonantCount+1
                    break
            for n in self.NUMBER:
                if i == n:
                    self.numberCount=self.numberCount+1
                    break
    
        print ("Vowel Count: "+str(self.vowelCount))
        print ("Consonant Count: "+str(self.consonantCount))
        print ("Number Count: "+str(self.numberCount))
        print ("Space Count: "+str(self.spaceCount))
        


    