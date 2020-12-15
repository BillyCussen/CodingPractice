"""
LinearSearch.py
Billy Cussen
15/12/2020
"""

def linearSearch(myArray, key):
    for i in range(len(myArray)):
        if myArray[i]==key:
            return True
    return False

myArray = [45,67,32,15,1,89]

print("Does Array Contain 1: "+str(linearSearch(myArray,1)))
print("Does Array Contain 15: "+str(linearSearch(myArray,15)))
print("Does Array Contain 14: "+str(linearSearch(myArray,14)))
print("Does Array Contain 89: "+str(linearSearch(myArray,89)))
print("Does Array Contain 2000: "+str(linearSearch(myArray,2000)))