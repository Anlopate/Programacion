'''
Created on 29 nov 2022

@author: anaat
'''

string="LaCAdenaTirAagua"

    
def InString (string, character):
    contador=0
    for i in str(string.lower ()):
        if i == character.lower():
            contador+=1     
    mensaje=f"El carcater se repite {contador} veces."
    return mensaje           
  
print (InString (string, "a"))