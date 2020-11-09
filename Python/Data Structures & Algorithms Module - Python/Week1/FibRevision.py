"""
FibRevision.py
Billy Cussen
09/11/2020
"""

def fib(num):
    a, b, c = 0, 1, 0
    for i in range(num):
        a = b
        b = c
        c = a + b
    return c

def fibRecursion(num):
    if num == 0 or num == 1:
        return 1
    
    return fibRecursion(num-1)+fibRecursion(num-2)

print("***RECURSION LOOPED APPROACH***")
for i in range(10):
    print(fib(i))

print("***FIB RECUSION APPROACH***")
for i in range(10):
    print(fibRecursion(i))