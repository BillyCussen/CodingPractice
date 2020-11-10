"""
French.py
Billy Cussen
10/11/2020
"""
import Hello

class FrenchHello(Hello.MyHello):
    
    language = "French"
    def __init__(self):
        super().__init__(self.language)

    def sayHello(self):
        return "Bonjour"