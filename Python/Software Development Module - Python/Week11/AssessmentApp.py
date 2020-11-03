"""
AssessmentApp.py
Billy Cussen
06/10/2020
"""

#Objects
import gc
import re
import Assessment 
from Assessment import myAssessment
import Test 
from Test import myTest
import Project
from Project import myProject

#Variables
repeat = "y"
inputCheck = True

while repeat == "y":

    #Input - Assessment Type
    while inputCheck:
        try:
            typeOfAssessment = str(input("Please enter Assessment Type (\"Test\" or \"Project\"): "))
            typeOfAssessment = typeOfAssessment.lower()
        except:
            print("You need to enter your appointment type!")
        else:
            if(typeOfAssessment != "test" and typeOfAssessment != "project"):
                print("You need to enter \"Test\" or \"Project\"!")
            else:
                inputCheck = False

    #Input - Weighting
    while inputCheck == False:
        try:
            weighting = int(input("Please enter your Weighting of this "+str(typeOfAssessment)+" (e.g. 60): "))
        except:
            print("You need to enter a number to Denote the Weighting of this "+str(typeOfAssessment)+"!")
        else:
            if(weighting <= 0 or weighting > 100):
                print("You need to enter a number between 1 and 100!")
            else:
                inputCheck = True

    #Input - Name
    while inputCheck:
        try:
            name  = str(input("Please enter the Name of this "+str(typeOfAssessment)+" (e.g. \"OOP Programming\"): "))
            name  = name.lower()
        except:
            print("You need to enter a valid name!")
        else:
            if(len(name) <= 0):
                print("You need to enter a valid name for this "+str(typeOfAssessment)+"!")
            else:
                inputCheck = False


    if(typeOfAssessment == "test"):
        while inputCheck == False:
            try:
                questions = int(input("Please enter the number of question in this "+str(typeOfAssessment)+" (e.g. 60): "))
            except:
                print("You need to enter the NUMBER of questions in this "+str(typeOfAssessment)+"!")
            else:
                if(questions <= 0):
                    print("You need to enter a valid number of questions!")
                else:
                    inputCheck = True

        while inputCheck:
            try:
                duration  = int(input("Please enter the Duration of this "+str(typeOfAssessment)+" in minutes (e.g. 60): "))
            except:
                print("You need to enter a valid number!")
            else:
                if(duration <= 0):
                    print("You need to enter a valid Duration for this "+str(typeOfAssessment)+"!")
                else:
                    inputCheck = False

        #Process & Output
        try:
            myTestApp = myTest(weighting, name, typeOfAssessment, questions, duration)
            print(myTestApp.toString())
        except Exception as e:
            print(str(e))
        finally:
            myAssessmentApp = None
            gc.collect()
    else:
        while inputCheck == False:
            try:
                dateTemp = str(input("Enter the Deadline Date of this "+str(typeOfAssessment)+" (In the format DD/MM/YYYY): "))
                checkDate = re.search("[0-9]{2}/[0-9]{2}/[0-9]{4}", dateTemp)
                if checkDate == False:
                    raise Exception()
            except:
                print("You need to enter a valid Deadline Date for this "+str(typeOfAssessment)+"!")
            else:
                if(len(dateTemp) < 8):
                    print("You need to enter a valid Date for the Deadline!")
                else:
                    inputCheck = True

        #Process & Output
        try:
            myAssessmentApp = myProject(weighting, name, typeOfAssessment, dateTemp)
            print(myAssessmentApp.toString())
        except Exception as e:
            print(str(e))
        finally:
            myAssessmentApp = None
            gc.collect()


    #Input - Repeat?
    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"Y\" to continue or \"N\" to quit: "))
        repeat = repeat.lower()
        if repeat != "y" and repeat !="n":
            print("You need to enter \"y\" or \"n\"")
    
print("Thanks for using my App!")