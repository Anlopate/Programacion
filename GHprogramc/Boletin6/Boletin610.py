'''
Created on 14 oct 2022

@author: anaat
'''
#10. Design a program that reads an integer positive number and says the “factorial” of
#the number. To calculate the factorial you should know that
#FACT(0)= 1
#FACT(1) =1
#FACT(N)= N*(N-1)*(N-2)*....1
#The messages are the following:
#“Enter an integer positive number:”
#“The number is not valid, try again.”
#“The factorial is X

num = int(input ("Enter an integer positive number: "))
fact=1

for i in range (0, num):
    fact=fact*num
    print (fact)
    
print (f"The factorial de {num} is {fact}")    


    
    


