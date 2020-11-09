"""
Person.py
Billy Cussen
09/11/2020
"""

class myPerson:

    def __init__(self, firstName, secondName, age):
        self.firstName = firstName
        self.secondName = secondName
        self.age = age

    def __str__(self):
        return "First Name: "+str(self.firstName)+", Second Name: "+str(self.secondName)+", Age: "+str(self.age)