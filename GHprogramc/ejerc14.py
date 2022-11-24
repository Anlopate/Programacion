'''
Created on 16 nov 2022

@author: anaat
'''
cadena=["ere", "ju", "hola","sacramento", "wsddrrolkm"]

def cadena_mas_larga (cadena):
    total_palabra=0
    palabraMaslarga=""    
    cadena_larga=[]
    for i in range (len(cadena)):
        palabra=cadena.pop()
        cantidad=len(palabra) 
        if cantidad>total_palabra:
            total_palabra=cantidad
            palabraMaslarga=palabra
            cadena_larga=[palabraMaslarga]
        elif cantidad==total_palabra:
            cadena_larga=cadena_larga+[palabra]
                                             
    return (cadena_larga)    

print (cadena_mas_larga (cadena))


#Hasta aquí he llegado ¡¡ME RINDO!!



        
    
        
