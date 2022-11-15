'''
Created on 19 oct 2022

@author: anaat
'''
#2. Diseñar un programa que pida dos números enteros y nos muestre los siguientes
#números que son múltiplos del segundo introducido a partir del primero. Por ejemplo,
#si introducimos:
#13 y 7 ⇒ 14, 21, 28, 35, 42, 49, 56, 63, 70, 77
#(a partir de 13 los siguientes 10 múltiplos de 7


n1, n2 = 13, 7
multiplo = 0

for i in range (n1, n1+n2):
    if i % n2==0:
        multiplo= i
        #print (i, i%multiplo)   
        
contador=0
mensaje= ""
while contador<10:
        mensaje=str(multiplo)+","  
        contador+=1     
        multiplo+=1
        
print (mensaje)        
