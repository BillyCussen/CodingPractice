"""
InsertionSort.py
Billy Cussen
17/12/2020
"""

def insertionSortArray(myArray):
    for i in range(1, len(myArray)):
        key = myArray[i]
        j = i -1
        while(j >= 0 and myArray[j]>key):
            myArray[j+1] = myArray[j]
            j = j - 1
        myArray[j+1] = key
    return myArray

myArray = [10,9,8,7,6,5,4,3,2,1]
myArray = insertionSortArray(myArray)

for i in range(len(myArray)):
    print(myArray[i])