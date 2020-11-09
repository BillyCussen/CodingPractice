"""
TestArrayList.py
Billy Cussen
09/11/2020
"""

#Variables
inputCheck = False
list1 = []

def printArrayList(myList):
    for i in myList:
        print(i)

while inputCheck == False:

    try:
        words = int(input("Please enter words to be input (1 min, 5 max): "))
        if words < 1 or words > 5:
            raise Exception
    except Exception:
        print("You need to enter a number between 1 and 5")
    else:
        inputCheck = True

for i in range(words):
    inputCheck = True
    while inputCheck:
        try:
            word = str(input("Please enter word "+str(i+1)+": "))
            if word == "":
                raise Exception
        except Exception:
            print("Please enter a valid word!")
        else:
            inputCheck = False
            list1.append(word)
    
printArrayList(list1)

