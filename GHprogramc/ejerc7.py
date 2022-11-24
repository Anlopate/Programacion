'''
Created on 14 nov 2022

@author: anaat
'''


ficha1=[3,5]
ficha2=[2,3]

def encajan (ficha1,ficha2):
    resultado=None
    if (ficha1[0] in ficha2) or (ficha1[1] in ficha2):
        resultado=True
    else:
        resultado=False
    return resultado

print (encajan(ficha1,ficha2))