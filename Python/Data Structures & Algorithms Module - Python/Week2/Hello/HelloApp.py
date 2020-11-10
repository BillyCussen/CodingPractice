"""
HelloApp.py
Billy Cussen
10/11/2020
"""
from Hello import MyHello
from French import FrenchHello
from German import GermanHello

myHelloApp = MyHello("")
myHelloApp1 = FrenchHello()
myHelloApp2 = GermanHello()

print("Language: "+myHelloApp.getLanguage()+", "+myHelloApp.sayHello())
print("Language: "+myHelloApp1.getLanguage()+", "+myHelloApp1.sayHello())
print("Language: "+myHelloApp2.getLanguage()+", "+myHelloApp2.sayHello())