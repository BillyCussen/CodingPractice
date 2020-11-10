"""
Hello.py
Billy Cussen
10/11/2020
"""
class MyHello:

    language = "English"

    def __init__(self, language):
        if language != "":
            self.language = language
        else:
            pass

    def sayHello(self):
        return "Hello"

    def getLanguage(self):
        return self.language