"""
Factorial.py
Billy Cussen
17/11/2020
"""
def factorial(num):
    res = num
    while num != 1:
        num-=1
        res*=num
    return res

def factorialRecursion(num):
    if num == 1 or num == 0:
        return num
    return num * factorialRecursion(num-1)

print("Factorial: "+str(factorial(5)))
print("Factorial Recursion: "+str(factorialRecursion(5)))