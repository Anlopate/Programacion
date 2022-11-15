'''
Created on 29 sept 2022

@author: anaat
'''
# 1. Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

cateto1= 5
cateto2= 8

print (cateto1 **2 + cateto2 **2)**0.05


#2. Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsiu

Fh = int(input ("Grados Fahrenheit:"))

print ((Fh - 32)*5/9 )


#3. Calcular la media de tres números pedidos por teclado

num1= int(input ("Escribe un número:"))
num2= int (input("Escribe un número:"))
num3= int (input ("Escribe un número:"))

print ((num1+num2+num3)/3)

#4. Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber 
#cuanto deberá pagar finalmente por su compra."""

compra = float(input ("Precio compra sin descuento:"))

print (compra - (compra * 0.15))

#5. Pide al usuario dos números y muestra la "distancia" entre ellos (el valor absoluto de su 
#diferencia, de modo que el resultado sea siempre positivo).

num1= int(input("Escribe un número:"))
num2= int(input("Escribe otro número:"))
distancia= num1 - num2
distancia_positiva = (distancia*-1)
print (num1 -num2)

if distancia < 0:
    print (distancia * -1)
print (f"La distancia entre num1 y num2 es {distancia_positiva}") 


#6. Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano. 
#Calcula y muestra la distancia entre ellos.

x1 = int (input ("Dale un valor a x1:"))
y1 = int (input ("Dale un valor a y1:"))
x2 = int (input ("Dale un valor a x2:"))
y2 = int (input ("Dale un valor a y2:"))
distancia = ((x2-x1)**2 + (y2-y1)**2)**0.5

print (f"la distancia entre x1,y1 y x2,y2 es {distancia}")

#7. Realizar un algoritmos que lea un número y que muestre su raíz cuadrada y su raíz cúbica. 
#Python no tiene ninguna función predefinida que permita calcular la raíz cúbica, ¿cómo se 
#puede calcular?

numero = int (input ("Escribe un número:"))
raiz_cuadrada= numero*0.05
raiz_cubica= numero*0.07

print (f"La raíz cuadrada de {numero} es {raiz_cuadrada} y la raiz cúbica es {raiz_cubica}")

#8. Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) después de 
#pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos).

dos_euros =  int (input ("¿Cuántas monedas de  2 euros tienes?"))
un_euro =  int (input ("¿Cuántas monedas de  1 euro tienes?"))
cent_50 =  int (input ("¿Cuántas monedas de 50 cent tienes?"))
cent_20 =  int (input ("¿Cuántas monedas de  20 cent tienes?"))
cent_10 =  int (input ("¿Cuántas monedas de  10 cent tienes?"))
cent_5 =  int (input ("¿Cuántas monedas de 5 cent tienes?"))

monedas_cent = (dos_euros*100 + un_euro*100 + cent_50*50 + cent_20*20 + cent_10*10 + cent_5*5)//100
monedas_euro = monedas_cent % 100

print (f"Tengo {monedas_euro} monedas de euro y {monedas_cent} monedas de céntimo")

#Realiza un algoritmo que calcule la potencia, para ello pide por teclado la base y el 
#exponente. Pueden ocurrir tres cosas:
# El exponente sea positivo, sólo tienes que imprimir la potencia.
# El exponente sea 0, el resultado es 1.
# El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.

base = int(input("¿Cuál es la base?"))
exponente = int(input ("¿Cuál es el exponente?"))
potencia = base**exponente
exponente2 = (-(exponente))

if exponente > 0:
    print (potencia)
elif exponente == 0:
    print (potencia)
elif exponente < 0:
    print (1/base**exponente2)
       
#11. Escribir un programa que lea un año, indicar si es bisiesto. Nota: un año es bisiesto si es un 
#número divisible por 4, pero no si es divisible por 100, excepto que también sea divisible 
#por 400.    

año= int(input("Escribe un año:"))

if año % 4 == 0 or año % 100 == 0 and año % 400 ==0:
    print ("Es un año bisiesto")
elif año % 100 == 0:
    print ("Es un año no bisiesto")
else:
    print("Es un año no bisiesto")

 

    
    
    

































