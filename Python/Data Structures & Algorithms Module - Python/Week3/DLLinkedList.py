"""
DLLinkedList.py
Billy Cussen
11/11/2020
"""
from DLNode import DLNode

class DLLinkedList:

    def __init__(self):
        self.first = None
        self.last = None

    def add(self,element):
        if self.isEmpty():
            self.first = DLNode(element,None,None)
            self.last = self.first
        else:
            current = self.first
            while current.successor != None:
                current = current.successor
            current.successor = DLNode(element,current,None)
            self.last = current.successor
            current.successor.previous = current


    def addByIndex(self,element,index):
        if self.isEmpty() or index == self.size():
            self.add(element)
        elif index == 0:
            self.first = DLNode(element,None,self.first)
            self.first.successor.previous = self.first
        else:
            current = self.first
            for i in range(index-1):
                current = current.successor
            leftNode = current
            rightNode = current.successor
            newNode = DLNode(element, None,None)
            newNode.previous = leftNode
            leftNode.successor = newNode
            newNode.successor = rightNode
            rightNode.previous = newNode

    def addBefore(self,element,target):
        self.addByIndex(element, self.getIndex(target))

    def addAfter(self,element,target):
        self.addByIndex(element, self.getIndex(target)+1)

    def getIndex(self, target):
        current = self.first
        index = 0
        while current != None:
            if current.element == target:
                return index
            index+=1
            current = current.successor
        return -1

    def removeByElement(self,target):
        return self.removeByIndex(self.getIndex(target))

    def removeByIndex(self,index):
        if self.isEmpty() or index < 0 or index >= self.size():
            raise Exception("Out of Bounds - REMOVE")
        elif index == 0:
            element = self.first.element
            self.first = self.first.successor
            if self.first == None:
                self.last = None
            else:
                self.first.previous = None
            return element
        else:
            current = self.first
            for i in range(index-1):
                current = current.successor
            element = current.successor.element
            current.successor = current.successor.successor
            if current.successor == None:
                self.last = current
            else:
                current.successor.previous = current
            return element

    def size(self):
        return self.sizeHelper(self.first)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.successor)

    def isEmpty(self):
        return self.first == None

    def toString(self):
        if self.isEmpty():
            return "List is empty, can't do a Traversal!"
        position = 0
        result = "***DOUBLY LINKED LIST TRAVERSAL***\n"
        return self.toStringHelper(self.first,result,position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result += "***END***"
            return result
        result += "Position "+str(position)+", Element: "+str(current.element)+"\n"
        position+= 1
        return self.toStringHelper(current.successor, result, position)

    def toStringBackwards(self):
        if self.isEmpty():
            return "List is empty, can't do a Backwards Traversal!"
        position = self.size() -1
        result = "***DOUBLY LINKED LIST BACKWARDS TRAVERSAL***\n"
        return self.toStringBackwardsHelper(self.last,result,position)

    def toStringBackwardsHelper(self, current, result, position):
        if current == None:
            result += "***END***"
            return result
        result += "Position "+str(position)+", Element: "+str(current.element)+"\n"
        position-= 1
        return self.toStringBackwardsHelper(current.previous, result, position)
