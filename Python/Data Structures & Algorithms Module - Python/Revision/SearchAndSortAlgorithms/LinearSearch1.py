"""
LinearSearch1.py
Billy Cussen
09/02/2021
"""

def linearSearch(list, key):
    for i in list:
        if i == key:
            return True
    return False

def linearSearch2(list, key):
    for i in list:
        if (i > key)-(i < key)==0:
            return True
    return False

myList = [100,7,3,4,6,2,3338, 29494, 22]
myList1 = ["abc","def","ghi","jkl"]

print(str(linearSearch(myList, 29494)))
print(str(linearSearch(myList, 23)))
print(str(linearSearch2(myList1, "ghi")))
print(str(linearSearch2(myList1, "mno")))