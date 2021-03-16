"""
Recursion1.py
Billy Cussen
16/03/2021
"""

def count(str, c):
    if len(str) == 0:
        return 0
    
    if (str[0] == c):
        return 1 + count(str[1:],c)
    else:
        return count (str[1:],c)

print("Count ""u"" in ""Dublin"": "+str(count("Dublin", 'u')))
print("Count ""p"" in ""Tipperary"": "+str(count("Tipperary", 'p')))
print("Count ""o"" in ""Roscommon"": "+str(count("Roscommon", 'o')))
print("Count ""x"" in ""Galway"": "+str(count("Galway", 'x')))
print("Count ""x"" in "" "": "+str(count(" ", 'x')))