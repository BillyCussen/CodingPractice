"""
Project.py
Billy Cussen
06/10/2020
"""
import Assessment

class myProject(Assessment.myAssessment):

    def __init__(self, weighting, name, typeOfAssessment, deadline):
        super().__init__(weighting, name, typeOfAssessment)
        self.deadline = deadline

    def setDeadline(self, deadline):
        self.deadline = deadline

    def getDeadline(self):
        return self.deadline

    def toString(self):
        return "Weighting: "+str(self.weighting)+"\nName: "+self.name+"\nType of Assessment: "+self.typeOfAssessment+"\nDeadline: " + str(self.deadline)
        