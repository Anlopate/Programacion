'''
Created on 24 oct 2022

@author: anaat
'''
#7. Triángulos. Escribe un programa que pida un número y a continuación pinte un
#triángulo como los siguientes utilizando el número como símbolo.

num=int(input("Escribe un número: "))

mensaje=""

for i in range (0, num):
    mensaje= mensaje + str(num)
    print (mensaje)
