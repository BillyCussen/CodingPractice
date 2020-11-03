"""
Decrypt.py
Billy Cussen
29/09/2020
"""

class myDecryption:
    def __init__(self, sentance):
        self.sentance = sentance
        self.result = ""

    def decryptSentance(self):
        for i in reversed(self.sentance):
            self.result+=i

        self.result = self.result.replace("?","a")
        self.result = self.result.replace("/","e")
        self.result = self.result.replace("$","i")
        self.result = self.result.replace("&","o")
        self.result = self.result.replace("+","u")
        self.result = self.result.replace("%"," ")
        self.result = self.result.replace("#"," ")
        self.result = self.result.replace(" ","")
        return self.result