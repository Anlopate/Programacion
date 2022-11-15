'''
Created on 20 oct 2022

@author: anaat
'''
#5. La secuencia siguiente está definida para el conjunto de los números enteros:
#n → n/2 (n es par)
#n → 3n + 1 (n es impar)
#Utilizando la función anterior y empezando en 13 se genera la siguiente secuencia
#de números:
#13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
#Esta secuencia tiene 10 términos y se cree que cualquier secuencia termina en 1.
#Elabora un programa que pida un número n e imprima una cadena con la secuencia
#de números hasta llegar a 1

num=int(input("Introduce un número: "))
 
        
rdo=num    
mensaje=""    
       
while rdo>1:    
    if rdo==2:
        rdo=rdo//2
        mensaje=mensaje+str(rdo) 
    elif rdo%2==0:
        rdo=rdo//2
        mensaje=mensaje+str(rdo)+" → "            
    else:
        rdo=3*rdo+1
        mensaje=mensaje+str(rdo)+" → "

      
print (f"{num} → {mensaje}")          

 
   
        