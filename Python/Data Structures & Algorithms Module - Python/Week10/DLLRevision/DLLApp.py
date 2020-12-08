"""
DLLApp.py
Billy Cussen
07/12/2020
"""

from DLL import DLL

myDLL = DLL()

myDLL.add(2)
myDLL.add(4)
myDLL.add(6)

print(myDLL.toString())
print(myDLL.toStringBackwards())

myDLL.addByIndex(20,0)
myDLL.addByIndex(40,2)
myDLL.addByIndex(60,4)
myDLL.addByIndex(80,myDLL.size())

print(myDLL.toString())
print(myDLL.toStringBackwards())

myDLL.addBefore(200,20)
myDLL.addBefore(400,40)
myDLL.addBefore(600,60)
myDLL.addBefore(800,80)

print(myDLL.toString())
print(myDLL.toStringBackwards())


myDLL.addAfter(2000,20)
myDLL.addAfter(4000,40)
myDLL.addAfter(6000,60)
myDLL.addAfter(8000,80)

print(myDLL.toString())
print(myDLL.toStringBackwards())

myDLL.removeByElement(2000)
myDLL.removeByElement(4000)
myDLL.removeByElement(6000)
myDLL.removeByElement(8000)

print(myDLL.toString())
print(myDLL.toStringBackwards())