"""
Test.py
Billy Cussen
06/10/2020
"""
import Assessment

class myTest(Assessment.myAssessment):

    def __init__(self, weighting, name, typeOfAssessment, questions, duration):
        super().__init__(weighting, name, typeOfAssessment)
        self.questions = questions
        self.duration = duration

    def setQuestions(self, questions):
        self.questions = questions

    def setDuration(self, duration):
        self.duration = duration

    def getQuestions(self):
        return self.questions

    def getDuration(self):
        return self.duration

    def toString(self):
        return "Weighting: "+str(self.weighting)+"\nName: "+self.name+"\nType of Assessment: "+self.typeOfAssessment+"\nQuestions: " + str(self.questions) + "\nDuration: "+ str(self.duration)
        return 
        