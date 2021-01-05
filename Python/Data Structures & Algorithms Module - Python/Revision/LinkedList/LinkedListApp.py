"""
LinkedListApp.py
Billy Cussen
05/01/2021
"""

from LinkedList import LinkedList

myLinkedList = LinkedList()

print("Is Empty: "+str(myLinkedList.isEmpty()))
try:
    print("Size: "+myLinkedList.size())
except Exception as e:
    print(e)
try:
    print(myLinkedList.toString())
except Exception as e:
    print(e)


myLinkedList.add(2)
myLinkedList.add(4)
myLinkedList.add(6)
myLinkedList.addByIndex(20,0)
myLinkedList.addByIndex(40,2)
myLinkedList.addByIndex(60,myLinkedList.size())
print(myLinkedList.toString())

myLinkedList.removeByIndex(0)
myLinkedList.removeByIndex(myLinkedList.size()-1)
myLinkedList.removeByIndex(1)

print(myLinkedList.toString())