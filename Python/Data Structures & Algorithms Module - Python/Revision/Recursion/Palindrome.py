"""
Palindrome.py
Billy Cussen
13/01/2021
"""

def palindrome(word):
    if len(word) <= 1:
        return True
    else:
        return palindrome(word[1:len(word)-1]) and (word[0]==word[len(word)-1])

print(str(palindrome("moom")))