"""
SearchSort2.py
Billy Cussen
02/03/2021
"""

def linearSearch(list, key):
    for i in range(len(list)):
        if list[i] == key:
            return True
    return False

def bubbleSort(list):
    for i in range(len(list)):
        for j in range(len(list)-1):
            if (list[j+1]>list[j])-(list[j+1]<list[j])<=-1:
                temp = list[j+1]
                list[j+1] = list[j]
                list[j] = temp

def selectionSort(list):
    for i in range(len(list)):
        minIndex = i
        for j in range(len(list)-1):
            if(list[minIndex]>list[j])-(list[minIndex]<list[j])<=-1:
                temp = list[minIndex]
                list[minIndex] = list[j]
                list[j] = temp

def insertionSort(list):
    for i in range(1, len(list)):
        value = list[i]
        j = i - 1
        while j >= 0 and list[j]>value:
            list[j+1] = list[j]
            j = j - 1
        list[j+1] = value

print("***LIST 1 (BUBBLE SORT)***")
myList1 = [5,4,3,2,1]
bubbleSort(myList1)
for i in myList1:
    print(str(i))

print("Contains 5: "+str(linearSearch(myList1, 5)))
print("Contains 1: "+str(linearSearch(myList1, 1)))
print("Contains 6: "+str(linearSearch(myList1, 6)))

print("***LIST 2 (SELECTION SORT)***")
myList2 = [10,9,8,7,6]
selectionSort(myList2)
for i in myList2:
    print(str(i))

print("Contains 6: "+str(linearSearch(myList2, 6)))
print("Contains 10: "+str(linearSearch(myList2, 10)))
print("Contains 11: "+str(linearSearch(myList2, 11)))

print("***LIST 3 (INSERTION SORT)***")
myList3 = [15,14,13,12,11]
insertionSort(myList3)
for i in myList3:
    print(str(i))
print("Contains 11: "+str(linearSearch(myList3, 11)))
print("Contains 15: "+str(linearSearch(myList3, 15)))
print("Contains 16: "+str(linearSearch(myList3, 16)))