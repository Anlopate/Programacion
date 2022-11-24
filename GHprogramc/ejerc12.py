'''
Created on 16 nov 2022

@author: anaat
'''
lista1=[2,4,5,7,8,9]
lista2=[3,9,1,0,7,6]



def unionListas(lista1,lista2):
    lista_unida=[]
    lista1.extend(lista2)
    for i in lista1:
        if i in lista1 and i not in lista_unida:
            lista_unida.append(i)
    
    return (lista_unida)        
        
    
print (unionListas(lista1,lista2))
