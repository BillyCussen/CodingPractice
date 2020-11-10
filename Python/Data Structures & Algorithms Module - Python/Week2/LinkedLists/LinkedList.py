"""
LinkedList.py
Billy Cussen
10/11/2020
"""
from Node import Node

class LinkedList:

    def __init__(self):
        self.first = None

    def add(self, element):
        if self.isEmpty():
            self.first = Node(element,None)
        else:
            current = self.first
            while current.next != None:
                current = current.next
            current.next = Node(element,None)

    def addByIndex(self, element, index):
        if self.isEmpty():
            self.add(element)
        elif index < 0 or index > self.size():
            raise Exception("ADD BY INDEX: Null Pointer")
        elif index == 0:
            self.first = Node(element,self.first)
        else:
            current = self.first
            for i in range(index-1):
                current = current.next
            current.next = Node(element, current.next)

    def addBefore(self,element, target):
        index = self.getIndex(target)
        self.addByIndex(element,index)

    def addAfter(self,element, target):
        index = self.getIndex(target)
        self.addByIndex(element,index+1)

    def getIndex(self, target):
        current = self.first
        index = 0
        while current != None:
            if(current.element == target):
                return index
            index+=1
            current = current.next
        return -1

    def removeByElement(self, target):
        index = self.getIndex(target)
        return self.removeByIndex(index)

    def removeByIndex(self, index):
        if self.isEmpty() or index < 0 or index > self.size():
            raise Exception("REMOVE BY INDEX: Null Pointer")
        elif index == 0:
            elem = self.first.element
            self.first = self.first.next
            return elem
        else:
            current = self.first
            for i in range(index-1):
                current = current.next
            elem = current.next.element
            current.next = current.next.next
            return elem


    def isEmpty(self):
        return self.first == None

    def size(self):
        return self.sizeHelper(self.first)

    def sizeHelper(self,current):
        if(current == None):
            return 0
        return 1 + self.sizeHelper(current.next)

    def toString(self):
        if self.isEmpty():
            return "The List is Empty!"
        position = 0
        result = "***LINKEDLIST TRAVERSAL***\n"
        return self.toStringHelper(self.first,result,position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result += "***END***"
            return result
        result += "Position "+str(position)+", Element: "+str(current.element)+"\n"
        position+=1
        return self.toStringHelper(current.next,result,position)