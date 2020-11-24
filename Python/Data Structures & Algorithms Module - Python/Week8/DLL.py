"""
DLL.py
Billy Cussen
24/11/2020
"""

from DoublyLinkedList import DoublyLinkedList

myDoublyLinkedList = DoublyLinkedList()

print("Is Empty: "+str(myDoublyLinkedList.isEmpty()))
try:
    print("Size: "+str(myDoublyLinkedList.size()))
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toString())
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toStringBackwards())
except Exception as e:
    print(e)

myDoublyLinkedList.addByElement(2)
myDoublyLinkedList.addByElement(4)
myDoublyLinkedList.addByElement(6)

print("Is Empty: "+str(myDoublyLinkedList.isEmpty()))
try:
    print("Size: "+str(myDoublyLinkedList.size()))
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toString())
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toStringBackwards())
except Exception as e:
    print(e)

try:
    myDoublyLinkedList.addByIndex(20,-1)
except Exception as e:
    print(e)

try:
    myDoublyLinkedList.addByIndex(20,20)
except Exception as e:
    print(e)


myDoublyLinkedList.addByIndex(200,0)
myDoublyLinkedList.addByIndex(600,myDoublyLinkedList.size())
myDoublyLinkedList.addByIndex(400,2)

print("Is Empty: "+str(myDoublyLinkedList.isEmpty()))
try:
    print("Size: "+str(myDoublyLinkedList.size()))
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toString())
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toStringBackwards())
except Exception as e:
    print(e)

myDoublyLinkedList.addAfter(2000,200)
myDoublyLinkedList.addAfter(6000,600)
myDoublyLinkedList.addAfter(4000,400)
myDoublyLinkedList.addBefore(20000,2000)
myDoublyLinkedList.addBefore(60000,6000)
myDoublyLinkedList.addBefore(40000,4000)

print("Is Empty: "+str(myDoublyLinkedList.isEmpty()))
try:
    print("Size: "+str(myDoublyLinkedList.size()))
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toString())
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toStringBackwards())
except Exception as e:
    print(e)


myDoublyLinkedList.removeByElement(200)
myDoublyLinkedList.removeByIndex(0)
myDoublyLinkedList.removeByElement(400)
myDoublyLinkedList.removeByIndex(myDoublyLinkedList.size()-1)
myDoublyLinkedList.removeByElement(600)
myDoublyLinkedList.removeByIndex(2)

print("Is Empty: "+str(myDoublyLinkedList.isEmpty()))
try:
    print("Size: "+str(myDoublyLinkedList.size()))
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toString())
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toStringBackwards())
except Exception as e:
    print(e)

try:
    myDoublyLinkedList.removeByElement(55555)
except Exception as e:
    print(e)

try:
    myDoublyLinkedList.removeByIndex(55555)
except Exception as e:
    print(e)

while(myDoublyLinkedList.isEmpty()==False):
    myDoublyLinkedList.removeByIndex(0)

print("Is Empty: "+str(myDoublyLinkedList.isEmpty()))
try:
    print("Size: "+str(myDoublyLinkedList.size()))
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toString())
except Exception as e:
    print(e)

try:
    print(myDoublyLinkedList.toStringBackwards())
except Exception as e:
    print(e)