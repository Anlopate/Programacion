'''
Created on 20 oct 2022

@author: anaat
'''
#4. Diseña un programa que reciba el tamaño de una secuencia numérica y muestre en
#una única línea cada una de las siguientes secuencias. Si se recibe el número 6 se
#imprimiría:
#a. 1, -5, 25, -125, 625, -3125
#b. 1, -1, 0, 1, -1, 0
#c. 1, 3, 9, 27, 81, 243

tamaño=int(input("Indica el tamaño de la secuencia: "))


mensajeA=""
mensajeB=""
mensajeC=""
a=0
b=0
c=0

for i in range (0, tamaño): 
    if i == tamaño-1:
        mensajeA=mensajeA+str(a)    
    else:
        a=(-5)**i
        b=((i+2)%3)-1
        c=3**i
        mensajeA= mensajeA+str(a)+", "
        mensajeB= mensajeB+str(b)+", "
        mensajeC= mensajeC+str(c)+", "
        
print (f"a. {mensajeA}")
print (f"b. {mensajeB}")    
print (f"c. {mensajeB}")
    
    
    
    

    