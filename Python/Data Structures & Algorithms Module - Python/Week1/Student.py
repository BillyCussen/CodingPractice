"""
Student.py
Billy Cussen
09/11/2020
"""

import Person
from Person import myPerson

class myStudent(Person.myPerson):
    def __init__(self, firstName, secondName, age):
        super().__init__(firstName,secondName,age)

    def isStudent(self):
        return "This is a Student"