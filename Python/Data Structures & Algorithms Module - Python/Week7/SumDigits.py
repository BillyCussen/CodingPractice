"""
SumDigits.py
Billy Cussen
19/11/2020
"""

def sumDigits(a):
    sum = a
    while a > 0:
        a-=1
        sum+=a
    return sum

def sumDigitsRecurstion(a):
    if a == 0:
        return 0
    return a + sumDigitsRecurstion(a-1)


print("Sum Digits: "+str(sumDigits(5)))
print("Sum Digits Recursion: "+str(sumDigitsRecurstion(5)))