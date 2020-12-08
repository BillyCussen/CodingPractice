"""
DLL.py
Billy Cussen
07/12/2020
"""

from DLNode import DLNode

class DLL:
    def __init__(self):
        self.first = None
        self.last = None


    def add(self, element):
        if(self.isEmpty()):
            self.first = DLNode(element, None, None)
            self.last = self.first
        else:
            current = self.first
            while current.successor != None:
                current = current.successor
            current.successor = DLNode(element, current, None)
            self.last = current.successor

    def addByIndex(self, element, index):
        if self.isEmpty():
            raise Exception("Can't add by Index, DLL is Empty!")
        elif index > self.size() or index < 0:
            raise Exception("Index is out of Bounds!")
        elif index == self.size():
            self.add(element)
        elif index == 0:
            self.first = DLNode(element, None, self.first)
            self.first.successor.previous = self.first
            self.first.previous = None
        else:
            current = self.first
            for i in range(index-1):
                current = current.successor
            leftNode = current
            rightNode = current.successor
            newNode = DLNode(element,None,None)
            newNode.previous = leftNode
            leftNode.successor = newNode
            rightNode.previous = newNode
            newNode.successor = rightNode
            

    def addBefore(self, element, target):
        index = self.getIndex(target)
        if self.isEmpty() or index==-1:
            raise Exception("Can't add before "+str(target)+", DLL is Empty!")
        else:
            self.addByIndex(element,index)

    def addAfter(self, element, target):
        index = self.getIndex(target)+1
        if self.isEmpty() or index==-1:
            raise Exception("Can't add before "+str(target)+", DLL is Empty!")
        else:
            self.addByIndex(element,index)

    def getIndex(self, element):
        if self.isEmpty():
            raise Exception("Can't get index of "+str(element)+", DLL is Empty!")
        index = 0
        current = self.first
        while current != None:
            if(current.element == element):
                return index
            index+=1
            current = current.successor
        return -1

    def isEmpty(self):
        return self.first == None

    def removeByElement(self, target):
        if(self.isEmpty()):
            raise Exception("Unable to remove "+str(target)+", DLL is Empty!")
        index = self.getIndex(target)
        return self.removeByIndex(index)

    def removeByIndex(self, index):
        if(self.isEmpty()):
            raise Exception("Unable to remove element at Index "+str(index)+", DLL is Empty!")
        elif index < 0 or index >= self.size():
            raise Exception("Unable to remove element at index "+str(index)+", Index is out of bounds")
        elif index == 0:
            element = self.first.element
            self.first = self.first.successor
            self.first.previous = None
            if(self.isEmpty()):
                self.last = None
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

    def toString(self):
        if self.isEmpty():
            raise Exception("Can't Traverse DLL, its Empty!")
        result = "***DLL Traversal***\n"
        position = 0
        return self.toStringHelper(result, position, self.first)

    def toStringHelper(self, result, position, current):
        if current == None:
            result += "***END***"
            return result
        else:
            result+="Position "+str(position)+", Element: "+str(current.element)+"\n"
            position+=1
            return self.toStringHelper(result,position,current.successor)

    def toStringBackwards(self):
        if self.isEmpty():
            raise Exception("Can't do backwards DLL Traversal, its Empty!")
        result = "***DLL Traversal***\n"
        position = self.size()-1
        return self.toStringBackwardsHelper(result, position, self.last)

    def toStringBackwardsHelper(self, result, position, current):
        if current == None:
            result += "***END***"
            return result
        else:
            result+="Position "+str(position)+", Element: "+str(current.element)+"\n"
            position-=1
            return self.toStringBackwardsHelper(result,position,current.previous)

    def size(self):
        if(self.isEmpty()):
            raise Exception("Can't get Size, DLL is Empty!")
        return self.sizeHelper(self.first)

    def sizeHelper(self, current):
        if(current == None):
            return 0
        return 1 + self.sizeHelper(current.successor)