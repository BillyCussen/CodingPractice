"""
BSTApp.py
Billy Cussen
03/02/2021
"""
from BST import BST

myBST = BST()

myBST.insert(40)
myBST.insert(20)
myBST.insert(60)
myBST.insert(10)
myBST.insert(5)
myBST.insert(7)
myBST.insert(50)
myBST.insert(70)
print(str(myBST.inOrder()))