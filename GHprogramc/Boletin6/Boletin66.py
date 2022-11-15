'''
Created on 9 oct 2022

@author: anaat
'''
#6. Design a program that reads two integer numbers, for example numberA and
#numberB, and calculates the product of both numbers without use multiplication, but
#using the sum. The messages are the following:
#“Enter one number:”
#“The product is XX”

numA= int (input ("Enter one number: "))
numB = int (input ("Enter one number: "))

producto=0

for i in range (numB):
    producto+=numA
    
print (f"The product is {producto}")    

#-----------CON BUCLE WHILE--------------------------#
contador = 0
producto = 0

while contador < numB:
    producto+=numA 
    contador=contador+1 
    
print (f"The product is {producto}")    

