'''
Created on 14 oct 2022

@author: anaat
'''
#8. Design a program that asks for a set of numbers. After inputting each number, the
#program should ask “Do you want to enter more numbers (Y/N)?”. If the answer is “Y”
#the program asks for other numbers. When the user finishes to enter all the numbers,
#the program should say which one is the smallest. The messages are the following:
#“Enter one number:”
#“Do you want to enter more number (Y/N)?”
#“The smallest number is XX”

num1 = int(input("Enter one number: "))
question= input ("Do you want to enter more numbers Y/N?: ")
num2=num1

while question == "y":
    num2 = int(input("Enter other number: "))
    question= input ("Do you want to enter more numbers Y/N?: ")
    if num2<num1:
        num1=num2      
    if question == "n":
        print (f"The smallet number is {num1}")  
          
            
            
        
            
            
            
        
        
    

    