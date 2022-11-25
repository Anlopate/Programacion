'''
Created on 24 nov 2022

@author: anaat
'''

num1=1184
num2=1250

def isFriendNumber (num1, num2):
    divisor1=0
    divisor2=0
    for i in range (1, num1-1):
        if num1%i==0:
            divisor1+=i
    for i in range (1, num2-1):
        if num2%i==0:
            divisor2+=i    
    if divisor1==num2 or divisor2==num1:
        respuesta=True
    else:
        respuesta=False
    return (respuesta)

print (isFriendNumber (num1,num2))