"""
Temperature.py
Billy Cussen
19/10/2020
"""

class myTemperature:
    def __init__(self, weeks,temperatures):
        self.weeks = weeks
        self.temperatures = temperatures
        self.result = "***Average Temperatures***"

    def getAverages(self):

        self.result += "\nWeek 1: "+str(sum(self.temperatures[0])/7)
        if self.weeks >= 2:
            self.result += "\nWeek 2: "+str(sum(self.temperatures[1])/7)
            if self.weeks == 3:
                self.result += "\nWeek 3: "+str(sum(self.temperatures[2])/7)
        print(self.result)