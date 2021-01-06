"""
DLinkedList.py
Billy Cussen
06/01/2021
"""
from DLNode import DLNode

class DLinkedList:
    def __init__(self):
        self.first = None
        self.last = None

    def isEmpty(self):
        return self.first == None

    def size(self):
        if self.isEmpty():
            return 0
        return self.sizeHelper(self.first)

    def sizeHelper(self, current):
        if current == None:
            return 0
        return 1 + self.sizeHelper(current.successor)

    def toString(self):
        if self.isEmpty():
            return "DLL is Empty!"
        result = "***DLL Traversal***\n"
        position = 1
        return self.toStringHelper(self.first, result, position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result+="***END***\n"
            return result
        result+="Position "+str(position)+", Element: "+str(current.element)+"\n"
        position = position + 1
        return self.toStringHelper(current.successor, result, position)

    def toStringBackwards(self):
        if self.isEmpty():
            return "DLL is Empty!"
        result = "***DLL Backwards Traversal***\n"
        position = self.size()
        return self.toStringBackwardsHelper(self.last, result, position)

    def toStringBackwardsHelper(self, current, result, position):
        if current == None:
            result+="***END***\n"
            return result
        result+="Position "+str(position)+", Element: "+str(current.element)+"\n"
        position = position - 1
        return self.toStringBackwardsHelper(current.previous, result, position)

    def add(self, element):
        if self.isEmpty():
            self.first = DLNode(element, None, None)
            self.last = self.first
        else:
            current = self.first
            while current.successor != None:
                current = current.successor
            current.successor = DLNode(element, current, None)
            self.last = current.successor
            current.successor.previous = current
    
    def addByIndex(self, element, index):
        if self.isEmpty():
            raise Exception("Unable to add by Index, DLL is Empty!")
        elif index == 0:
            self.first = DLNode(element, None, self.first)
            self.first.successor.previous = self.first
        elif index == self.size():
            self.add(element)
        else:
            current = self.first
            for i in range(index-1):
                current = current.successor
            leftNode = current
            rightNode = current.successor
            newNode = DLNode(element, None, None)
            newNode.previous = leftNode
            leftNode.successor = newNode
            newNode.successor = rightNode
            rightNode.previous = newNode

    def removeByElement(self, element):
        index = self.getIndex(element)
        return self.removeByIndex(index)

    def removeByIndex(self, index):
        if self.isEmpty():
            raise Exception("Can't remove, the DLL is Empty!")
        elif index < 0 or index > self.size():
            raise Exception("Can't remove, index is out of Bounds!")
        elif index == 0:
            element = self.first.element
            self.first = self.first.successor
            self.first.previous = None
            if self.first == None:
                self.last = None
        else:
            curr = self.first
            for i in range(index-1):
                curr = curr.successor
            elem = curr.successor.element
            curr.successor = curr.successor.successor
            if curr.successor == None:
                self.last = curr
            else:
                curr.successor.previous = curr
            return elem

    def getIndex(self, element):
        current = self.first
        index = 0
        while(current!=None):
            if current.element == element:
                return index
            index = index+1
            current = current.successor
        return -1