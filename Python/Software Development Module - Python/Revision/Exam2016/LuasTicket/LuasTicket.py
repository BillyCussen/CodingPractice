"""
LuasTicket.py
Billy Cussen
31/10/2020
"""
import CustomerInfo
from CustomerInfo import myCustomerInfo

class myLuasTicket:
    def __init__(self, myCustomerInformation):
        self.myCustomerInformation = myCustomerInformation
        self.cost = 0.0

    def getLuasTicket(self):
        if self.myCustomerInformation.getTicketType() == "adult":
            if self.myCustomerInformation.getNumberOfZones() == 1:
                self.cost = 1.50
            elif self.myCustomerInformation.getNumberOfZones() == 2:
                self.cost = 2.30
            else:
                self.cost = 2.90
        elif self.myCustomerInformation.getTicketType() == "child":
            if self.myCustomerInformation.getNumberOfZones() == 1:
                self.cost = 1.00
            elif self.myCustomerInformation.getNumberOfZones() == 2:
                self.cost = 1.20
            else:
                self.cost = 1.50
        else:
            raise Exception("Apologies, An Error has occured!")

        return self.cost
    