'''
Created on 26 oct 2022

@author: anaat
'''
#9. Crea un programa nuevo basado en el anterior que genere las mismas figuras, pero
#vacías:

#tipo = input("Introduce el tipo de figura que quieres mostrar: cuadrado, triángulo o rombo: ")
#tamanyo=int(input("Indica el tamaño de la figura: "))

tipo="triangulo"
tamanyo=10
              
mensaje=""
espacio=""

if tipo=="cuadrado":
    for i in range (1, tamanyo+1):    
        punto=tamanyo*" *"
        if i==1 or i==tamanyo:
            mensaje=str(punto)
        elif i>1 or i<tamanyo:
            punto=" *"+"  "*int(tamanyo-2)+ " *"
            mensaje=str(punto)  
        print(mensaje)

if tipo=="triangulo":
    for i in range (1, tamanyo+1):    
        punto=tamanyo*" *"
        if i==tamanyo:
            mensaje=str(punto)
        elif i>1 or i<tamanyo:
            punto=" *"+"  "*int(tamanyo-2)+ " *"
            mensaje=str(punto)  
        print(mensaje)            