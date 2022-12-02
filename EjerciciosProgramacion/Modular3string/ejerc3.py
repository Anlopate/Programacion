'''
Created on 1 dic 2022

@author: anaat
'''

character="PapasFritasconTomate"
def upperCaseInString (character):
    contador=0
    for i in character:
        if i == i.upper():
            contador+=1
    return (contador)        

print (f"There are {upperCaseInString (character)} upper letters.")