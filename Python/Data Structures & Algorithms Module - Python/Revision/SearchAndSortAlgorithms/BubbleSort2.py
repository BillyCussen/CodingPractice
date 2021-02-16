"""
BubbleSort2.py
Billy Cussen
16/02/2021
"""

def bubbleSort(myList):
    for i in range(len(myList)):
        for j in range (len(myList)-1):
            if myList[j+1] < myList[j]:
                temp = myList[j]
                myList[j] = myList[j+1]
                myList[j+1] = temp

def bubbleSort2(myList):
    for i in range(len(myList)):
        for j in range(len(myList)-1):
            if (myList[j+1]>myList[j])-(myList[j+1]<myList[j]):
                temp = myList[j]
                myList[j] = myList[j+1]
                myList[j+1] = temp

myList = [5,4,3,2,1]
bubbleSort(myList)

for i in myList:
    print(str(i))

for j in myList:
    print(str(j))