"""
PolymorphismApp.py
Billy Cussen
12/10/2020
"""

#Objects
import gc
import Language
from Language import myLanguage
import English
from English import myEnglish
import French
from French import myFrench
import German
from German import myGerman
 
#Variables
repeat = "y"
inputCheck = True

while repeat == "y":

    myLanguageApp = myLanguage
    print(myLanguageApp.speak())
    inputCheck = True
    #Input - Get Language
    while inputCheck:
        try:
            language = str(input("Please enter a Language, \"English\", \"French\" or \"German\": "))
            language = language.lower()
        except:
            print("You need to enter one of the languages specified")
        finally:
            if language != "english" and language != "french" and language != "german":
                print("You need to enter \"English\", \"French\" or \"German\"")
            else: 
                inputCheck = False
                myLanguageApp = None

                try:
                    if language == "english":
                        myLanguageApp = myEnglish
                    elif language == "french":
                        myLanguageApp = myFrench
                    elif language == "german":
                        myLanguageApp = myGerman  
                    else:
                        raise Exception("Something went Wrong here, invalid language Input!")
                
                    print(myLanguageApp.speak())
                except Exception as e:
                    print(e)
                finally:
                    myLanguageApp = None
                    gc.collect()

    repeat = ""
    while repeat != "y" and repeat != "n":
        repeat = str(input("Please enter \"Y\" to Retry, \"N\" to Exit: "))
        repeat = repeat.lower()
        if repeat !="y" and repeat != "n":
            print("You need to enter \"Y\" or \"N\"")

print("Thanks for using my App!")