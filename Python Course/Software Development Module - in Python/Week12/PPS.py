"""
PPS.py
Billy Cussen
17/10/2020
"""

class myPPS:
    def __init__(self, pps):
        self.pps = pps

    def checkPPS(self):
        if len(self.pps) != 8:
            return "This is not a valid PPS, PPS Numbers have 8 characters (e.g. 1234567U)"
        elif self.pps[:7].isdigit() == False:
            return "This is not a valid PPS, the first 7 characters of a PPS should be Digits (e.g. 1234567U)"
        elif self.pps[7].isalpha() == False:
            return "This is not a valid PPS, the last character of a PPS Number should be a Number (e.g. 1234567U)"
        else:
            return "This is a valid PPS Number"
         