"""
LinearSearch2.py
Billy Cussen
16/12/2020
"""

def linearSearch2(myArray, key):
    for i in range(len(myArray)):
        if myArray[i] == key:
            return True
    return False


myArr = [1,2,3,4,5,6,7,8,9,10]

print("Does Array Contain 2: "+str(linearSearch2(myArr, 2)))
print("Does Array Contain 4: "+str(linearSearch2(myArr, 4)))
print("Does Array Contain 6: "+str(linearSearch2(myArr, 6)))
print("Does Array Contain 8: "+str(linearSearch2(myArr, 8)))
print("Does Array Contain 10: "+str(linearSearch2(myArr, 10)))
print("Does Array Contain 12: "+str(linearSearch2(myArr, 12)))
print("Does Array Contain 14: "+str(linearSearch2(myArr, 14)))
    