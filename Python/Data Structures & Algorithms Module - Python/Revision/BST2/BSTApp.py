"""
BSTApp.py
Billy Cussen
02/02/2021
"""

from BST import BST


myBST = BST()

myBST.insert(30)
myBST.insert(15)
myBST.insert(20)
myBST.insert(25)
myBST.insert(10)
myBST.insert(40)
myBST.insert(35)
myBST.insert(50)

print("Max: "+str(myBST.max()))
print("Min: "+str(myBST.min()))
print("Size: "+str(myBST.size()))
print("Depth: "+str(myBST.depth()))
print("Is Empty: "+str(myBST.isEmpty()))
print("Find Node 25: "+str(myBST.findNode(25).toString()))
print("Find Parent 25: "+str(myBST.findParent(25).toString()))
myBST.inOrder()