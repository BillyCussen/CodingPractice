"""
Bin.py
Billy Cussen
03/10/2020
"""
#Currently working on Logic here - learning how to work with Dictionaries in Python (as opposed to switch/case in Java)

class myBin:
    def __init__(self, binColor, apartmentNumber):
        self.binColor = binColor
        self.apartmentNumber = apartmentNumber
    
    def computeCollectionDay(self):
        result = "Your Collection Day will be: "

        def getCollectionDayGreen():
            print("Hello")
            if self.apartmentNumber % 2 == 0:
                print(result + "Monday")
            else:
                print(result + "Tuesday")

        def getCollectionDayBlack():
            if self.apartmentNumber % 2 == 0:
                print(result + "Wednesday")
            else:
                print(result + "Thursday")

        def getCollectionDayBrown():
            if self.apartmentNumber % 2 == 0:
                print(result + "Friday")
            else:
                print(result + "Saturday")

        choices = {'green': getCollectionDayGreen(), 'black': getCollectionDayBlack(), 'brown': getCollectionDayBrown()}
        return choices[self.binColor]