"""
UsernameGenerator.py
Billy Cussen
02/11/2020
"""

class myUsernameGenerator:

    def __init__(self, users):
        self.users = users
        self.VOWELS = "aeiou"
        self.CONSONANTS = "bcdfghjklmnpqrstvwxyz"

    def getUserNames(self):
        position = 0
        for user in self.users:
            new_user = user.replace(" ","10")
            for c in new_user:
                for v in self.VOWELS:
                    if c == v:
                        new_user = new_user.replace(c,"")
            self.users[position] = user+"'s username: "+new_user
            position = position + 1
        return self.users

