"""
DLinkedListApp.py
Billy Cussen
06/01/2020
"""
from DLinkedList import DLinkedList

myList = DLinkedList()
myList.add(2)
myList.add(4)
myList.add(6)
print(myList.toString())
print(myList.toStringBackwards())

myList.addByIndex(20,0)
myList.addByIndex(40, 2)
myList.addByIndex(60, 4)
myList.addByIndex(8, myList.size())

print(myList.toString())
print(myList.toStringBackwards())

myList.removeByElement(60)
myList.removeByElement(40)
myList.removeByElement(20)

print(myList.toString())
print(myList.toStringBackwards())

myList.removeByIndex(myList.size()-1)
myList.removeByIndex(0)
myList.removeByIndex(myList.size()-1)

print(myList.toString())
print(myList.toStringBackwards())