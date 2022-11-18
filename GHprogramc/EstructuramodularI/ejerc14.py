'''
Created on 16 nov 2022

@author: anaat
'''
cadenas=["junerg", "eerrtt", "hola","aloa"]


def cadenas_largas (cadenas):
    total_palabra=0
    palabraMaslarga=""
    
    for i in range (len(cadenas)):
        cantidad_caracter=0
        cantidad_caracter2=0
        palabra=cadenas.pop()
        cantidad=len(palabra) 
        if cantidad>total_palabra:
            total_palabra=cantidad
            palabraMaslarga=palabra
        if cantidad==total_palabra:
            palabra_larga=palabra
            for i in palabra_larga:
                caracter=i
                if caracter==i:
                    cantidad_caracter+=1
            for i in palabraMaslarga:
                caracter2=i        
                if caracter2==i:
                    cantidad_caracter2+=1
                            
    return (palabraMaslarga)    


 

print (f"La palabra más larga de la cadena es: {cadenas_largas(cadenas)}.")   

