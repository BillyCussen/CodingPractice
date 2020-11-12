"""
LinkedStackApp.py
Billy Cussen
12/11/2020
"""

from LinkedStack import LinkedStack

myLinkedStackApp = LinkedStack()

print("Empty: "+str(myLinkedStackApp.isEmpty()))
print("Size: "+str(myLinkedStackApp.mySize()))
try:
    print("Peek: "+str(myLinkedStackApp.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myLinkedStackApp.pop()))
except Exception as e:
    print(e)
try:
    print(myLinkedStackApp.toString())
except Exception as e:
    print(e)

myLinkedStackApp.push(2)
myLinkedStackApp.push(4)
myLinkedStackApp.push(6)
myLinkedStackApp.push(8)
myLinkedStackApp.push(10)

print("Empty: "+str(myLinkedStackApp.isEmpty()))
print("Size: "+str(myLinkedStackApp.mySize()))
try:
    print("Peek: "+str(myLinkedStackApp.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myLinkedStackApp.pop()))
except Exception as e:
    print(e)
try:
    print(myLinkedStackApp.toString())
except Exception as e:
    print(e)

while myLinkedStackApp.isEmpty() == False:
    myLinkedStackApp.pop()

print("Empty: "+str(myLinkedStackApp.isEmpty()))
print("Size: "+str(myLinkedStackApp.mySize()))
try:
    print("Peek: "+str(myLinkedStackApp.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myLinkedStackApp.pop()))
except Exception as e:
    print(e)
try:
    print(myLinkedStackApp.toString())
except Exception as e:
    print(e)