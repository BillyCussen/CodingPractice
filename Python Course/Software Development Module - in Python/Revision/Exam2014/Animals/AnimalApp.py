"""
AnimalApp.py
Billy Cussen
26/10/2020
"""

import Animal 
from Animal import myAnimal
import Cat 
from Cat import myCat
import Dog
from Dog import myDog

myAnimalApp = myAnimal()
print(myAnimalApp.getSpeak())
myAnimalApp = myCat()
print (myAnimalApp.getSpeak())
myAnimalApp = myDog()
print (myAnimalApp.getSpeak())