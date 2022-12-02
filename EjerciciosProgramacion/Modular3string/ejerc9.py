'''
Created on 1 dic 2022

@author: anaat
'''


def nueva_cadena (cadena):
    vocales="aeiou"
    cad_voc=""
    cad_cons=""
    nueva_cadena=""
    for i in cadena:     
            if i in vocales:
                cad_voc+=i
            elif i not in vocales and i!=" ":
                cad_cons+=i     
    nueva_cadena=cad_cons+cad_voc    
    return(nueva_cadena)

print (nueva_cadena("La casa de papel"))