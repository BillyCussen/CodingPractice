"""
DoublyLinkedList.py
Billy Cussen
24/11/2020
"""
from DLNode import DLNode

class DoublyLinkedList:
    def __init__(self):
        self.first = None
        self.last = None

    def addByElement(self,elem):
        if self.isEmpty():
            self.first = DLNode(elem,None,None)
            self.last = self.first
        else:
            curr = self.first
            while curr.succ != None:
                curr = curr.succ
            curr.succ = DLNode(elem,curr,None)
            curr.succ.prev = curr
            self.last = curr.succ
            

    def addByIndex(self, elem, index):
        if index < 0 or index > self.size():
            raise Exception("Can't add Element, Index is Invalid!")
        elif self.isEmpty():
            raise Exception("Can't Add By Index, List is Empty!")
        elif index == self.size():
            self.addByElement(elem)
        elif index == 0:
            self.first = DLNode(elem,None,self.first)
            self.first.succ.prev = self.first
        else:
            curr = self.first
            for i in range(index-1):
                curr = curr.succ
            leftNode = curr
            rightNode = curr.succ
            newNode = DLNode(elem,None,None)
            newNode.prev = leftNode
            leftNode.succ = newNode
            newNode.succ = rightNode
            rightNode.prev = newNode

    def addAfter(self, elem, target):
        index = self.getIndex(target)
        self.addByIndex(elem,index+1)

    def addBefore(self, elem, target):
        index = self.getIndex(target)
        self.addByIndex(elem,index)

    def getIndex(self, target):
        if self.isEmpty():
            raise Exception("Can't get Index, List is Empty!")
        else:
            curr = self.first
            index = 0
            while(curr != None):
                if curr.elem == target:
                    return index
                index+=1
                curr = curr.succ
            return -1


    def size(self):
        if self.isEmpty():
            raise Exception("Can't get Size, DLL is Empty!")
        return self.sizeHelper(self.first)

    def sizeHelper(self,curr):
        if curr == None:
            return 0
        return 1 + self.sizeHelper(curr.succ)

    def isEmpty(self):
        return self.first == None

    def removeByElement(self,target):
        index = self.getIndex(target)
        if index == -1:
            raise Exception("Can't remove element, it does not exist in the List!")
        else:
            return self.removeByIndex(index)

    def removeByIndex(self,index):
        if index >= self.size() or index < 0:
            raise Exception("Can't remove Element, index is Invalid")
        elif self.isEmpty():
            raise Exception("Can't remove Element, List is Empty!")
        elif index == 0:
            elem = self.first.elem
            self.first = self.first.succ
            if self.isEmpty():
                self.last = None
            else:
                self.first.prev = None
            return elem
        else:
            curr = self.first
            for i in range(index-1):
                curr = curr.succ
            elem = curr.succ.elem
            curr.succ = curr.succ.succ
            if curr.succ == None:
                self.last = curr
            else:
                curr.succ.prev = curr
            return elem

    def toString(self):
        if self.isEmpty():
            raise Exception("Can't traverse, DLL is Empty!")
        result = "***DOUBLY LINKED LIST TRAVERSAL***\n"
        return self.toStringHelper(self.first,result,0)

    def toStringHelper(self, curr, result, position):
        if curr == None:
            result+="***END***\n"
            return result
        result+="Position "+str(position)+", Element: "+str(curr.elem)+"\n"
        position+=1
        return self.toStringHelper(curr.succ,result,position)

    def toStringBackwards(self):
        if self.isEmpty():
            raise Exception("Can't do backwards traversal, DLL is Empty!")
        result = "***DOUBLY LINKED LIST BACKWARDS TRAVERSAL***\n"
        return self.toStringBackwardsHelper(self.last,result,self.size()-1)

    def toStringBackwardsHelper(self, curr, result, position):
        if curr == None:
            result+="***END***\n"
            return result
        result+="Position "+str(position)+", Element: "+str(curr.elem)+"\n"
        position-=1
        return self.toStringBackwardsHelper(curr.prev,result,position)