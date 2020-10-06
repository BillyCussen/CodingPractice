"""
HairdresserApp.py
Billy Cussen
03/10/2020
"""

#Objects
import gc
import Hairdresser 
from Hairdresser import myAppointment

#Variables
repeat = "y"
inputCheck = True

while repeat == "y":

    #Input - Appointment Type
    while inputCheck:
        try:
            appointmentType = str(input("Please enter your Appointment Type (\"Style\" or \"Cut\"): "))
            appointmentType = appointmentType.lower()
        except:
            print("You need to enter your appointment type!")
        else:
            if(appointmentType != "style" and appointmentType != "cut"):
                print("You need to enter \"Style\" or \"Cut\"!")
            else:
                inputCheck = False

    #Input - Hair Type
    while inputCheck == False:
        try:
            hairType = str(input("Please enter your Hair Type (\"Long\", \"Mid\" or \"Short\"): "))
            hairType = hairType.lower()
        except:
            print("You need to enter your Hair type!")
        else:
            if(hairType != "long" and hairType != "mid" and hairType != "short"):
                print("You need to enter \"Long\", \"Mid\" or \"Short\"!")
            else:
                inputCheck = True

    #Process & Output
    try:
        myAppointmentApp = myAppointment(appointmentType, hairType)
        myAppointmentApp.computeAppointmentDay()
        print(myAppointmentApp.day)
    except Exception as e:
        print(str(e))
    finally:
        myAppointmentApp = None
        gc.collect()

    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"Y\" to continue or \"N\" to quit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat !="n":
            print("You need to enter \"y\" or \"n\"")
    
print("Thanks for using my App!")