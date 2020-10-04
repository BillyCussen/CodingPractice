"""
Hairdresser.py
Billy Cussen
04/10/2020
"""

class myAppointment:
    def __init__(self,appointmentType, hairType):
        self.appointmentType = appointmentType
        self.hairType = hairType
        self.day = "Your Appointment is on: "

    def computeAppointmentDay(self):
        if(self.appointmentType =="style"):
            if(self.hairType == "long"):
                self.day += "Monday"
            elif(self.hairType == "mid"):
                self.day += "Tuesday"
            elif(self.hairType == "short"):
                self.day += "Wednesday"
            else:
                raise Exception("Something went Wrong here, invalid Hairtype selected!")
        elif(self.appointmentType == "cut"):
            if(self.hairType == "long"):
                self.day += "Thursday"
            elif(self.hairType == "mid"):
                self.day += "Friday"
            elif(self.hairType == "short"):
                self.day += "Saturday"
            else:
                raise Exception("Something went Wrong here, invalid Hairtype selected!")
        else:
            raise Exception("Something went wrong here, invalid Appointment Type selected!")