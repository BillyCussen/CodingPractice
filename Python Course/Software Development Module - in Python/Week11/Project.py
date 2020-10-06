"""
Project.py
Billy Cussen
06/10/2020
"""
import Assessment

class myProject(Assessment.myAssessment):

    def __init(self, weighting, name, typeOfAssessment, deadline):
        super().__init__(weighting, name, typeOfAssessment)
        self.deadline = deadline

    def setDeadline(self, deadline):
        self.deadline = deadline

    def getDeadline(self):
        return self.deadline

    def toString(self):
        return "Deadline: " + str(self.deadline)
        