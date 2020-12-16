"""
Bubblesort2.py
Billy Cussen
16/12/2020
"""

def bubbleSortArr(myArray):
    for i in range(len(myArray)):
        for j in range(len(myArray)-1):
            if myArray[j]>myArray[j+1]:
                temp = myArray[j]
                myArray[j] = myArray[j+1]
                myArray[j+1] = temp
    return myArray

myArray = [10,9,8,7,6,5,4,3,2,1]

myArraySorted = bubbleSortArr(myArray)

for i in range(len(myArraySorted)):
    print(str(myArraySorted[i]))