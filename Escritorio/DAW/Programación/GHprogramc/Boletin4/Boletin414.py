'''
Created on 4 oct 2022

@author: anaat
'''
#14. La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro 
#es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro, 
#los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del 
#décimo minuto, 50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si
#es otro día, en turno de mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para 
#determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.

duracion = int (input ("¿Cuántos minutos dura la llamada?"))
dia = (input("¿Qué día realiza la llamada?"))
turno = (input("¿En qué turno realiza la llamada?"))

if duracion <=5 and dia == "domingo":
    print (f"El precio de la llamada es {(1*1)+(1*0.03)}€")
elif duracion <=5 and  dia != "domingo" and turno == "m":
    print (f"El precio de la llamada es {(1*1)+(1*0.15)}€")    
elif duracion <=5 and dia!= "domingo" and turno == "t":
    print (f"El precio de la llamada es {(1*1)+(1*0.10)}€")    
    
if 6<=duracion<=8 and dia == "domingo":
    print (f"El precio de la llamada es {(1+0.80)+((1+0.80)*0.03)}€")
elif 6<=duracion<=8 and  dia != "domingo" and turno == "m":
    print (f"El precio de la llamada es {(1+0.80)+((1+0.80)*0.15)}€")     
elif 6<=duracion <=8 and dia!= "domingo" and turno == "t":
    print (f"El precio de la llamada es {(1+0.80)+((1+0.80)*0.10)}€")     
    
if 9<=duracion<=10 and dia== "domingo":
    print (f"El precio de la llamada es {(1+0.80+0.70)+((1+0.80+0.70)*0.03)}€")
elif 9<=duracion<=10 and  dia != "domingo" and turno == "m":
    print (f"El precio de la llamada es {(1+0.80+0.70)+((1+0.80+0.70)*0.10)}€")     
elif 9<=duracion<=10 and  dia != "domingo" and turno == "t":
    print (f"El precio de la llamada es {(1+0.80+0.70)+((1+0.80+0.70)*0.15)}€")
    
if duracion <10 and dia =="domingo":
    print (f"El precio de la llamada es {(1+0.80+0.70+0.50)+((1+0.80+0.70+0.50)*0.03)}€")
elif duracion<10 and  dia != "domingo" and turno == "m":   
    print (f"El precio de la llamada es {(1+0.80+0.70+0.50)+((1+0.80+0.70+0.50)*0.15)}€") 
elif duracion<10 and  dia != "domingo" and turno == "t":
    print (f"El precio de la llamada es {(1+0.80+0.70+0.50)+((1+0.80+0.70+0.50)*0.10)}€")    
      
