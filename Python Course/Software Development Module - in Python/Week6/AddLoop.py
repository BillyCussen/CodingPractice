"""
AddLoop.py
Billy Cussen
28/09/2020
"""

class myLoop:
    def __init__(self, number):
        self.number = number

    def executeLoop(self):
        for i in range(self.number+1):
            print(i)
        else:
            print("Finished Traversing the Loop!")