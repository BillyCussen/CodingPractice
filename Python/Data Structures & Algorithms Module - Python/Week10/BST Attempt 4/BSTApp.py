"""
BSTApp.py
Billy Cussen
10/12/2020
"""

from BST import BST

myBST = BST()

print("Empty: "+str(myBST.isEmpty()))
print("Size: "+str(myBST.size()))
print("Max: "+str(myBST.max()))
print("Min: "+str(myBST.min()))
myBST.inOrder()
print("\n")

myBST.insert(20)
myBST.insert(15)
myBST.insert(17)
myBST.insert(12)
myBST.insert(30)
myBST.insert(22)

print("Empty: "+str(myBST.isEmpty()))
print("Size: "+str(myBST.size()))
print("Max: "+str(myBST.max()))
print("Min: "+str(myBST.min()))
myBST.inOrder()
print("\n")


print("Remove 22: "+str(myBST.remove(22)))
print("Remove 30: "+str(myBST.remove(30)))

print("Empty: "+str(myBST.isEmpty()))
print("Size: "+str(myBST.size()))
print("Max: "+str(myBST.max()))
print("Min: "+str(myBST.min()))
myBST.inOrder()
print("\n")