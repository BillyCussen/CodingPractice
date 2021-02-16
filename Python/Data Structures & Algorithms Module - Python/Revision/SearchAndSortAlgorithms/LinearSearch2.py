"""
LinearSearch2.py
Billy Cussen
16/02/2021
"""

def linearSearch(myList, key):
    for i in range(len(myList)):
        if myList[i] == key:
            return True
    return False

def linearSearch2(myList, key):
    for i in range(len(myList)):
        if (key > myList[i])-(key < myList[i]) == 0:
            return True
    return False

myList1 = [5,4,3,2,1]
myList2 = [100, 200, 300, 400, 500]

print("Contains 5: "+str(linearSearch(myList1, 5)))
print("Contains 6: "+str(linearSearch(myList1, 6)))
print("Contains 500: "+str(linearSearch(myList2, 500)))
print("Contains 1: "+str(linearSearch(myList2, 1)))

