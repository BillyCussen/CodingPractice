"""
LinearSearch.py
Billy Cussen
09/02/2021
"""

def linearSearch(list, key):
    for i in range(len(list)):
        if list[i] == key:
            return True
    return False
        
def linearSearch2(list, key):
    for i in list:
        if (i > key)-(i < key)==0:
            return True
    return False

myList = [10,100,999,2,40,3,5]
myList1 = ["Hello", "Goodbye", "How are you?"]

print(str(linearSearch(myList, 5)))
print(str(linearSearch(myList, 200)))
print(str(linearSearch2(myList1, "Hello")))
print(str(linearSearch2(myList1, "Guten Tag")))