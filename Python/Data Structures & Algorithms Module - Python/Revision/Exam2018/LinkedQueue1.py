"""
LinkedQueue1.py
Billy Cussen
16/03/2021
"""

class Node1:

    def __init__(self, element, next):
        self.element = element
        self.next = next

class LinkedQueue1(Node1):

    def __init__(self):
        self.first = None
        self.last = None

    def isEmpty(self):
        return self.first == None

    def size(self):
        if self.isEmpty():
            return 0
        return self.getSize(self.first)

    def getSize(self, current):
        if(current == None):
            return 0
        return 1 + self.getSize(current.next)

    def peek(self):
        if self.isEmpty():
            return None
        return self.first.element

    def enQueue(self, element):
        oldLast = self.last
        self.last = Node1(element, None)
        if(self.isEmpty()):
            self.first = self.last
        else:
            oldLast.next = self.last

    def deQueue(self):
        if self.isEmpty():
            return False
        else:
            self.first = self.first.next
            if(self.first==None):
                self.last = None
            return True

    def toString(self):
        if self.isEmpty():
            return "Can't do Queue Traversal, it is empty!"
        result = "***LINKED QUEUE TRAVERSAL***\n"
        position = 1
        return self.toStringHelper(self.first, result, position)

    def toStringHelper(self, current, result, position):
        if current == None:
            result+="***END***\n"
            return result
        result+="Element: "+str(current.element)+", Position: "+str(position)+"\n"
        position = position + 1
        return self.toStringHelper(current.next, result, position)

myQueue = LinkedQueue1()

print("Size: "+str(myQueue.size()))
print("Is Empty: "+str(myQueue.isEmpty()))
print("Dequeue "+str(myQueue.peek())+": "+str(myQueue.deQueue()))
print(myQueue.toString())

myQueue.enQueue(10)
myQueue.enQueue(20)
myQueue.enQueue(30)
myQueue.enQueue(40)
myQueue.enQueue(50)

print("Size: "+str(myQueue.size()))
print("Is Empty: "+str(myQueue.isEmpty()))
print("Dequeue "+str(myQueue.peek())+": "+str(myQueue.deQueue()))
print(myQueue.toString())

print("Dequeue "+str(myQueue.peek())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.peek())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.peek())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.peek())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.peek())+": "+str(myQueue.deQueue()))

print("Size: "+str(myQueue.size()))
print("Is Empty: "+str(myQueue.isEmpty()))
print(myQueue.toString())