"""
Queue.py
Billy Cussen
13/11/2020
"""
from Node import Node

class Queue:
    def __init__(self):
        self.first = None
        self.last = None

    def enQueue(self, elem):
        oldLast = self.last
        self.last = Node(elem, None)
        if self.isEmpty():
            self.first = self.last
        else:
            oldLast.next = self.last

    def deQueue(self):
        if self.isEmpty():
            raise Exception("The Queue is empty, can't deQueue!")
        else:
            elem = self.first.element
            self.first = self.first.next
            return elem

    def peek(self):
        if self.isEmpty():
            raise Exception("The Queue is empty, can't Peek!")
        else:
            return self.first.element

    def isEmpty(self):
        return self.first==None

    def getSize(self):
        return self.getSizeHelper(self.first)

    def getSizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.getSizeHelper(current.next)

    def toString(self):
        if self.isEmpty():
            raise Exception("The Queue is Empty, can't Traverse!")
        result, position = "***QUEUE TRAVERSAL***\n", 0
        return self.toStringHelper(self.first,result,position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result += "***END***\n"
            return result
        result+="Position "+str(position)+", Element: "+str(current.element)+"\n"
        position+=1
        return self.toStringHelper(current.next,result,position)