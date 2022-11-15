'''
Created on 19 oct 2022

@author: anaat
'''
#1. Crea un programa que tras preguntar por dos números realice la división del mayor
#de ellos por el menor y muestre el resultado de la división, es decir, el cociente y el
#resto. Solo puedes utilizar la suma o la resta, pero no otras operaciones.

n1=int(input("Introduce un número: "))
n2=int(input("Introduce otro número: "))

if n1>n2:
    dividendo=n1
    divisor=n2
elif n2>n1:
    dividendo=n2
    divisor=n1
    
resto=0
cociente=0

while dividendo>=divisor:
    dividendo=dividendo-divisor
    cociente=cociente+1
resto=dividendo

print (f"El cociente es {cociente} y el resto es {resto}")
    
        
            
        
    
    
    