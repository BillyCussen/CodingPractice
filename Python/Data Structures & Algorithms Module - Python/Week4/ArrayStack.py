"""
ArrayStack.py
Billy Cussen
12/11/2020
"""
from Node import Node

class ArrayStack:

    def __init__(self):
        self.top = -1
        self.size = 2
        self.stack = []

    def isEmpty(self):
        return self.top == -1

    def push(self, elem):
        if self.top == self.size - 1:
            self.reallocate()
        self.top+=1
        self.stack.insert(0,elem)

    def reallocate(self):
        self.size*=2

    def pop(self):
        if self.isEmpty():
            raise Exception("Stack is Empty, cannot pop!")
        else:
            self.top-=1
            return self.stack[0]

    def peek(self):
        if self.isEmpty():
            raise Exception("Stack is Empty, cannot peek!")
        else:
            return self.stack[0]

    def mySize(self):
        return self.sizeHelper(self.stack, self.top)

    def sizeHelper(self, current, index):
        if(index==-1):
            return 0
        index-=1
        return 1 + self.sizeHelper(self.stack, index)

    def toString(self):
        if self.isEmpty():
            raise Exception("Can't traverse, Stack is Empty!")
        result = "***ARRAY STACK TRAVERSAL\n"
        position = 0
        index = self.mySize()-1
        return self.toStringHelper(self.stack, result, position,index)

    def toStringHelper(self, stack, result, position, index):
        if(index==-1):
            result+="***END***\n"
            return result
        result+="Position "+str(position)+", Element "+str(stack[index])+"\n"
        position += 1
        index -= 1
        return self.toStringHelper(stack, result, position, index)
