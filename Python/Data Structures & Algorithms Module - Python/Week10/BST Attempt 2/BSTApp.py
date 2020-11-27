"""
BSTApp.py
Billy Cussen
25/11/2020
"""

from BST import BST

myBST = BST()

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
    print("Min: "+str(myBST.min()))
except Exception as e:
    print(e)
try:
    print("Max: "+str(myBST.max()))
except Exception as e:
    print(e)
try:
    print("Contains 2: "+str(myBST.contains(2)))
except Exception as e:
    print(e)
try:
    print("Get Node: "+str(myBST.getNode(2)))
except Exception as e:
    print(e)
try:
    print("Get Parent: "+str(myBST.findParent(2)))
except Exception as e:
    print(e)

try:
    print("Remove: "+str(myBST.remove(2)))
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


print("\n\nEmpty: "+str(myBST.isEmpty()))

try:
    print("Size: "+str(myBST.size()))
except Exception as e:
    print(e)
try:
    myBST.inOrder()
except Exception as e:
    print(e)
try:
    print("Min: "+str(myBST.min()))
except Exception as e:
    print(e)
try:
    print("Max: "+str(myBST.max()))
except Exception as e:
    print(e)
try:
    print("Contains 2: "+str(myBST.contains(2)))
except Exception as e:
    print(e)
try:
    print("Contains 3000: "+str(myBST.contains(3000)))
except Exception as e:
    print(e)
try:
    print("Get Node: "+str(myBST.getNode(2)))
except Exception as e:
    print(e)
try:
    print("Get Parent: "+str(myBST.findParent(2)))
except Exception as e:
    print(e)
try:
    print("Get Parent: "+str(myBST.findParent(15)))
except Exception as e:
    print(e)

try:
    print("Remove: "+str(myBST.remove(2))+"\n")
except Exception as e:
    print(e)

try:
    myBST.inOrder()
except Exception as e:
    print(e)
try:
    print("Remove: "+str(myBST.remove(15000))+"\n")
except Exception as e:
    print(e)
try:
    print("Remove: "+str(myBST.remove(10)))
except Exception as e:
    print(e)

try:
    print("Remove: "+str(myBST.remove(20))+"\n")
except Exception as e:
    print(e)

try:
    myBST.inOrder()
except Exception as e:
    print(e)