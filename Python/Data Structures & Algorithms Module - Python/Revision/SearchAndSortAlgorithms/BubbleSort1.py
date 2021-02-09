"""
BubbleSort1.py
Billy Cussen
09/02/2021
"""

def bubbleSort(list):
    for i in range(len(list)):
        for j in range(len(list)-1):
            if list[j] > list[j+1]:
                list[j], list[j+1] = list[j+1], list[j]

myList = [10,8,4,2,6]
bubbleSort(myList)

for i in myList:
    print(i)