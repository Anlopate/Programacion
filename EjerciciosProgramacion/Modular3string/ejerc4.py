'''
Created on 1 dic 2022

@author: anaat
'''

number="5por5sonveintey5"
lista_num=["0","1","2","3","4","5","6","7","8","9"]

def numberInString (number):
    contador=0
    for i in number:
        if i in lista_num:
            contador+=1 
    return (contador)

print (f"There are {numberInString(number)} numbers in string.")