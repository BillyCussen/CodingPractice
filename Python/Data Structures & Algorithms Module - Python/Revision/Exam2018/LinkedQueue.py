"""
LinkedQueue.py
Billy Cussen
09/03/2021
"""

"""
Write a Node/ Link based Java class, called LinkedQueue<T>, which implements the Queue<T>
interface, which contains the following methods (comment the methods to denote the purpose).
 enqueue
 dequeue
 size
 frontElement
 isEmpty
"""

class Node:

    def __init__(self, element, next):
        self.element = element
        self.next = next

class LinkedQueue(Node):

    def __init__(self):
        self.first = None
        self.last = None

    def enQueue(self, element):
        oldLast = self.last
        self.last = Node(element, None)
        if(self.isEmpty()):
            self.first = self.last
        else:
            oldLast.next = self.last


    def deQueue(self):
        if(self.isEmpty()):
            return False
        else:
            element = self.last.element
            if(self.last == self.first):
                self.first = None
            else:
                self.first = self.first.next
            return True

    def isEmpty(self):
        return self.first == None

    def size(self):
        if(self.isEmpty()):
            return 0
        else:
            return self.sizeHelper(self.first)

    def sizeHelper(self, current):
        if(current == None):
            return 0
        return 1 + self.sizeHelper(current.next)

    def toString(self):
        if(self.isEmpty()):
            return "Can't set to String, Queue is Empty!"
        result = "***LINKED QUEUE TRAVERSAL***\n"
        result = self.toStringHelper(self.first, result, 1)
        result += "***END***\n"
        return result

    def toStringHelper(self, current, result, position):
        if current == None:
            return result
        result += "Position "+str(position)+", Element: "+str(current.element)+"\n"
        position = position + 1
        return self.toStringHelper(current.next, result, position)

    def frontElement(self):
        if self.isEmpty():
            return "Can't peek, queue is Empty!"
        return self.first.element

myQueue = LinkedQueue()

print("Is Empty: "+str(myQueue.isEmpty()))
print("Size: "+str(myQueue.size()))
print(myQueue.toString())

myQueue.enQueue(5)
myQueue.enQueue(4)
myQueue.enQueue(3)
myQueue.enQueue(2)
myQueue.enQueue(1)

print("Is Empty: "+str(myQueue.isEmpty()))
print("Size: "+str(myQueue.size()))
print(myQueue.toString())


print("Dequeue: "+str(myQueue.deQueue()))

print(myQueue.toString())

print("Dequeue "+str(myQueue.frontElement())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.frontElement())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.frontElement())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.frontElement())+": "+str(myQueue.deQueue()))
print("Dequeue "+str(myQueue.frontElement())+": "+str(myQueue.deQueue()))
print(myQueue.toString())