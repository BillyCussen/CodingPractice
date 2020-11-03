"""
Service.py
Billy Cussen
27/09/2020
"""
#Class Declaration
class myService:
    #Constructor
    def __init__(self, serviceType,serviceLocation):
        self.serviceType = serviceType
        self.serviceLocation = serviceLocation
    
    def computeAndGetServiceDay(self):
        if self.serviceLocation == "blanchardstown":
            if self.serviceType == "full":
                return "Your Service is on Monday"
            elif self.serviceType == "pre":
                return "Your Service is on Wednesday"
            elif self.serviceType == "interim":
                return "Your Service is on Friday"
            else:
                return "Something went Wrong here!"
        elif self.serviceLocation == "drogheda":
            if self.serviceType == "full":
                return "Your Service is on Tuesday"
            elif self.serviceType == "pre":
                return "Your Service is on Thursday"
            elif self.serviceType == "interim":
                return "Your Service is on Saturday"
            else:
                return "Something went Wrong here!"
        else:
            return "Something went Wrong here!"
        