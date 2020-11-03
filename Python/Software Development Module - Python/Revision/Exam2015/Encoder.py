"""
Encoder.py
Billy Cussen
28/10/2020
"""
class myEncoder:
    def __init__(self, sentance):
        self.sentance = sentance.lower()
        self.vowels = 'aeiou'
        self.consonants = 'bcdfghjklmnpqrstvwxyz'

    def encodeSentance(self):
        newString = ""
        for e in self.sentance:
            if self.isVowel(e):
                newString+= e+"++"
            elif self.is_consonant(e):
                newString+=e+"_"
            elif e == ' ':
                newString+="*"
            elif e == '.':
                newString+="."     
        return newString

    def isVowel(self,e):
        return e in self.vowels

    def is_consonant(self,e):
        return e in self.consonants