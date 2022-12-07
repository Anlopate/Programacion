'''
Created on 3 dic 2022

@author: anaat
'''

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
    return (MCD)

print (MCD(24,32))

########################################################################
def calcular_MCD (num1, num2):
    lista_multiplos1=[]   
    for i in range (1,num1+1):
        divisor=num1%i
        if divisor==0:
            lista_multiplos1+=[i]
    lista_multiplos2=[]   
    for i in range (1,num2+1):
        divisor=num2%i
        if divisor==0:
            lista_multiplos2+=[i]
    lista_comun=[]
    for i in lista_multiplos1:
        if i in lista_multiplos2:
            lista_comun+=[i]
    MCD=0
    for i in lista_comun:
        while i>MCD:
            MCD=i
            
    return (MCD)        

print (f"El MCD es {(calcular_MCD (24, 32))}.")

#####################################################

mcm=(num1*num2)/MCD