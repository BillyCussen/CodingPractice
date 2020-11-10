"""
LinkedListApp.py
Billy Cussen
10/11/2020
"""
from LinkedList import LinkedList


myLinkedList = LinkedList()

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")

myLinkedList.add(2)
myLinkedList.add(4)
myLinkedList.add(6)

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")

myLinkedList.addByIndex(20,0)
myLinkedList.addByIndex(40,2)
myLinkedList.addByIndex(60,myLinkedList.size())

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")

myLinkedList.addBefore(200,20)
myLinkedList.addBefore(400,40)
myLinkedList.addBefore(600,60)

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")

myLinkedList.addAfter(2000,2)
myLinkedList.addAfter(4000,4)
myLinkedList.addAfter(6000,60)

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")

myLinkedList.removeByElement(2000)
myLinkedList.removeByElement(4000)
myLinkedList.removeByElement(6000)

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")

myLinkedList.removeByIndex(0)
myLinkedList.removeByIndex(2)
myLinkedList.removeByIndex(myLinkedList.size()-1)

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")

for i in range(myLinkedList.size()-1,-1,-1):
    myLinkedList.removeByIndex(i)

print(myLinkedList.toString())
print("Is Empty: "+str(myLinkedList.isEmpty()))
print("Size: "+str(myLinkedList.size())+"\n")