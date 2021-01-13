"""
RemoveX.py
Billy Cussen
13/01/2021
"""

def removeX(word):
    if len(word) <= 0:
        return word
    if word[0] == 'x' or word[0] == 'X':
        return removeX(word[1:len(word)])
    else:
        return word[0] + removeX(word[1:len(word)])

print(removeX("BxiXlxlXyx"))