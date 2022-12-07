'''
Created on 2 dic 2022

@author: anaat
'''
#1 
"""def sumaDigitos (num):
    s = 0
    while num >0:
        s = s+num%10
        num=num//10
    return (s)

print (sumaDigitos(125))"""


#2
"""num1=8
num2=12

def MCD (num1, num2):
    if num1>num2:
        mayor=num1
        menor=num2
    elif num2>num1:
        menor=num1
        mayor=num2  
    MCD=1  
    for i in range (2,menor+1):
        while num1%i==0 and num2%i==0:
            MCD=MCD*i
            num1=num1/i
            num2=num2/i        
    
    return MCD

print (f"El MCD de {num1} y {num2} es: {MCD (num1, num2)}")"""

#3

"""num3=24
num4=48

mcm=(num3*num4)//MCD(24,48)

print (f"El mcm de {num3} y {num4} es: {mcm}." )"""

#4

"""def multiplicar (num1, num2):
    lista=""
    for i in range (1, num2+1):
        suma=num1*i
        st_num=str(suma)
        lista+=st_num       
    return lista
    
print (multiplicar (1, 5)) """      


    



















