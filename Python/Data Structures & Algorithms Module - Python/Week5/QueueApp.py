"""
QueueApp.py
Billy Cussen
13/11/2020
"""
from Queue import Queue

myQueueApp = Queue()

try:
    print("Empty: "+str(myQueueApp.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myQueueApp.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myQueueApp.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("DeQueue: "+str(myQueueApp.deQueue()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myQueueApp.toString())
                except Exception as e:
                    print(e)

myQueueApp.enQueue(2)
myQueueApp.enQueue(4)
myQueueApp.enQueue(6)
myQueueApp.enQueue(8)
myQueueApp.enQueue(10)
myQueueApp.enQueue(12)

try:
    print("Empty: "+str(myQueueApp.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myQueueApp.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myQueueApp.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("DeQueue: "+str(myQueueApp.deQueue()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myQueueApp.toString())
                except Exception as e:
                    print(e)
                        
while myQueueApp.isEmpty() == False:
    print("DeQueue: "+str(myQueueApp.deQueue()))

try:
    print("Empty: "+str(myQueueApp.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myQueueApp.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myQueueApp.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("DeQueue: "+str(myQueueApp.deQueue()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myQueueApp.toString())
                except Exception as e:
                    print(e)
                finally:
                    myQueueApp = None