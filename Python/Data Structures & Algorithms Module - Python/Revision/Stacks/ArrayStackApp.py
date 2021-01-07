"""
ArrayStackApp.py
Billy Cussen
07/01/2021
"""
from ArrayStack import ArrayStack

myStack = ArrayStack()

print("Is Empty: "+str(myStack.isEmpty()))
print("Size: "+str(myStack.getSize()))
try:
    print("Peek: "+str(myStack.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myStack.pop()))
except Exception as e:
    print(e)
    
try:
    print(myStack.toString())
except Exception as e:
    print(e)

myStack.push(2)
myStack.push(4)
myStack.push(6)
myStack.push(8)

print("Is Empty: "+str(myStack.isEmpty()))
print("Size: "+str(myStack.getSize()))
try:
    print("Peek: "+str(myStack.peek()))
except Exception as e:
    print(e)
try:
    print("Pop: "+str(myStack.pop()))
except Exception as e:
    print(e)
    
try:
    print(myStack.toString())
except Exception as e:
    print(e)

