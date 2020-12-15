"""
BubbleSort1.py
Billy Cussen
15/12/2020
"""

def bubbleSort1(myArray):
    result = ""
    for i in range (len(myArray)):
        result+="Working from Position "+str(i+1)+"\n"
        for j in range (len(myArray)-1):
            if(myArray[j] > myArray[j+1]):
                result+="Swapping "+str(myArray[j])+" with "+str(myArray[j+1])+"\n"
                temp = myArray[j]
                myArray[j] = myArray[j+1]
                myArray[j+1] = temp
    
    result += "\n***ARRAY AFTER BUBBLE SORT***\n"
    for k in range(len(myArray)):
        result += str(myArray[k])+" "
    return result + "\n***END***\n"

myArr = [52,14,43,98,1]
print(bubbleSort1(myArr))
