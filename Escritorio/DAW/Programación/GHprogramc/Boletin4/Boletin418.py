'''
Created on 13 oct 2022

@author: anaat
'''
"""18. Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite 
inferior es mayor que el superior lo tiene que volver a pedir. 
A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine
el programa dará las siguientes informaciones:
◦ La suma de los números que están dentro del intervalo (intervalo abierto).
◦ Cuantos números están fuera del intervalo.
◦ Informa si hemos introducido algún número igual a los límites del intervalo.
"""

limite1= int (input ("Dime el límite inferior del intervalo: "))
limite2= int (input("Dime el límite superior del intervalo:  "))

while limite1 >= limite2:
    limite1 = int (input("Dime el límite inferior del intervalo: "))
    
    
    
sumaIntervalo=0
numFuera=0
numLímite=False

num = int (input ("Introduce un número: "))

while num !=0:
    if num> limite1 and num< limite2:
        sumaIntervalo+=num
    elif num< limite1 or num>limite2:
        numFuera+=1
    else:
        numLímite= True
    num = int (input ("Introduce un número: "))  
    
print (f"La suma de los números dentro del intervalo es {sumaIntervalo}.") 
print (f"Hay {numFuera} números fuera del intervalo.")
print (f"{numLímite} hay números en el límite del intervalo.")

        
        

    
   
     
    
    
        
    
    
    

    
    
    

    