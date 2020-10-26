"""
DefensivePlayer.py
Billy Cussen
26/10/2020
"""
import FootballPlayer

class myDefensivePlayer(FootballPlayer.myFootballPlayer):
    def __init__(self, name):
        super().__init__(name)

    def getRole(self):
        return "Hi "+str(self.name)+", I'm a Defensive Player"