"""
BubbleSort.py
Billy Cussen
14/12/2020
"""

def bubbleSort(current):
    for i in range(len(current)-1):
        print("Starting Bubble Sort at Position "+str(i+1))
        for j in range(len(current)-i-1):
            if current[j] > current[j+1]:
                print("Swapping "+str(current[j])+" with "+str(current[j+1]))
                temp = current[j]
                current[j] = current[j+1]
                current[j+1] = temp


myArray = [5,4,3,2,1]
bubbleSort(myArray)
print("\n***BUBBLE SORT***")
for i in range(len(myArray)):
    print(str(myArray[i]))
print("***END***")


