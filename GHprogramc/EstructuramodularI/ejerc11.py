'''
Created on 15 nov 2022

@author: anaat
'''
lista1=[2,4,5,7,8,9,5]
lista2=[8,9,4,1,9,5,3,5]



def intersect (lista1,lista2):
    lista3=[]
    for i in lista1:
        if i in lista2 and i not in lista3: 
            lista3.append (i)
    return (lista3)

        
print (intersect(lista1,lista2))
       
    

