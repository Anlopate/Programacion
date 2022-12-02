'''
Created on 1 dic 2022

@author: anaat
'''

def vocales_distintas (texto):
    contador=0
    vocales="aeiou"
    for i in vocales:
        if i in texto:
            contador+=1
    return contador          
       
print (vocales_distintas ("carahurta"))
