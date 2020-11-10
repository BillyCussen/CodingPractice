"""
German.py
Billy Cussen
10/11/2020
"""
import Hello

class GermanHello(Hello.MyHello):

    language = "German"

    def __init__(self):
        super().__init__(self.language)

    def sayHello(self):
        return "Guten Tag"