'''
Created on 25 nov 2022

@author: anaat
'''

def getNumberOfDigits (num):
    numeros=["0","1","2","3","4","5","6","7","8","9"]
    cantidad_digitos=0
    numero=str(num)
    contador=0
    for i in numero:
        if i not in numeros:
            contador+=0
        else:
           contador+=1
    
    return contador   
    

print (getNumberOfDigits(8.5.3))