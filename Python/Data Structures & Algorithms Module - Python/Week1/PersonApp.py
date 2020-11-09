"""
PersonApp.py
Billy Cussen
09/11/2020
"""
import Person
from Person import myPerson
import Student
from Student import myStudent

person1 = myPerson("Billy","Cussen",31)
person2 = myStudent("William","Cussen",32)

myList = []
myList.append(person1)
myList.append(person2)

for i in myList:
    if isinstance(i,myStudent):
        print(i)
        print(i.isStudent())