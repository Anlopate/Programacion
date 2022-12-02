'''
Created on 1 dic 2022

@author: anaat
'''

def num_palabras_cadena (texto):
    palabra=0
    if texto[0]!=" ":
        palabra+=1
    for i in range (len(texto)-1):
        if texto[i]==" " and texto[i+1]!=" ": 
            palabra+=1
    return palabra        
       
          

print (num_palabras_cadena ("  La casa es azul  "))