'''
Created on 29 nov 2022

@author: anaat
'''
character="PapasFritasconTomate"


def lowCaseInString (character):
    contador=0
    for i in character:
        if i == i.lower():
            contador+=1
    return (contador)        

print (f"There are {lowCaseInString (character)} lower letters.")