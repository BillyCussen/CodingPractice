"""
PhoneNumber.py
Billy Cussen
15/10/2020
"""

class myPhoneNumber:
    def __init__(self, phoneNumber):
        self.phoneNumber = phoneNumber

    def computePhoneNumber(self):
        if(self.phoneNumber[0:2] == "08" and 
        (self.phoneNumber.find("3")==2 or self.phoneNumber.find("5")==2 or self.phoneNumber.find("6")==2 
        or self.phoneNumber.find("7")==2 or self.phoneNumber.find("9")==2)):
            print("Your phone number is valid")
        else:
            print("Your phone number is invalid")