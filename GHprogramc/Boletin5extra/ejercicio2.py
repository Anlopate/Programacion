'''
Created on 19 oct 2022

@author: anaat
'''
#2. Escribe una aplicación que pida la fecha actual (día y mes) y el hemisferio
#(Norte/Sur) e indique en qué estación se encuentra:
#a. Hemisferio Norte: Otoño (desde 23 Septiembre), Invierno (desde 21
#diciembre), Primavera (desde 21 Marzo), Verano (desde 21 Junio).
#b. Hemisferio Sur: Primavera (desde 23 Septiembre), Verano (desde 21
#diciembre), Otoño (desde 21 Marzo), Invierno (desde 21 Junio).

fecha= input ("Introduzca la fecha actual dd-mm-yyyy: ")
hemisferio= input ("Introduzca el hemisferio N/S: ").upper()

dia=int(fecha[0:2])
mes=int(fecha[3:5])

if (mes==10 or mes==11) or (mes==9 and 23<=dia<=31) or (mes==12 and dia>=21):
    if hemisferio == "N":
        print ("Es otoño")
    elif hemisferio == "S":
        print ("Es primavera")

elif (mes==1 or mes==2) or (mes==3 and 1<dia<=20) or (mes==12 and 21<=dia<31):
    if hemisferio == "N":
        print ("Es invierno")
    elif hemisferio == "S":
        print ("Es verano")    
        
elif (mes==4 or mes==5) or (mes==3 and 21<dia<31) or (mes==6 and 20<=dia<31):
    if hemisferio == "N":
        print ("Es primavera")
    elif hemisferio == "S":
        print ("Es otoño")  
        
elif (mes==7 or mes==8) or (mes==6 and 21<=dia<31) or (mes==9 and 22<=dia<31):
    if hemisferio == "N":
        print ("Es verano")
    elif hemisferio == "S":
        print ("Es invierno")                     