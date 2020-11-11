"""
DLLinkedListApp.py
Billy Cussen
11/11/2020
"""

from DLLinkedList import DLLinkedList

myList = DLLinkedList()

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")

myList.add(2)
myList.add(4)
myList.add(6)

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")

myList.addByIndex(20,0)
myList.addByIndex(40,2)
myList.addByIndex(80,myList.size())

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")

myList.addBefore(200,20)
myList.addBefore(400,40)
myList.addBefore(60,6)
myList.addBefore(800,80)

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")

myList.addAfter(2000,2)
myList.addAfter(4000,4)
myList.addAfter(600,4000)
myList.addAfter(6000,6)

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")

myList.removeByElement(6000)
myList.removeByElement(4000)
myList.removeByElement(2000)

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")


myList.removeByIndex(0)
myList.removeByIndex(myList.size()-1)
myList.removeByIndex(2)
myList.removeByIndex(4)

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")

for i in range(myList.size()-1,-1,-1):
    myList.removeByIndex(i)

print("Is Empty: "+str(myList.isEmpty()))
print("Size: "+str(myList.size()))
print(myList.toString())
print(myList.toStringBackwards()+"\n")