"""
Cat.py
Billy Cussen
26/10/2020
"""
import Animal

class myCat(Animal.myAnimal):
    def __init__(self):
        self.speak = "Meow"

    def getSpeak(self):
        return self.speak