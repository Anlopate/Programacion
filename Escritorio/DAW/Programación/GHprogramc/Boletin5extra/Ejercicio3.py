'''
Created on 19 oct 2022

@author: anaat
'''
#3. Crea un programa que dada una fecha en formato (dd-mm-yyyy), nos devuelva
#cuántos días han transcurrido desde el 1 de enero de ese mismo año (considera que
#puede tratarse de un año bisiesto).


fecha = input("Introduce una fecha en formato dd-mm-yyyy: ")
dia, mes, year = int(fecha[0:2]), int(fecha[3:5]), int(fecha[6:10])

diasTotales=0

bisiesto = (year%4==0) and (year%100!=0 or year%400==0)

if mes==1 and 1<=dia<=31:
    diasTotales = dia
    
elif (mes==2 and 1<=dia) or ((bisiesto and dia<=29) or (not bisiesto and dia<=28)):    
    diasTotales=dia+31
    
elif mes==3 and 1<=dia<=31:
    diasTotales=dia+(31+28)

elif mes==4 and 1<=dia<=30:
    diasTotales =dia+(31+28+31)

elif mes==5 and 1<=dia<=31:
    diasTotales=dia+(31+28+31+30)

elif mes==6 and 1<=dia<=30:
    diasTotales=dia+(31+28+31+30+31)
    
elif mes==7 and 1<=dia<=31:
    diasTotales=dia+(31+28+31+30+31+30)

elif mes==8 and 1<=dia<=31:   
    diasTotales=dia+(31+28+31+30+31+30+31)
             
elif mes==9 and 1<=dia<=30:
    diasTotales=dia+(31+28+31+30+31+30+31+31)
    
elif mes==10 and 1<=dia<=31:
    diasTotales=dia+(31+28+31+30+31+30+31+31+30)
    
elif mes==11 and 1<=dia<=30:
    diasTotales=dia+(31+28+31+30+31+30+31+31+30+31)

elif mes==12 and 1<=dia<=31:
    diasTotales=dia+(31+28+31+30+31+30+31+31+30+31+30)
    
if diasTotales>0:
    print(f"El número de días transcurrridos es {diasTotales}")
else:
    print (f"La fecha es incorrecta")   
    