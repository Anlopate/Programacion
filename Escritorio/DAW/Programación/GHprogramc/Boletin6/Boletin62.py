'''
Created on 5 oct 2022

@author: anaat
'''
#2. Design a program for reading an integer between 0 and 10 and show the times table.
#To ask for the number you should show the next message "Enter one number
#between 0 and 10”. If the number is out of the boundaries, the program should show
#the message “The number is out of the boundaries”. If the number is valid, it should
#show the times table following the next format:

#7*0=0
#7*1=7
#…..
#7*10numero

number = int(input("Enter one number between 0 and 10: "))

if number<0 or number>10:
    print ("The number is out of the boundaries")
elif  number>0 or number<10:
    for tabla in range (0,11):
        print (f"{number} x {tabla} = {number*tabla}")
    


   
   
   
   
        


    


        

