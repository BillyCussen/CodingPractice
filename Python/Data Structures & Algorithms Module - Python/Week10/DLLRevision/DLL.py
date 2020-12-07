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
            

    def isEmpty(self):
        return self.first == None

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