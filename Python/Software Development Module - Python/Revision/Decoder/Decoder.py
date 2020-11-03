"""
Decoder.py
Billy Cussen
21/10/2020
"""

class myDecoder:
    def __init__(self, word):
        self.word = word

    def decodeWord(self):
        result = ""
        length = len(self.word)-1
        while length >= 0:
            if self.word[length] == '1' and self.word[length-1] =='2':
                self.word = self.word.replace("21","a")
                length=length-1
            elif self.word[length] == '2' and self.word[length-1] =='1':
                self.word = self.word.replace("12","e")
                length=length-1
            elif self.word[length] == '3' and self.word[length-1] =='3':
                self.word = self.word.replace("33","i")
                length=length-1
            elif self.word[length] == '4' and self.word[length-1] =='8':
                self.word = self.word.replace("84","o")
                length=length-1
            elif self.word[length] == '0' and self.word[length-1] =='9':
                self.word = self.word.replace("90","u")
                length=length-1
            
            length=length-1
        
        return "Decoded Word is: "+self.word
