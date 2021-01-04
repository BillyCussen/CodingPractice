def fib(n):
    result = "***FIBONACCI LOOPED***\n"
    a, b = 0, 1
    for i in range(1, n):
        c = a + b
        a = b
        b = c
        result+=str(b)+"\n"
    return result

def fibRecursion(n):
    result = "***FIBONACCI RECURSION***\n"
    if(n < 0):
        return result
    else:
        for i in range(1, n):
            result += str(fibRecursionHelper(i))+"\n"
        return result

def fibRecursionHelper(n):
    if n == 0 or n == 1:
        return 1
    return fibRecursionHelper(n-1)+fibRecursionHelper(n-2)

print(fib(10))
print(fibRecursion(10))