"""
ChangeXY.py
Billy Cussen
17/11/2020
"""

def changeXY(word):
    if "x" in word:
        word = word.replace("x","y")
    if "X" in word:
        word = word.replace("X","Y")
    return word

def changeXYRecursion(word):
    if len(word) <= 0:
        return word

    if word[0] == 'x':
        return "y" + changeXYRecursion(word[1:])
    elif word[0] == 'X':
        return "Y" + changeXYRecursion(word[1:])
    else:
        return word[0] + changeXYRecursion(word[1:]) 

print(changeXY("xxxXXX"))
print(changeXYRecursion("xxxXXX"))