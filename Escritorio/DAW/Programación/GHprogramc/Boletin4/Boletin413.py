'''
Created on 4 oct 2022

@author: anaat
'''
#13. El director de una escuela está organizando un viaje de estudios, y requiere determinar 
#cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el 
#servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el costo por cada 
#alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, 
#y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el 
#número de alumnos. Realice un algoritmo que permita determinar el pago a la compañía de 
#autobuses y lo que debe pagar cada alumno por el viaje.

num_alumnos = int(input("¿Cuántos alumnos van al viaje?"))


if num_alumnos >= 100:
    print (f"El precio por alumno es 65€ y el autobús cuesta {num_alumnos*65}€")
elif 50 <=num_alumnos<=99:
    print (f"El precio por alumno es 70€ y el autobús cuesta {num_alumnos*70}€")
elif 30 <=num_alumnos<=49:
    print (f"El precio por alumno es 95€ y el autobús cuesta {num_alumnos*95}€")
elif num_alumnos <= 30:
    print (f"El precio del autobús es 4000€. Cada alumno tiene que pagar {4000/num_alumnos}€")            