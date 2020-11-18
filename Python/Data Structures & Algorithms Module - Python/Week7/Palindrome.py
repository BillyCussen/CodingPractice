"""
Palindrome.py
Billy Cussen
18/11/2020
"""
import timeit

def palindrome(word):
    wordLength = len(word)
    match = True
    tempLen = wordLength-1
    for i in range(int(wordLength/2)):
        if word[i] != word[tempLen]:
            match = False
            break
        else:
            tempLen-=1
    return match

def palindromeRecursion(word):
    if len(word) == 0:
        return True
    
    if word[0] == word[len(word)-1]:
        return palindromeRecursion(word[1:len(word)-1])
    else:
        return False

startTime = timeit.default_timer()
print("Palindrome: "+str(palindrome("modom")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Palindrome Recursion: "+str(palindromeRecursion("moddom")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Palindrome: "+str(palindrome("hello")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Palindrome Recursion: "+str(palindromeRecursion("hello")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Palindrome: "+str(palindrome("racecar")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Palindrome Recursion: "+str(palindromeRecursion("racecar")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")