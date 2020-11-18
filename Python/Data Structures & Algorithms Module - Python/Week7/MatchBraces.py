"""
MatchBraces.py
Billy Cussen
18/11/2020
"""
import timeit

def matchBraces(word):
    wordLength = len(word)
    if wordLength % 2 != 0:
        return False
    else:
        match = True
        tempLen = wordLength-1
        for i in range(int(wordLength/2)):
            if word[i] != '{' and word[tempLen] != '}':
                match = False
                break
            else:
                tempLen-=1
        return match

def matchBracesRecursion(word):
    if len(word) == 0:
        return True
    
    if len(word) % 2 != 0:
        return False
    elif word[0] == '{' and word[len(word)-1] == '}':
        return matchBracesRecursion(word[1:len(word)-1])
    else:
        return False

startTime = timeit.default_timer()
print("Match Braces: "+str(matchBraces("{{{}}}")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Match Braces Recursion: "+str(matchBracesRecursion("{{{}}}")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Match Braces: "+str(matchBraces("{{{}}")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Match Braces Recursion: "+str(matchBracesRecursion("{{{}}")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Match Braces: "+str(matchBraces("{}")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer()
print("Match Braces Recursion: "+str(matchBracesRecursion("{}")))
endTime = timeit.default_timer()
nanoTime = round((endTime-startTime)*1000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")