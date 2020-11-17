"""
Fibonacci.py
Billy Cussen
17/11/2020
"""

def fibonacci(num):
    a, b, c = 0, 1, 1
    for i in range(num):
        c = a + b
        a = b
        b = c
    return c

def fibRecursion(num):
    if num == 0 or num == 1:
        return 1
    return fibRecursion(num-1)+fibRecursion(num-2)


for i in range(10):
    print("Fibonacci Looped: "+str(fibonacci(i))+", Fibonacci Recursion: "+str(fibRecursion(i)))