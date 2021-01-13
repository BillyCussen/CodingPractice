"""
SumDigits.py
Billy Cussen
13/01/2021
"""

def sumDigits(num):
    if num == 0:
        return 0
    return (num%10)+sumDigits(num/10)

print(str(int(sumDigits(10))))
print(str(int(sumDigits(202))))
print(str(int(sumDigits(333))))