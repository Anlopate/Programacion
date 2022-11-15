'''
Created on 17 oct 2022

@author: anaat
'''
#19. Escribe un programa que dados dos números, uno real (base) y un entero positivo 
#(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador 
#de potencia.

base = int(input ("Dime un número: "))
exp = int (input("Dime otro número: "))

potencia=1

for i in range (1,exp+1):
    potencia=potencia*base
   

print (f"La potencia de {base} elevado a {exp} es {potencia}")      
    
    
   

    
  
    

    
    
    
    
    
    