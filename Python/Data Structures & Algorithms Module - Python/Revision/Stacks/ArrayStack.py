"""
ArrayStack.py
Billy Cussen
07/01/2021
"""
    
class ArrayStack:

    def __init__(self):
        self.top = -1
        self.size = 2
        self.stack = []

    def isEmpty(self):
        return self.top == -1

    def getSize(self):
        if self.isEmpty():
            return 0
        return self.sizeHelper(self.top)

    def sizeHelper(self, index):
        if index == -1:
            return 0
        return 1 + self.sizeHelper(index-1)

    def toString(self):
        if self.isEmpty():
            raise Exception("Can't print, Stack is Empty!")
        result = "***ARRAY STACK TRAVERSAL***\n"
        index = self.getSize()-1
        position = 1
        return self.toStringHelper(self.stack, result, index, position)

    def toStringHelper(self, current, result, index, position):
        if index == -1:
            result+= "***END***\n"
            return result
        result+="Position "+str(position)+", Element: "+str(current[index])+"\n"
        position = position + 1
        index = index - 1
        return self.toStringHelper(current, result, index, position)

    def push(self, element):
        self.top = self.top + 1
        print(str(self.top))
        self.stack.insert(self.top,element)

    def pop(self):
        if self.isEmpty():
            raise Exception("Unable to Pop, Stack is Empty!")
        element = self.stack[self.top]
        self.top = self.top-1
        return element

    def peek(self):
        if self.isEmpty():
            raise Exception("Unable to Peek, Stack is Empty!")
        return self.stack[self.top]
            
