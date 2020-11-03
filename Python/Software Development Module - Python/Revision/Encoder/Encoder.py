"""
Encoder.py
Billy Cussen
22/10/2020
"""

class myEncoder:
    def __init__(self, word):
        self.word = word

    def encodeWord(self):
        self.word = reverse(self.word.lower())
        length = len(self.word)-1

        while length >= 0:
            if self.word[length]=='a':
                self.word = self.word.replace("a","12")
            elif self.word[length] == 'e':
                self.word = self.word.replace("e","21")
            elif self.word[length] == 'i':
                self.word = self.word.replace("i","33")
            elif self.word[length] == 'o':
                self.word = self.word.replace("o","48")
            elif self.word[length] == 'u':
                self.word = self.word.replace("u","09")
            else:
                self.word = self.word
            
            length = length - 1
        
        return "Encoded Word is: "+str(self.word)

def reverse(s): 
    if len(s) == 0: 
        return s 
    else: 
        return reverse(s[1:]) + s[0] 
