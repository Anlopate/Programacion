'''
Created on 20 oct 2022

@author: anaat
'''
#3. Diseñar un programa que muestre, para cada número introducido por teclado, si es
#par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
#introducido por teclado sea 0. Por ejemplo:
#4 ⇒ es par, positivo y su cuadrado es 16
#-7 ⇒ es impar, negativo y su cuadrado es 49

num= int(input("Introduce un número: "))
    
while num!=0: 
    if num>=0:
        positivo= "positivo"
    else:
        positivo="negativo"
    if num%2==0: 
        par= "par"
    else: 
        par="impar"    
    print (f"El número {num} es {positivo}, es {par} y el cuadrado es {num**2}.")    
    num= int(input("Introduce un número: "))    
    