"""
PasswordGenerator.py
Billy Cussen
31/10/2020
"""

class myPasswordGenerator:

    def __init__(self, fullName):
        self.VOWELS = "aeiou"
        self.fullName = fullName

    def getPassword(self):
        self.fullName = self.fullName.lower()
        password = ""
        for c in self.fullName:
            password = c + password

        for c1 in self.fullName:
            if c1 in self.VOWELS:
                password = password.replace(c1,"")
            
        for c2 in password:
            if c2 == ' ':
                    password = password.replace(" ","+")

        password = password.title()
        return password