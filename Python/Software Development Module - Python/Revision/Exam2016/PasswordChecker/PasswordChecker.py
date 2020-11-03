

class myPasswordChecker:
    def __init__(self, passwordsList):
        self.passwordsList = passwordsList
        self.specialCharacters = "/*!@#$%^&'*()\"{}_[]|\\?/<>,."
        self.result = ""

    def getPasswords(self):
        self.result = "***Password Strength***\n"
        passwordNumber = 1
        specialCharacterCount = 0
        specialCharacterRule = False
        upperCaseRule = False
        numericRule = False

        for password in self.passwordsList:
            #Check if Password Length is 10 or longer
            if len(password) >= 10:
                #Check if Password has at least 2 Special Characters
                for c in password:
                    for sc in self.specialCharacters:
                        if c == sc:
                            specialCharacterCount = specialCharacterCount +1
                            break
                if specialCharacterCount >= 2:
                    print("Special Characters!")
                    specialCharacterRule = True
                
                #Check if Password has at least 1 Uppercase Letter
                for c1 in password:
                    if c1.isupper():
                        print("Upper Case!")
                        upperCaseRule = True
                        break
                #Check if Password has at least 1  Number
                for c2 in password:
                    if c2.isnumeric():
                        print("Numbers!")
                        numericRule = True
                        break

                if specialCharacterCount and upperCaseRule and numericRule:
                    self.result += "Password "+str(passwordNumber)+" is Strong!\n"
                else:
                    self.result += "Password "+str(passwordNumber)+" is weak, it needs at least one special characer, uppercase letter and Number!\n"

            else:
                self.result +="Password "+str(passwordNumber)+" is Weak, its too short!\n"
            passwordNumber = passwordNumber+1
        return self.result 