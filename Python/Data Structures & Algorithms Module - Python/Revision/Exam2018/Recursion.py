"""
Recursion.py
Billy Cussen
09/03/2021
"""

"""
Write a recursive method that finds the number of occurrences of a specified letter in a string
using the following method header:
public static int count(String str, char a)
For example, count("Galway", 'a') returns 2. Write a JAVA program that prompts the user to enter
a string and a character, and displays the number of occurrences for the character in the string.
"""

def count(str, a):
    if(len(str)==0):
        return 0
    return countHelp(str, a)

def countHelp(str, a):
    if(str==""):
        return 0
    if(str[0]==a):
        return 1 + countHelp(str[1:], a)
    else:
        return countHelp(str[1:],a)

print(str(count("Galway",'a')))
print(str(count("Limerick",'i')))
print(str(count("Roscommon",'o')))
print(str(count("Waterford",'d')))
print(str(count("",'a')))
print(str(count("Dublin",'a')))
