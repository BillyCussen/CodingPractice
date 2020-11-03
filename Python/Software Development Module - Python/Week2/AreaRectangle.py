"""
AreaRectangle.py
Billy Cussen
23/09/2020
"""

repeat = "y"
inputCheck = False

while repeat == "y":

    while inputCheck == False:
        try:
            length = float(input("Please enter the Rectangles Length: "))
        except:
            print("You need to enter a Number!")
        else:
            if length<=0:
                print("The length of the rectangle needs to be 1 or greater!")
            else:
                inputCheck = True

    while inputCheck == True:
        try:
            width = float(input("Please enter the Rectangles Width: "))
        except: 
            print("You need to enter a number!")
        else:
            if width<=0:
                print("The Rectangles width needs to be 1 or greater")
            else:
                print("The area of the Rectangle is: "+str(length*width))
                inputCheck = False;

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = input("Please enter if you would like to retry (\"Y\" or \"N\"): ")
        repeat = repeat.lower()

        if(repeat!="y" and repeat != "n"):
            print("You need to enter Y or N")

print("Thanks for using my App!")    