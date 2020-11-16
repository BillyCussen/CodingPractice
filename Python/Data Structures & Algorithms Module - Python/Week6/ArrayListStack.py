"""
myArrayStack.py
Billy Cussen
16/11/2020
"""

class ArrayListStack:
    def __init__(self):
        self.myArrayList = []

    def getSize(self):
        return len(self.myArrayList)

    def isEmpty(self):
        return self.getSize() == 0

    def toString(self):
        if self.isEmpty():
            raise Exception("This Stack is Empty, can't traverse!")
        position = 0
        index = self.getSize()-1
        result = "***ARRAY STACK TRAVERSAL***\n"
        return self.toStringHelper(self.myArrayList,result,position, index)

    def toStringHelper(self, curr, result, position, index):
        if index == -1:
            result+="***END***\n"
            return result
        result += "Position "+str(position)+", Element "+str(curr[position])+"\n"
        position+=1
        index-=1
        return self.toStringHelper(curr,result,position, index)

    def push(self,elem):
        if self.isEmpty():
            self.myArrayList.append(elem)
        else:
            self.myArrayList.insert(0,elem)

    def pop(self):
        if self.isEmpty():
            raise Exception("This Stack is Empty, can't pop!")
        else:
            elem = self.myArrayList[0]
            self.myArrayList.pop(0)
            return elem

    def peek(self):
        if self.isEmpty():
            raise Exception("This Stack is Empty, can't peek!")
        else:
            return self.myArrayList[0]

myArrayStack = ArrayListStack()

try:
    print("Is Empty: "+str(myArrayStack.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myArrayStack.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myArrayStack.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("Pop: "+str(myArrayStack.pop()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myArrayStack.toString())
                except Exception as e:
                    print(str(e)+"\n")

myArrayStack.push(2)
myArrayStack.push(4)
myArrayStack.push(6)
myArrayStack.push(8)
myArrayStack.push(10)
myArrayStack.push(12)

try:
    print("Is Empty: "+str(myArrayStack.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myArrayStack.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myArrayStack.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("Pop: "+str(myArrayStack.pop()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myArrayStack.toString())
                except Exception as e:
                    print(e)

while myArrayStack.isEmpty() == False:
    print("Pop: "+str(myArrayStack.pop()))

try:
    print("Is Empty: "+str(myArrayStack.isEmpty()))
except Exception as e:
    print(e)
finally:
    try:
        print("Size: "+str(myArrayStack.getSize()))
    except Exception as e:
        print(e)
    finally:
        try:
            print("Peek: "+str(myArrayStack.peek()))
        except Exception as e:
            print(e)
        finally:
            try:
                print("Pop: "+str(myArrayStack.pop()))
            except Exception as e:
                print(e)
            finally:
                try:
                    print(myArrayStack.toString())
                except Exception as e:
                    print(e)