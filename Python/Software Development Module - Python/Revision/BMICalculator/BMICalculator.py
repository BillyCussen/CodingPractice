"""
BMICalculator.py
Billy Cussen
21/10/2020
"""

class myBMICalculator:
    def __init__(self, weight, height):
        self.weight = weight
        self.height = height

    def calculateBMI(self):
        return "Your BMI is: "+str(round(self.weight/pow(self.height,2),2))