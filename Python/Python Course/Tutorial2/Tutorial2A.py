""" 
Tutorial2A.py
Billy Cussen
22/09/2020
""" 

#Working with Operators

print("Enter a Number")
num1 = int(input())
print("Enter another Number")
num2 = int(input())

operation = ""

while operation != "add" and operation!="subtract" and operation != "multiply" and operation != "divide":
    print("What do you want to do with them?")
    operation = input()

if operation == "add":
    print(str(num1) + " + "+str(num2)+" = "+str(num2+num1))
elif operation == "subtract":
    print(str(num1) + " - "+str(num2)+" = "+str(num1+num2))
elif operation == "multiply":
    print(str(num1) + " x "+str(num2)+" = "+str(num1+num2))
else:
    print(str(num1) + " / "+str(num2)+" = "+str(num1+num2))