"""
Fibonacci.py
Billy Cussen
03/11/2020
"""

def fibonacci(num):
    a, b, c = 0, 1, 0
    print("Number is "+str(a)+" at Position 1")
    print("Number is "+str(b)+" at Position 2")
    i = 2
    while i <= num:
        c = a + b
        print("Number is "+str(c)+" at Position "+str(i))
        a = b
        b = c
        i = i + 1

def fibRecursion(num):
    if num == 0 or num == 1:
        return 1
    return fibRecursion(num-1)+fibRecursion(num-2)

print("***RECURSION LOOPED APPROACH***")
fibonacci(10)

print("***RECURSION RECURSIVE APPROACH***")
for i in range(10):
    print("Number is "+str(fibRecursion(i))+" at Position "+str(i))