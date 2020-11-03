"""
CalculateArraySum.py
Billy Cussen
26/10/2020
"""

#Develop a method which calculates the following two sums of the elements from a onedimensional array:
#1. the sum of those values that are odd numbers
#2. the sum of those values that are multiple of 4

def getSum(inputArray):
    totalOdd = 0
    totalMultiple = 0

    for i in inputArray:
        if i % 2 != 0:
            totalOdd = totalOdd+i
        if i % 4 == 0:
            totalMultiple = totalMultiple+i

    result = "Sum of Odd Numbers: "+str(totalOdd)+", Sum of Numbers that are multiples of 4: "+str(totalMultiple)
    return result


array1 = [1,2,3,4,5,6,7,8,9,10]
print (getSum(array1))
array2 = [11,12,13,15,16]
print (getSum(array2))