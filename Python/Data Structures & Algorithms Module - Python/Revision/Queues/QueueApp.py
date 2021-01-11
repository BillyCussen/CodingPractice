"""
QueueApp.py
Billy Cussen
11/01/2021
"""

from Queue import Queue

myQueue = Queue()

print("Is Empty: "+str(myQueue.isEmpty()))

try:
    print("Size: "+str(myQueue.size()))
except Exception as e:
    print(e)

print(myQueue.toString())

myQueue.enQueue(2)
myQueue.enQueue(4)
myQueue.enQueue(6)
myQueue.enQueue(8)
myQueue.enQueue(10)

print("Is Empty: "+str(myQueue.isEmpty()))
print("Size: "+str(myQueue.size()))
print(myQueue.toString())

myQueue.deQueue()
myQueue.deQueue()
myQueue.deQueue()

print("Is Empty: "+str(myQueue.isEmpty()))
print("Size: "+str(myQueue.size()))
print(myQueue.toString())