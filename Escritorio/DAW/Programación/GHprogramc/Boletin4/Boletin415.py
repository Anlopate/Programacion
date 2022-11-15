'''
Created on 4 oct 2022

@author: anaat
'''
#15. Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
#correspondiente. Si introducimos otro número nos da un error.


dia = int(input("¿Qué día de la semana es?"))

if dia == 1:
    print ("El día de la semana es lunes")
elif dia == 2:
    print ("El día de la semana es martes")
elif dia == 3:
    print ("El día de la semana es miércoles")
elif dia == 4:
    print ("El día de la semana es jueves") 
elif dia == 5:
    print ("El día de la semana es viernes")   
elif dia == 6:
    print ("El día de la semana es sábado") 
elif dia == 7:
    print ("El día de la semana es domingo") 
else:
    print ("El día de la semana es erróneo")   
