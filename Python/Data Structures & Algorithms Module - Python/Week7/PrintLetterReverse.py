"""
PrintLetterReverse.py
Billy Cussen
19/11/2020
"""

def printLetterReverse(word):
    wordLen = len(word)
    output = ""
    while wordLen > 0:
        output+=word[wordLen-1]+"\n"
        wordLen-=1
    return output

def printLetterReverseRecursion(word):
    if(len(word)<=1):
        return word

    return word[len(word)-1]+"\n"+printLetterReverseRecursion(word[:len(word)-1])

print("Print Letter Reverse:\n"+printLetterReverse("ylliB"))
print("Print Letter Reverse Recursion:\n"+printLetterReverseRecursion("ylliB"))