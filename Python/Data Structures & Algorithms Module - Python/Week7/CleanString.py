"""
CleanString.py
Billy Cussen
17/11/2020
"""

def cleanString(word):
    res = ""
    s = set()
    for c in word:
        if c not in s:
            res+=c
            s.add(c)
    return res

def cleanStringRecursion(word):
    if len(word) == 1:
        return word

    if word[1] == word[0]:
        return cleanStringRecursion(word[1:])
    else:
        return word[0]+cleanStringRecursion(word[1:])

print(cleanString("aaabbbccccdddddd"))
print(cleanStringRecursion("aaaaabbbbbbccccccddddddeeeeeeffffggggg"))