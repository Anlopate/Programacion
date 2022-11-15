'''
Created on 9 nov 2022

@author: anaat
'''
dia=1

while dia>0:
    dia=int(input("Introduce el día de la fecha: "))
    
    
    if 1<=dia<=31:
        dia_correcto=dia
    mes=int(input("Introduce el mes de la fecha: "))
    if 1<=mes<=12:
        meses=["enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"]
        mes = (meses [mes])
    año=int(input("Introduce el año de la fecha: "))    
         
    print (f"La fecha de formato largo es {dia_correcto} de {mes} del {año}")           