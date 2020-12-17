"""
InsertionSort2.py
Billy Cussen
17/12/2020
"""

def insertionSort(myArray):
    for i in range(1, len(myArray)):
        key = myArray[i]
        j = i - 1
        while j >= 0 and myArray[j] > key:
            myArray[j+1] = myArray[j]
            j = j - 1
        myArray[j+1] = key
    return myArray

arr = [10,8,6,4,2]
arr = insertionSort(arr)
for i in range(len(arr)):
    print(arr[i])
