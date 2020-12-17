"""
SelectionSort.py
Billy Cussen
17/12/2020
"""

def selectionSort(myArray):
    for i in range(0, len(myArray)-1):
        minIndex = i
        for j in range(minIndex+i, len(myArray)):
            if myArray[j] < myArray[minIndex]:
                minIndex = j
        temp = myArray[minIndex]
        myArray[minIndex] = myArray[i]
        myArray[i] = temp
    return myArray

myArray = [10,8,6,4,2]
myArray = selectionSort(myArray)

for i in range(len(myArray)):
    print(myArray[i])