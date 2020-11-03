"""
LoginName.py
Billy Cussen
26/10/2020
"""

class myLoginName:
    def __init__(self,fullname):
        self.fullname = fullname

    def generateUsername(self):
        splitFullname = self.fullname.split()
        username = splitFullname[1]
        for c in splitFullname[0]:
            if c in "aeiou":
                username = username + c

        return self.fullname+"'s username is: "+str(username)
        