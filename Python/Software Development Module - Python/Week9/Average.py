"""
Average.py
Billy Cussen
01/10/2020
"""

class myAverage:
    def __init__(self, arrayNumbers):
        self.arrayNumbers = arrayNumbers
        self.average = 0
        self.min = 0
        self.max = 0
    
    def calculateAverage(self):
        total = 0
        self.min = self.arrayNumbers[0]
        self.max = self.arrayNumbers[0]
        for i in self.arrayNumbers:
            total+=i
            if i < self.min:
                self.min = i
            if i > self.max:
                self.max = i
        
        self.average = total / len(self.arrayNumbers)
        
        