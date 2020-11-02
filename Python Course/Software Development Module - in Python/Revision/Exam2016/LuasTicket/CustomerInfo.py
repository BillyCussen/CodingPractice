"""
CustomerInfo.py
Billy Cussen
31/10/2020
"""
class myCustomerInfo:
    def __init__(self, ticketType,numberOfZones):
        self.ticketType = ticketType
        self.numberOfZones = numberOfZones

    def getTicketType(self):
        return self.ticketType
    
    def getNumberOfZones(self):
        return self.numberOfZones