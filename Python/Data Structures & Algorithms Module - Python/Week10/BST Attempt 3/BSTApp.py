"""
BSTApp.py
Billy Cussen
09/12/2020
"""

from BST import BST

myBSTApp = BST()

myBSTApp.insert(20)
myBSTApp.insert(10)
myBSTApp.insert(25)

print("Empty: "+str(myBSTApp.isEmpty()))
print("Size: "+str(myBSTApp.size()))

myBSTApp.inOrder()