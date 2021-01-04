"""
ArrayListApp.py
Billy Cussen
04/01/2020
"""

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def __str__(self):
        return "Name: "+self.name+", Age: "+str(self.age)

class Student(Person):
    def __init___(self, name, age):
        super().__init__(name, age)

    def isStudent(self):
        return True

one = Person("Billy", 31)
two = Student("William", 32)

myList = []
myList.append(one)
myList.append(two)

for e in myList:
    if isinstance(e,Student):
        print(str(e))
        print(str(e.isStudent()))
