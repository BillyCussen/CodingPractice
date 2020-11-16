"""
LinkedStack.py
Billy Cussen
16/11/2020
"""

class Node:
    def __init__(self, element, next):
        self.element = element
        self.next = next

class LinkedStack:
    def __init__(self):
        self.first = None

    def isEmpty(self):
        return self.first == None

    def getSize(self):
        return self.getSizeHelper(self.first)

    def getSizeHelper(self, curr):
        if curr == None:
            return 0
        return 1 + self.getSizeHelper(curr.next)

    def toString(self):
        if self.isEmpty():
            raise Exception("This Stack is Empty, can't traverse!")
        position = 0
        result = "***LINKED STACK TRAVERSAL***\n"
        return self.toStringHelper(self.first,result,position)

    def toStringHelper(self, curr, result, position):
        if curr == None:
            result+="***END***\n"
            return result
        result += "Position "+str(position)+", Element "+str(curr.element)+"\n"
        position+=1
        return self.toStringHelper(curr.next,result,position)

    def push(self,elem):
        if self.isEmpty():
            self.first = Node(elem, None)
        else:
            self.first = Node(elem, self.first)

    def pop(self):
        if self.isEmpty():
            raise Exception("This Stack is Empty, can't pop!")
        else:
            elem = self.first.element
            self.first = self.first.next
            return elem

    def peek(self):
        if self.isEmpty():
            raise Exception("This Stack is Empty, can't peek!")
        else:
            return self.first.element

myLinkedStack = LinkedStack()

try:
    print("Is Empty: "+str(myLinkedStack.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myLinkedStack.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myLinkedStack.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("Pop: "+str(myLinkedStack.pop()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myLinkedStack.toString())
                except Exception as e:
                    print(str(e)+"\n")

myLinkedStack.push(2)
myLinkedStack.push(4)
myLinkedStack.push(6)
myLinkedStack.push(8)
myLinkedStack.push(10)
myLinkedStack.push(12)

try:
    print("Is Empty: "+str(myLinkedStack.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myLinkedStack.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myLinkedStack.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("Pop: "+str(myLinkedStack.pop()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myLinkedStack.toString())
                except Exception as e:
                    print(e)

while myLinkedStack.isEmpty() == False:
    print("Pop: "+str(myLinkedStack.pop()))

try:
    print("Is Empty: "+str(myLinkedStack.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myLinkedStack.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myLinkedStack.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("Pop: "+str(myLinkedStack.pop()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myLinkedStack.toString())
                except Exception as e:
                    print(e)