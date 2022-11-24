'''
Created on 6 nov 2022

@author: anaat
'''
from random import randint

lista=[]  
num_mayor=0
num_menor=1001
suma=0

for i in range (100):
    numero=randint(0, 1000)
    lista.append(numero)  
     
    if numero>num_mayor:
        num_mayor=numero
    elif numero<num_menor:
        num_menor=numero 
    
    if numero>0:
        suma=suma+numero   
      

print (lista) 
print (f"El número mayor de la lista es {num_mayor}")
print (f"El número menor de la lista es {num_menor}") 
print (f"La suma de todos los números es {suma}")  
print (f"La media de la lista es {suma/100}") 

"""sustituir=int(input("¿Qué número quieres sustituir?"))
print (lista.index(sustituir))
introducir=int(input("¿Qué número quieres introducir?"))
lista.insert (0, introducir)
print (lista) """