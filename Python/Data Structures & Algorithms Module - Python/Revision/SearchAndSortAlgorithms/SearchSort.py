"""
SearchSort.py
Billy Cussen
23/02/2021
"""

def bubbleSort(list):
    for i in range(len(list)):
        for j in range(len(list)-1):
            if (list[j]>list[j+1])-(list[j]<list[j+1])>=1:
                temp = list[j]
                list[j] = list[j+1]
                list[j+1] = temp

def selectionSort(list):
    for i in range(len(list)):
        minIndex = i
        for j in range(0, len(list)):
            if (list[j]>list[minIndex])-(list[j]<list[minIndex])>=1:
                temp = list[j]
                list[j] = list[minIndex]
                list[minIndex] = temp

def linearSearch(list, key):
    for i in range(len(list)):
        if (list[i]>key)-(list[i]<key)==0:
            return True
    return False

list = [5,4,3,2,1]
bubbleSort(list)
for i in list:
    print(str(i))
print("Contains 5: "+str(linearSearch(list, 5)))
print("Contains 1: "+str(linearSearch(list, 1)))
print("Contains 6: "+str(linearSearch(list, 6)))

list1 = [5,4,3,2,1]
selectionSort(list1)
for i in list1:
    print(str(i))
print("Contains 5: "+str(linearSearch(list1, 5)))
print("Contains 1: "+str(linearSearch(list1, 1)))
print("Contains 6: "+str(linearSearch(list1, 6)))