"""
PrintLetterReverse.py
Billy Cussen
13/01/2021
"""

def printLetterReverse(word):
    if len(word) == 0:
        return word
    return word[len(word)-1]+"\n"+printLetterReverse(word[0:len(word)-1])

print(printLetterReverse("ylliB"))