"""
BSTApp.py
Billy Cussen
26/01/2021
"""

from BST import BST


myBST = BST()

myBST.inOrder()
print("Size: "+str(myBST.size()))
print("Depth: "+str(myBST.depth()))
print("Max: "+str(myBST.max()))
print("Min: "+str(myBST.min()))
print("Is Empty: "+str(myBST.isEmpty()))
print("Contains 5: "+str(myBST.contains(5)))
print("Contains 100: "+str(myBST.contains(100)))
print("Contains 12: "+str(myBST.contains(12)))
print("Contains 30: "+str(myBST.contains(30)))

myBST.insert(20)
myBST.insert(15)
myBST.insert(12)
myBST.insert(17)
myBST.insert(10)
myBST.insert(3)
myBST.insert(30)
myBST.insert(25)
myBST.insert(35)
myBST.insert(27)

myBST.inOrder()
print("Size: "+str(myBST.size()))
print("Depth: "+str(myBST.depth()))
print("Max: "+str(myBST.max()))
print("Min: "+str(myBST.min()))
print("Is Empty: "+str(myBST.isEmpty()))
print("Contains 5: "+str(myBST.contains(5)))
print("Contains 100: "+str(myBST.contains(100)))
print("Contains 12: "+str(myBST.contains(12)))
print("Contains 30: "+str(myBST.contains(30)))


print("Get Node (30): "+str(myBST.getNode(30).toString()))
print("Get Parent (30): "+str(myBST.getParentNode(30).toString()))
print("Get Node (20): "+str(myBST.getNode(30).toString()))
print("Get Parent (20): "+str(myBST.getParentNode(20)))
print("Get Node (27): "+str(myBST.getNode(27).toString()))
print("Get Parent (27): "+str(myBST.getParentNode(27).toString()))