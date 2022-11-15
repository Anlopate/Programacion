'''
Created on 25 oct 2022

@author: anaat
'''
#8. Escribe un programa que pregunte por el tipo de figura que quiere pintar y el tamaño
#del lado de la figura y genere las figuras correspondientes en el siguiente formato
#(los valores 3, 4 y 5 son de ejemplo, podrían pedirse desde 1 hasta 10).

tipo = input("Introduce el tipo de figura que quieres mostrar: cuadrado, triángulo o rombo: ")
tamanyo= int (input("Indica el tamaño de la figura: "))

mensaje=""
espacio=""

if tipo == "cuadrado":
    for i in range (0,tamanyo):
        punto=tamanyo*"*"    
        mensaje=str(punto)
        print (mensaje)
        
elif tipo == "triangulo":
    for i in range (1,tamanyo+1):
        punto=i*"* "     
        espacio=(tamanyo-i)*" "    
        mensaje=espacio+str(punto)
        print (mensaje)
        
elif tipo == "rombo":
    for i in range (0,tamanyo+1):
        punto=i*"* "    
        espacio=(tamanyo-i)*" "      
        mensaje=espacio+str(punto)
        print (mensaje)
    for i in range ((tamanyo-1),0,-1):                                   
        punto=i*"* "    
        espacio=" "* (tamanyo-i)  
        mensaje=espacio+str(punto)
        print (mensaje)   