"""
Encrypt.py
Billy Cussen
29/09/2020
"""

import re

class myEncryption:
    def __init__(self, sentance):
        self.sentance = sentance.lower()
        self.VOWEL = "aeiou"
        self.CONSONANT = "bcdfghjklmnpqrstvwxyz"
        self.result = ""

    def encryptSentance(self):
        for i in reversed(self.sentance):
            self.result+=i

        for j in self.result:
            print(j)
            if bool(re.search(r"\s", j)):
                self.result = self.result.replace(j,"%#")
 
            for a in self.VOWEL:
                if j == a:
                    self.result = self.result.replace(j,"?")
                    break
            for b in self.CONSONANT:
                if j == b:
                    self.result = self.result.replace(j,"!")
                    break
        