'''
Created on 11 oct 2022

@author: anaat
'''
"""9. Design a program that reads an integer positive number greater than 0 and says if
it’s a “perfect number”. A number is perfect if it is equal to the sum of all its divisors.
The messages are the following:
“Enter an integer positive number greater than 0:”
“The number is not valid, try again.”
“The number is perfect.”
“The number is not perfect.”
"""

num = int(input ("Enter an interger positive number greater than 0: "))
suma=0

for i in range (1, num):
    if num%i==0:
        suma+=i
        print (i)
print (suma)       
        
if suma == num:
    print (f"The number {num} is perfect")   
elif num <0:
    print (f"The number {num} is not valid, try again: ")
else:
    print (f"The number {num} is not perfect")
        
        
       
        