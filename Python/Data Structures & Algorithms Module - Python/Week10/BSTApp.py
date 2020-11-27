"""
BSTApp.py
Billy Cussen
25/11/2020
"""

from BinarySearchTree import BinarySearchTree

myBST = BinarySearchTree()

print("Empty: "+str(myBST.isEmpty()))

try:
    print("Size: "+str(myBST.size()))
except Exception as e:
    print(e)
try:
    myBST.inOrder()
except Exception as e:
    print(e)
try:
    print("Min: "+str(myBST.getMin()))
except Exception as e:
    print(e)
try:
    print("Max: "+str(myBST.getMax()))
except Exception as e:
    print(e)
try:
    print("Get Node: "+str(myBST.getNode(2)))
except Exception as e:
    print(e)
try:
    print("Get Parent: "+str(myBST.getParent(2)))
except Exception as e:
    print(e)

myBST.insert(15)
myBST.insert(10)
myBST.insert(5)
myBST.insert(7)
myBST.insert(2)
myBST.insert(1)

myBST.insert(20)
myBST.insert(17)
myBST.insert(22)


print("Empty: "+str(myBST.isEmpty()))

try:
    print("Size: "+str(myBST.size()))
except Exception as e:
    print(e)
try:
    myBST.inOrder()
except Exception as e:
    print(e)
try:
    print("Min: "+str(myBST.getMin()))
except Exception as e:
    print(e)
try:
    print("Max: "+str(myBST.getMax()))
except Exception as e:
    print(e)
try:
    print("Get Node: "+str(myBST.getNode(2)))
except Exception as e:
    print(e)
try:
    print("Get Parent: "+str(myBST.getParent(2)))
except Exception as e:
    print(e)
try:
    print("Get Parent: "+str(myBST.getParent(15)))
except Exception as e:
    print(e)