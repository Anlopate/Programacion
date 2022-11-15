'''
Created on 13 nov 2022

@author: anaat
'''


lista=[1,2,4,3,5]

def estaOrdenada (lista):
    respuesta=True
    solucion=True
    
    for i in range (len(lista)-1):
        if lista [i]>lista[i+1]:
            respuesta=False
            
        if respuesta==False:
            if lista [i]<lista[i+1]:
                solucion=False   
    return solucion       

print (estaOrdenada(lista))