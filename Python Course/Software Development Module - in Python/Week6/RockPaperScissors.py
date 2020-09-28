"""
RockPaperScissors.py
Billy Cussen
28/09/2020
"""

import random

class myRockPaperScissors:
    def __init__(self, number):
        self.number = number
        self.randomNumber = random.randint(1,3)

    def checkWinner(self):
        if self.number == self.randomNumber:
            print ("Draw")
        elif (self.number == 1 and self.randomNumber == 3) or (self.number == 2 and self.randomNumber == 1) or (self.number == 3 and self.randomNumber == 1):
            print ("You win!")
        else:
            print ("You lose!")