""""
MakingChange.py
Billy Cussen
23/09/2020
"""

inputCheck = True
repeat = "y"

while repeat == "y":

    fiftyEuro = 0
    twentyEuro = 0
    tenEuro = 0
    fiveEuro = 0
    twoEuro = 0
    oneEuro = 0
    fiftyCent = 0
    twentyCent = 0
    tenCent = 0
    fiveCent = 0
    twoCent = 0
    oneCent = 0

    while inputCheck:
        try:
            cost = float(input("Enter the Cost of the Transaction: "))
        except:
            print("You need to enter a Number!")
        else:
            if cost <= 0:
                print("You need to enter a Number greater than 0")
            else:
                inputCheck = False
    
    while inputCheck == False:
        try:
            customer = float(input("Enter How much the customer has presented: "))
        except:
            print("You need to enter a Number!")
        else:
            if customer <= 0:
                print("You need to enter a Number greater than 0")
            elif customer < cost:
                print("The Customer has not provided enough, please ask again")
            else:
                inputCheck = True

    change = float(round(((customer-cost)*100),2)/100)
    print("Customer Change is: "+str(change))

    while change >= 50:
        change-=50
        fiftyEuro = fiftyEuro + 1
    if fiftyEuro > 0:
        print("Fifty Euro Notes in Change: "+str(fiftyEuro))

    while change >= 20:
        change-=20
        twentyEuro = twentyEuro + 1
    if twentyEuro > 0:
        print("Twenty Euro Notes in Change: "+str(twentyEuro))

    while change >= 10:
        print(str(change))
        change-=10
        tenEuro = tenEuro + 1
    if tenEuro > 0:
        print("Ten Euro Notes in Change: "+str(tenEuro))

    while change >= 5:
        change-=5
        fiveEuro = fiveEuro + 1
    if fiveEuro > 0:
        print("Five Euro Notes in Change: "+str(fiveEuro))  

    while change >= 2:
        change-=2
        twoEuro = twoEuro + 1
    if twoEuro > 0:
        print("Two Euro Coins in Change: "+str(twoEuro))  

    while change >= 1:
        change-=1
        oneEuro = oneEuro + 1
    if oneEuro > 0:
        print("One Euro Coins in Change: "+str(oneEuro))  

    while change >= .5:
        change-=.5
        fiftyCent = fiftyCent + 1
    if fiftyCent > 0:
        print("Fifty Cent Coins in Change: "+str(fiftyCent))  

    while change >= .2:
        change-=.2
        twentyCent = twentyCent + 1
    if twentyCent > 0:
        print("Twenty Cent Coins in Change: "+str(twentyCent)) 

    repeat = ""

    while repeat != "y" and repeat != "n":
        repeat = str(input("Would you like to try again (\"Y\" or \"N\"): "))
        repeat = repeat.lower()
        if(repeat != "y" and repeat != "n"):
            print("You need to enter Y or N")
    
print("Thanks for using the App!")
