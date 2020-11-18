"""
MoveX.py
Billy Cussen
18/11/2020
"""
import timeit

spaceCount = 1

def moveX(word):
    x, newWord = "", ""

    for i in word:
        if i == 'x' or i == 'X':
            x += i
        else:
            newWord += i
    return newWord+" "+x
    
def moveXRecursion(word):
    if len(word) == 0:
        return word

    global spaceCount
    if spaceCount == 1:
        word += " "
        spaceCount+= 1

    if word[0] == 'x' or word[0] == 'X':
        return moveXRecursion(word[1:])+word[0]
    else:
        return word[0] + moveXRecursion(word[1:])

startTime = timeit.default_timer()
print("Move X: "+str(moveX("HxexlXlxox Txhxexrxex!")))
endTime = timeit.default_timer() 
nanoTime = round((endTime-startTime)*1000000000,2)
print("Looped Approach took "+str(nanoTime)+" nanoseconds")

startTime = timeit.default_timer() 
print("Move X Recursion: "+str(moveXRecursion("HxexlXlxox Txhxexrxex!")))
endTime = timeit.default_timer() 
nanoTime = round((endTime-startTime)*1000000000,2)
print("Recursive Approach took "+str(nanoTime)+" nanoseconds")