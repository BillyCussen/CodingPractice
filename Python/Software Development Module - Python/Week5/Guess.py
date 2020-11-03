"""
Guess.py
Billy Cussen
27/09/2020
"""

import random

class myGuess:
    def __init__(self, number):
        self.number = number
        self.randomNumber = random.randint(1,10)

    def computeAnswer(self):
        if self.number == self.randomNumber:
            return "Correct"
        elif self.number < self.randomNumber:
            return "Too Low, correct number was "+str(self.randomNumber)
        else:
            return "Too High, correct number was "+str(self.randomNumber)