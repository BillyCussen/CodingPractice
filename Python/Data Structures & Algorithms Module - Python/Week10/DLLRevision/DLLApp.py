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