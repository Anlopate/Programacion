'''
Created on 1 dic 2022

@author: anaat
'''


texto="fghsssyseoajjtttmmaaaa"
palabra="seta"

def palabra_escondida (texto):
    palabreja=""
    for i in palabra:
        if i in texto:
            palabreja+=i
    if palabreja==palabra:
        respuesta=True 
    else:
        respuesta=False            
    return (respuesta)

print (palabra_escondida (texto))