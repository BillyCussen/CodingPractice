"""
Hi.py
Billy Cussen
18/11/2020
"""
import timeit

def countHi(word):
    count = 0
    word = word.lower()
    for i in range(len(word)):
        if word[i] == 'h' and word[i+1]=='i':
            count+=1
            i+=1
    return count


def countHiRecursion(word):
    if len(word) <= 1:
        return 0

    if (word[0] == 'h' or word[0] == 'H') and (word[1] == 'i' or word[1] == 'I'):
        return 1 + countHiRecursion(word[2:])
    else:
        return countHiRecursion(word[1:])


startTime = timeit.default_timer()
print("Count Hi: "+str(countHi("HihiHelloHelloHihi")))
endTime = timeit.default_timer() 
nanoTime = round((endTime-startTime)*1000000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer() 
print("Count Hi Recursion: "+str(countHi("HihiHelloHelloHihi")))
endTime = timeit.default_timer() 
nanoTime = round((endTime-startTime)*1000000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")