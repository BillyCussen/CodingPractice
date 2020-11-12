"""
LinkedStack.py
Billy Cussen
12/11/2020
"""

from Node import Node

class LinkedStack:

    def __init__(self):
        self.first = None

    def isEmpty(self):
        return self.first == None

    def push(self, elem):
        if self.isEmpty():
            self.first = Node(elem, None)
        else:
            self.first = Node(elem, self.first)

    def pop(self):
        if self.isEmpty():
            raise Exception("Can't pop, the Stack is Empty!")
        elem = self.first.element
        self.first = self.first.next
        return elem

    def peek(self):
        if self.isEmpty():
            raise Exception("Can't peek, the Stack is Empty!")
        return self.first.element

    def mySize(self):
        return self.mySizeHelper(self.first)

    def mySizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.mySizeHelper(current.next)

    def toString(self):
        if self.isEmpty():
            raise Exception("Can't traverse, the Stack is Empty!")
        result = "***LINKED STRING TRAVERSAL***\n"
        position = 0
        return self.toStringHelper(self.first,result,position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result+="***END***\n"
            return result
        result+="Position "+str(position)+", Element: "+str(current.element)+"\n"
        position+=1
        return self.toStringHelper(current.next,result,position)
        