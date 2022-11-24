'''
Created on 12 nov 2022

@author: anaat
'''


num=0
lista=[]
num_mayor=0
num_pares=""
acumulador=0
while num>=0:
    num = int (input("Introduce un número: "))   
    lista=lista+[num]
    if num>acumulador:
        acumulador=num
        num_mayor=acumulador
    if num%2==0:
        num_pares=num_pares+str(num)+","    
    if num <0:
        lista.remove(num)
       
       
print (lista)
print (f"El número mayor de la lista es {num_mayor}")
print (f"Los números pares de las lista son {num_pares}")