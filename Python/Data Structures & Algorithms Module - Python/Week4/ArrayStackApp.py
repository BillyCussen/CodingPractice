"""
ArrayStackApp.py
Billy Cussen
12/11/2020
"""

from ArrayStack import ArrayStack

myArrayStackApp = ArrayStack()

print("Empty: "+str(myArrayStackApp.isEmpty()))
print("Size: "+str(myArrayStackApp.mySize()))
try:
    print("Peek: "+str(myArrayStackApp.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myArrayStackApp.pop()))
except Exception as e:
    print(e)
try:
    print(myArrayStackApp.toString())
except Exception as e:
    print(e)

myArrayStackApp.push(2)
myArrayStackApp.push(4)
myArrayStackApp.push(6)
myArrayStackApp.push(8)
myArrayStackApp.push(10)

print("Empty: "+str(myArrayStackApp.isEmpty()))
print("Size: "+str(myArrayStackApp.mySize()))
try:
    print("Peek: "+str(myArrayStackApp.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myArrayStackApp.pop()))
except Exception as e:
    print(e)
try:
    print(myArrayStackApp.toString())
except Exception as e:
    print(e)

while myArrayStackApp.isEmpty() == False:
    myArrayStackApp.pop()

print("Empty: "+str(myArrayStackApp.isEmpty()))
print("Size: "+str(myArrayStackApp.mySize()))
try:
    print("Peek: "+str(myArrayStackApp.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myArrayStackApp.pop()))
except Exception as e:
    print(e)
try:
    print(myArrayStackApp.toString())
except Exception as e:
    print(e)