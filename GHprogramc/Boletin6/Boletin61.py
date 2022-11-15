'''
Created on 5 oct 2022

@author: anaat
'''
#1. Design a program to show all numbers between 1 and 100. If the number is a
#multiple of 7 you should show the message "The number xx is a multiple of 7". If the
#number is a multiple of 13 you should show the message "The number xx is a
#multiple of 13". If the number is a multiple of 7 and 13 you should show both
#messages.

for num in range (1,101):
    print (num)   
    if num%7==0 and num%13==0:
        print (f"The number {num} is a multiple of 7")
        print (f"The number {num} is a multiple of 13")
    elif  num%7==0:
        print (f"The number {num} is a multiple of 7")  
    elif num%13==0:
        print (f"The number {num} is a multiple of 13")  
    