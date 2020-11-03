"""
InterestCalculatorApp.py
Billy Cussen
02/11/2020
"""

#Objects
import gc
import InterestCalculator
from InterestCalculator import myInterestCalculator

#Variable
repeat = "y"

while repeat == "y":
    inputCheck = False
    allDeposits = []
    myInterestCalculatorApp = myInterestCalculator()

    #Input - Number of Deposits!
    while inputCheck == False:
        try:
            numberOfDeposits = int(input("Please enter the number of Deposits to be checked (10 Max please!): "))
            if numberOfDeposits <= 0 or numberOfDeposits > 10:
                raise Exception
        except Exception:
            print("You need to enter an Integer between 1 and 10(e.g. 1,2,3...).")
        else:
            inputCheck = True
    
    for d in range(numberOfDeposits):
        inputCheck = True
        #Input - Amount to be Deposited
        while inputCheck:
            try:
                amount = float(input("Please enter the amount to be Deposited for Deposit "+str(d+1)+" (Min: 1000, Max: 10000): "))
                if amount < 1000 or amount > 10000:
                    raise Exception
            except Exception:
                print("Minimum that can be deposited is 1000, Maximum is 10000.")
            else:
                inputCheck = False

        #Input - Length of Term
        while inputCheck == False:
            try:
                months = int(input("Please enter the months for the Fixed Term Account (6, 12 or 18) for Deposit "+str(d+1)+": "))
                if months != 6 and months != 12 and months != 18:
                    raise Exception
            except Exception:
                print("You need to enter either 6, 12 or 18")
            else:
                inputCheck = True

        #Input - Can Money be Accessed
        while inputCheck:
            try:
                answer = str(input("Please enter if customer will be able to access money during this time (\"Y\" or \"N\"): "))
                answer = answer.lower()
                if answer != "y" and answer != "n":
                    raise Exception
            except Exception:
                print("You need to enter either \"Y\" or \"N\"")
            else:
                if answer == "y":
                    accessMoney = True
                else:
                    accessMoney = False
                inputCheck = False
        
        #Process & Output
        try:
            interest = myInterestCalculatorApp.getInterest(amount, months, accessMoney)
            result = "Total Interest for Customer "+str(d+1)+" is: "+str(interest)
        except Exception:
            print("An Error Occured when calculating interest for customer "+str(d+1))
        else:
            print(result)
            allDeposits.append(interest)

    try:
        highestInterestAmount = myInterestCalculatorApp.getHighestInterest(allDeposits)
        highestInterestResult = "Highest Interest for this batch of Deposits is: "+str(highestInterestAmount)
    except Exception:
        print("An Error Occured calculating Highest Interest of Deposits input")
    else:
        print(highestInterestResult)
        myInterestCalculatorApp = None
        allDeposits = None
        gc.collect()

    repeat = ""
    while repeat != "y" and repeat !="n":
        repeat = str(input("Please enter \"y\" to continue and \"n\" to exit: "))
        if repeat != "y" and repeat !="n":
            print("You need to enter \"y\" or \"n\"!")

print("Thanks for using my Interest Calculator App!")