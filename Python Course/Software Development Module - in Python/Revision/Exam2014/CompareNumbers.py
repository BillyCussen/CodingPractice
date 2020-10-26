"""
CompareNumbers.py
Billy Cussen
26/10/2020
"""

#Develop a method which compares two double numbers and determine the relationship between the numbers,
#The method returns 0 if n1 and n2 are equal, 1 if n1 is greater than n2, and -1 if n1 is lower than n2.

def compareNumbers(a, b):
    if (a == b):
        return 0
    elif(a > b):
        return 1
    else:
        return -1

print (str(compareNumbers(2,2)))
print (str(compareNumbers(2,1)))
print (str(compareNumbers(1,2)))
