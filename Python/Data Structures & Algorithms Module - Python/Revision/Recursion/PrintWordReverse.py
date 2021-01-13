"""
PrintWordReverse.py
Billy Cussen
13/01/2021
"""

def printWordReverse(word):
    if len(word) == 0:
        return word
    return word[len(word)-1]+printWordReverse(word[0:len(word)-1])


print(printWordReverse("ylliB"))