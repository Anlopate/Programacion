'''
Created on 22 nov 2022

@author: anaat
'''

year=2022

def isLeapYear (year):
    if (year%4==0) and (year%100!=0 or year%400==0):
        respuesta = True
    else:
        respuesta = False 
    return (respuesta)

#print (f"¿El año {year} es bisiesto?:{isLeapYear (year)}")