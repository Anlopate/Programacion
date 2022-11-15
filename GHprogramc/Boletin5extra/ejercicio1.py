'''
Created on 19 oct 2022

@author: anaat
'''
#1. Escribe el código de un programa que reciba un número de nota de 0 a 100 y nos
#informe de las calificaciones en el siguiente formato:
#90-100, Sobresaliente
#70-89, Notable
#60-69, Bien
#50-59, Suficiente
#0-49, Suspenso

nota=int (input("Introduce la nota: "))

if nota>= 0 and nota <=49:
    print ("Suspenso")
    
elif nota>=50 and nota <=59: 
    print ("Suficiente")

elif nota>=60 and nota <=69:
    print ("Bien")

elif nota>=70 and nota <=89:
    print ("Notable")    
    
elif nota>=90 and nota<=100:
    print ("Sobresaliente")    