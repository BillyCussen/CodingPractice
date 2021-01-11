"""
Queue.py
Billy Cussen
11/01/2021
"""
from Node import Node

class Queue:

    def __init__(self):
        self.first = None
        self.last = None

    def enQueue(self, element):
        oldLast = self.last
        self.last = Node(element, None)
        if self.isEmpty():
            self.first = self.last
        else:
            oldLast.next = self.last

    def deQueue(self):
        if self.isEmpty():
            raise Exception("Can't Dequeue, Queue is Empty!")
        else:
            elem = self.first.element
            self.first = self.first.next
            return elem

    def isEmpty(self):
        return self.first == None

    def size(self):
        if self.isEmpty():
            raise Exception("Can't get Size, Queue is Empty!")
        return self.sizeHelper(self.first)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.next)

    def toString(self):
        if self.isEmpty():
            return "Can't print Queue as it is Empty!"
        else:
            result = "***QUEUE TRAVERSAL***\n"
            position = self.size()-1
            return self.toStringHelper(self.first, result, position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result+= "***END***\n"
            return result
        result += "Position "+str(position)+", Element: "+str(current.element)+"\n"
        position = position - 1
        return self.toStringHelper(current.next, result, position)

