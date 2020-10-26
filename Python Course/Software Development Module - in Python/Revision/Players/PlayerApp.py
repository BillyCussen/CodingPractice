"""
PlayerApp.py
Billy Cussen
26/10/2020
"""
#Object
import FootballPlayer
from FootballPlayer import myFootballPlayer
import FullBackPlayer
from FullBackPlayer import myFullBackPlayer
import DefensivePlayer
from DefensivePlayer import myDefensivePlayer
import FullForwardPlayer
from FullForwardPlayer import myFullForwardPlayer


myFootballPlayerApp = myDefensivePlayer("Billy")
print (myFootballPlayerApp.getRole())
myFootballPlayerApp = myFullBackPlayer("Billy")
print (myFootballPlayerApp.getRole())

