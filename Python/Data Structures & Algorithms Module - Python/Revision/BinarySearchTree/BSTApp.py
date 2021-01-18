"""
BSTApp.py
Billy Cussen
18/01/2021
"""

from BST import BST

myBST = BST()

print("Is Empty: "+str(myBST.isEmpty()))
print("Size: "+str(myBST.size()))
print("Depth: "+str(myBST.depth()))
myBST.insert(20)
myBST.insert(6)
myBST.insert(26)
myBST.insert(5)
myBST.insert(7)
myBST.insert(21)
myBST.insert(30)
myBST.inOrder()
print("Is Empty: "+str(myBST.isEmpty()))
print("Size: "+str(myBST.size()))
print("Depth: "+str(myBST.depth()))
print("Max: "+str(myBST.max()))
print("Min: "+str(myBST.min()))