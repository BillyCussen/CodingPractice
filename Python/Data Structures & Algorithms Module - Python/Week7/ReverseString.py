"""
ReverseString.py
Billy Cussen
19/11/2020
"""

def reverseString(word):
    wordLen = len(word)-1
    output = ""
    while wordLen >= 0:
        output+=word[wordLen]
        wordLen-=1
    return output

def reverseStringRecursion(word):
    if(len(word)<=0):
        return word

    return word[len(word)-1]+reverseStringRecursion(word[:len(word)-1])

print ("Reverse String: "+reverseString("ylliB"))
print ("Reverse String Recursion: "+reverseStringRecursion("ylliB"))