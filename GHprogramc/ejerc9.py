'''
Created on 15 nov 2022

@author: anaat
'''
lista=[23,4,6,17,80,9,2,11]

num=7


multiplos=[]

def num_menores (lista):
    num_menores=[]
    for i in lista:
        if i<num:
            num_menores.append(i)
    return (num_menores)
            
print (f"Los números mayores de {num} en la lista son {num_menores(lista)}")

def num_mayores (lista):
    num_mayores=[]
    for i in lista:
        if i>num:
            num_mayores.append(i)
    return (num_mayores)
            
print (f"Los números mayores de {num} en la lista son {num_mayores(lista)}")

def multiplos (lista):
    multiplos=[]
    for i in lista:
        if i%num==0:
            multiplos.append(i)
            
    return (multiplos)   
print (f"Los múltiplos de {num} en la lista son {multiplos(lista)}")     