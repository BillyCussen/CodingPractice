"""
Assessment.py
Billy Cussen
06/10/2020
"""

class myAssessment:
    
    def __init__(self, weighting, name, typeOfAssessment):
        self.weighting = weighting
        self.name = name
        self.typeOfAssessment = typeOfAssessment

    def setWeighting(self, weighting):
        self.weighting = weighting

    def setName(self, name):
        self.name = name

    def setType(self, typeOfAssessment):
        self.typeOfAssessment = typeOfAssessment

    def toString(self):
        return "Weighting: "+str(self.weighting) + ", Name: " + str(self.name)+", Type: " + str(self.typeOfAssessment)