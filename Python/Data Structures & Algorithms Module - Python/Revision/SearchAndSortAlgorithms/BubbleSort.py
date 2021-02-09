"""
BubbleSort.py
Billy Cussen
09/02/2021
"""

def bubbleSortArray(arr):
    for i in range (len(arr)):
        for j in range (len(arr)-1):
            if(arr[j]>arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]


arr1 = [5,4,2,3,1]

bubbleSortArray(arr1)

for i in range(len(arr1)):
    print(arr1[i])