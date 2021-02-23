"""
InsertionSort2.py
Billy Cussen
23/02/2021
"""

def insertionSort(list):
    for i in range(1, len(list)):
        key = list[i]
        j = i - 1
        while j >= 0 and (key<list[j]):
            list[j+1] = list[j]
            j = j-1
        list[j+1] = key

list = [9, 4, 3, 2, 1, 10]
insertionSort(list)
for i in list:
    print(str(i))