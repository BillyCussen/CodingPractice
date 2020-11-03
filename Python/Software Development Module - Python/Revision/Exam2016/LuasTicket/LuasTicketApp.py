"""
LuasTicketApp.py
Billy Cussen
31/10/2020
"""

#Object
import gc
import LuasTicket
from LuasTicket import myLuasTicket
import CustomerInfo
from CustomerInfo import myCustomerInfo

#Variables
i = 0
repeat = "y"
ticketHistory = []

while repeat == "y":

    #Input - Ticket Type
    inputCheck = True
    while inputCheck:
        try:
            ticketType = input(str("Please enter Ticket type (\"Adult\" or \"Child\"): "))
            ticketType = ticketType.lower()
            if ticketType != "adult" and ticketType != "child":
                raise Exception
        except Exception:
            print("You need to enter \"Adult\" or \"Child\"")
        else:
            inputCheck = False

    while inputCheck == False:
        try:
            numberOfZones = input("Please enter the number of Zones you will visit: ")
            numberOfZones = int(numberOfZones)
            if numberOfZones <= 0 or numberOfZones > 8:
                raise Exception
        except Exception:
            print("You need to enter a number between 1 and 8")
        else:
            inputCheck = True

    #Process & Output
    myCustomerInfoCurrent = myCustomerInfo(ticketType,numberOfZones)
    myLuasTicketApp = myLuasTicket(myCustomerInfoCurrent)
    try:
        cost = myLuasTicketApp.getLuasTicket()
        print("Your Luas Ticket will cost: "+str(cost))
        i = i+1
        ticketHistory.append("Ticket Price "+str(i)+": "+str(cost))
    except Exception as e:
        print(e)
    else:
        myCustomerInfoCurrent = None
        myLuasTicketApp = None
        gc.collect

    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = input(str("Please enter \"y\" to retry, enter \"n\" to exit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat != "n":
            print("You need to enter \"y\" or \"n\"")

#Write History to Text File
file1 = open("LuasTicketApp.txt","r+") 
file1.truncate(0)

file1.write("***LUAS TICKET APP HISTORY***\n")
for ticket in ticketHistory:    
    file1.write(ticket+"\n")
file1.close()
file1 = None

#Read Contents and print Results
with open("LuasTicketApp.txt") as text_file:
    contents = text_file.read()
print(contents)

gc.collect()

print("Thanks for using my Luas Ticket App!")