"""
PrintLetter.py
Billy Cussen
13/01/2021
"""

def printLetter(word):
    if len(word) == 0:
        return word
    return word[0] + "\n"+printLetter(word[1:len(word)])

print(printLetter("Billy"))