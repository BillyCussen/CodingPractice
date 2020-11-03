"""
Results.py
Billy Cussen
01/10/2020
"""

class myResults:
    def __init__(self, examResultsAll):
        self.examResultsAll = examResultsAll
        self.result = ""
        self.averageTotal = 0
        self.minTotal = 0
        self.maxTotal = 0
    
    def computeAndGetResults(self):

        for i in range(len(self.examResultsAll)):

            averageForStudent = 0
            minForStudent = self.examResultsAll[0][0]
            maxForStudent = self.examResultsAll[0][0]

            for j in range(len(self.examResultsAll[0])):
                self.result += "Student "+str(i+1)+", Exam "+str(j+1)+": "+str(self.examResultsAll[i][j])+"\n";
                averageForStudent += self.examResultsAll[i][j]
                if self.examResultsAll[i][j] < minForStudent:
                    minForStudent = self.examResultsAll[i][j]
                if self.examResultsAll[i][j] > maxForStudent:
                    maxForStudent = self.examResultsAll[i][j]
                
            self.averageTotal += averageForStudent
            if i == 0:
                self.minTotal = minForStudent
                self.maxTotal = maxForStudent

            averageForStudent = int(averageForStudent / len(self.examResultsAll[0]))
            self.result += "Student "+str(i+1)+", Average Result: "+str(averageForStudent)+", Lowest Grade: "+str(minForStudent)+", Highest Grade: "+str(maxForStudent)+"\n\n"

            if minForStudent < self.minTotal:
                self.minTotal = minForStudent
            if maxForStudent > self.maxTotal:
                self.maxTotal = maxForStudent
        
        self.averageTotal = int(self.averageTotal / (len(self.examResultsAll) * len(self.examResultsAll[0])))
        self.result += "Average Grade of all Students: "+str(self.averageTotal)+"\n";
        self.result += "Lowest Grade of all Students: "+str(self.minTotal)+"\n";
        self.result += "Highest Grade of all Students: "+str(self.maxTotal)+"\n";        
