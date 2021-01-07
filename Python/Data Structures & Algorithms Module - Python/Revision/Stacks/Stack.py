"""
Stack.py
Billy Cussen
07/01/2021
"""
from Node import Node

class Stack:

    def __init__(self):
        self.first = None

    def isEmpty(self):
        return self.first == None

    def size(self):
        if self.isEmpty():
            return 0
        return self.sizeHelper(self.first)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.next)

    def toString(self):
        if self.isEmpty():
            raise Exception("Cannot print Stack, it is empty!")
        else:
            result = "***STACK TRAVERSAL***\n"
            position = 1
            return self.toStringHelper(self.first, result, position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result += "***END***"
            return result
        result+= "Position "+str(position)+", Element: "+str(current.element)+"\n"
        position = position + 1
        return self.toStringHelper(current.next, result, position)

    def peek(self):
        if self.isEmpty():
            raise Exception("Unable to peek, Stack is Empty!")
        return self.first.element

    def push(self, element):
        if self.isEmpty():
            self.first = Node(element, None)
        else:
            self.first = Node(element, self.first)

    def pop(self):
        if self.isEmpty():
            raise Exception("Unable to Pop, Stack is Empty!")
        else:
            element = self.first.element
            self.first = self.first.next
            return element