"""
ResultsApp.py
Billy Cussen
01/10/2020
"""

#Objects
import gc
import Results
from Results import myResults

#Variables
repeat = "y"

while repeat == "y":

    inputCheck = True
    #Input - Get Number of Students
    while inputCheck:
        try:
            students = int(input("Please enter the number of Students being checked (10 Max): "))
        except:
            print("You need to enter an Integer between 1 and 10")
        else:
            if students < 1 or students > 10:
                print ("You need to pick between 1 and 10 students")
            else:
                inputCheck = False
    
    #Input - Get Exams to Grade
    while inputCheck == False:
        try:
            exams = int(input("Please enter the number of exams to Grade (5 max): "))
        except:
            print("You need to enter an Integer between 1 and 5")
        else:
            if exams < 1 or exams > 5:
                print("You need to pick between 1 and 5 exams")
            else:
                inputCheck = True

    #Input - Get Results of each Exam for each Student (Using a 2D Array)
    rows, columns = (students, exams)
    examResultsAll = []
    for i in range(columns):
        examResults = []
        for j in range(rows):
            inputCheck = False
            while inputCheck == False:
                try:
                    resultTemp = int(input("Please enter results for Exam "+str(i+1)+" for Student "+str(j+1)+": "))
                except:
                    print("You need to enter an Integer for their Grade (e.g. 45, 92)")
                else:
                    if resultTemp < 0 or resultTemp > 100:
                        print("The result entered needs to be between 0 and 100")
                    else:
                        inputCheck = True
                        examResults.append(resultTemp)
        
        examResultsAll.append(examResults)
    
    myResultsApp = myResults(examResultsAll)
    myResultsApp.computeAndGetResults()
    print(myResultsApp.result)
    myResultsApp = None
    gc.collect()

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"Y\" or \"N\" if you would like to Repeat or Exit: "))
        repeat = repeat.lower()

        if repeat != "y" and repeat != "n":
            print("You need to enter \"Y\" or \"N\"")

print("Thanks for using the App!")