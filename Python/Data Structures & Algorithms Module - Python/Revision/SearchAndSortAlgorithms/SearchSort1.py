"""
SearchSort1.py
Billy Cussen
25/02/2021
"""

def linearSearch(list, key):
    for i in range(len(list)):
        if key == list[i]:
            return True
    return False

def bubbleSort(list):
    for i in range(0, len(list)):
        for j in range (0, len(list)-1):
            if (list[j]>list[j+1])-(list[j]<list[j+1])>=1:
                temp = list[j]
                list[j] = list[j+1]
                list[j+1] = temp

def selectionSort(list):
    for i in range(0, len(list)):
        minIndex = i
        for j in range(0, len(list)-1):
            if (list[j]>list[minIndex])-(list[j]<list[minIndex])>=1:
                temp = list[j]
                list[j] = list[minIndex]
                list[minIndex] = temp           

def insertionSort(list):
    for i in range(1, len(list)):
        value = list[i]
        j = i - 1
        while j>=0 and (list[j]>value):
            list[j+1]=list[j]
            j = j - 1
        list[j+1] = value


arr1 = [5,4,3,2,1]
bubbleSort(arr1)
for i in arr1:
    print(str(i))

print("Contains 5: "+str(linearSearch(arr1,5)))
print("Contains 6: "+str(linearSearch(arr1,6)))

arr2 = [10,9,8,7,6]
selectionSort(arr2)
for i in arr2:
    print(str(i))

print("Contains 5: "+str(linearSearch(arr2,5)))
print("Contains 6: "+str(linearSearch(arr2,6)))

arr3 = [15,14,13,12,11]
insertionSort(arr3)
for i in arr3:
    print(str(i))

print("Contains 15: "+str(linearSearch(arr3,15)))
print("Contains 10: "+str(linearSearch(arr3,10)))