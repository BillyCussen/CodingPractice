"""
Dog.py
Billy Cussen
26/10/2020
"""
import Animal

class myDog(Animal.myAnimal):
    def __init__(self):
        self.speak = "Bark"

    def getSpeak(self):
        return self.speak