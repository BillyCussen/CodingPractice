"""
SelectionSort.py
Billy Cussen
16/02/2021
"""

def selectionSort(myList):
    for i in range(1, len(myList)):
        minIndex = i
        for j in range(0, len(myList)-1):
            if myList[j] > myList[minIndex]:
                temp = myList[j]
                myList[j] = myList[minIndex]
                myList[minIndex] = temp

def selectionSort2(myList):
    for i in range(1, len(myList)):
        minIndex = i
        for j in range(0, len(myList)-1):
            if (myList[j]>myList[minIndex])-(myList[j]<myList[minIndex])>=1:
                temp = myList[j]
                myList[j] = myList[minIndex]
                myList[minIndex] = temp

myList = [5,4,3,2,1]
selectionSort(myList)

for i in myList:
    print(str(i))

for j in myList:
    print(str(j))