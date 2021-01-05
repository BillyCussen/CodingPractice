"""
LinkedList.py
Billy Cussen
05/01/2021
"""

from Node import Node

class LinkedList:
    def __init__(self):
        self.first = None

    def isEmpty(self):
        return self.first == None

    def size(self):
        if self.isEmpty():
            raise Exception("The LinkedList is Empty, unable to get Size!")
        return self.sizeHelper(self.first)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.next)

    def toString(self):
        if self.isEmpty():
            return "Can't do Traversal, LinkedList is Empty!"
        result = "***LINKEDLIST TRAVERSAL***\n"
        position = 0
        return self.strHelper(self.first, result, position)

    def strHelper(self, current, result, position):
        if current == None:
            result += "***END***\n"
            return result
        position = position + 1
        result+="Position: "+str(position)+", Element: "+str(current.element)+"\n"
        return self.strHelper(current.next,result, position)

    def add(self, element):
        if self.isEmpty():
            self.first = Node(element, None)
        else:
            current = self.first
            while current.next != None:
                current = current.next
            current.next = Node(element, None)

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
            raise Exception ("Can't add by Index "+str(index)+", the LinkedList is Empty!")
        elif index == 0:
            self.first = Node(element, self.first)
        else:
            current = self.first
            for i in range(index-1):
                current = current.next
            current.next = Node(element, current.next)


    def removeByIndex(self, index):
        if self.isEmpty():
            raise Exception("Can't remove element at index "+str(index)+", list is empty!")
        elif index < 0 or index > self.size():
            raise Exception("Can't remove index, its out of bounds!")
        elif index == 0:
            element = self.first.element
            self.first = self.first.next
            return element
        else:
            current = self.first
            for i in range(index-1):
                current = current.next
            elem = current.next.element
            current.next = current.next.next
            return elem