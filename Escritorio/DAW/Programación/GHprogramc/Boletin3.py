


"@author: anaat"

#1. Realizar un programa que lea un número entero por teclado e informe de si
#el número es par o impar (el cero se considera par).
numero = int(input(" ¿es este número par o impar?:"))
if numero % 2 == 0:
    print ("es par")
else:
    print ("es impar")
 
#2. Realizar un programa que solicite dos números por teclado e imprima en
#pantalla si son iguales, el primero mayor que el segundo o el primero más
#pequeño que el segundo.

num1 = int(input("Escribe un número:"))
num2 = int(input ("Escribe otro número:"))
if num1 == num2: 
    print ("sí son iguales")
elif num1>num2:
    print ("El primero es mayor que el segundo")
elif num1<num2:
    print("El primero es menor que el segundo")
else:
    print ("no son iguales")  
    
#3.Realizar un programa que lea un número por teclado. El programa debe
#imprimir en pantalla un mensaje con “El número xx es múltiplo de 2” o un
#mensaje con “El número xx es múltiplo de 3”. Si es múltiplo de 2 y de 3
#deben aparecer los dos mensajes. Si no es múltiplo de ninguno de los dos
#el programa finaliza sin mostrar ningún mensaje.    

num = int(input("Escribe un número:"))
if num %2 == 0:
    print("El número es múltiplo de dos")
if num %3 == 0:
    print ("El número es múltiplo de tres")

    
#4.Realizar un programa que lea la edad de una persona menor a 100 años e
#informe de si es un niño (0-12 años), un adolescente (13-17), un joven (18-29) o un adulto.   
edad = int(input("Edad"))
if edad>=0 and edad <=12:
    print ("Niño")
elif edad >=13 and edad <= 17:
    print ("Adolescente")
elif edad >=18 and edad <=29:
    print ("Joven")   
elif edad >= 29 and edad <100:
    print ("Adulto")
     
#5. Realizar un programa que solicite 4 números e imprima la media de los
#números. También debe imprimir aquellos números que son superiores a la
#media.        
num1= int (input ("Escribe un número:"))
num2= int (input ("Escribe un número:"))
num3= int (input ("Escribe un número:"))
num4= int (input ("Escribe un número:"))
media = ((num1+num2+num3+num4)//4)

print (f"La meedia de los números es {media}")

if num1 > media:
    print (f"El número {num1} es mayor que la media")
if num2 > media:
    print (f"El número {num2} es mayor que la media") 
if num3 > media:
    print (f"El número {num3} es mayor que la media")
if num4 > media:
    print (f"El número {num4} es mayor que la media")    

#6. Realizar un programa que solicite un carácter por teclado e informe por
#pantalla si el carácter es una vocal o no lo es. Si es una vocal mostrará el
#mensaje “Es la primera vocal (A)” o “Es la segunda vocal (E)”, etc.
caracter= (input ("Escribe un carácter:"))

if caracter == "a":
    print ("Es una vocal")
    print ("Es la primera vocal")
elif caracter == "e":
    print ("Es una vocal")
    print ("Es la segunda vocal") 
elif caracter == "i":
    print ("Es una vocal")
    print ("Es la tercera vocal")
elif caracter == "o":
    print ("Es una vocal")
    print ("Es la cuarta vocal")
elif caracter == "u":
    print ("Es una vocal")
    print ("Es la quinta vocal")
else:
    print ("No es una vocal")
    
#7. Realizar un programa que lea el estado civil de una persona (S-Soltero, CCasado, V-Viudo y D-Divorciado) y su edad. 
#Después debe mostrar por pantalla el porcentaje de retención que debe aplicársele de acuerdo con las
#siguientes reglas:  
# - A los solteros o divorciados menores de 35 años, un 12%
# - Todas las personas mayores de 50 años, un 8.5%
# - A los viudos o casados menores de 35 años, un 11.3%
# - Al resto de casos se le aplica un 10.5% 

estadocivil = (input("Estado Civil: ")) 
edad = int(input("Edad: "))

if estadocivil =="s":
    print ("Soltero")
elif estadocivil == "d": 
    print ("Divorciado") 
elif estadocivil == "v":
    print ("Viudo")
elif estadocivil == "c":
    print ("Casado") 
    
if (estadocivil == "s" or estadocivil == "d") and edad <35:
    print ("Retención 12%")
elif (estadocivil== "c" or estadocivil=="v") and edad <35:
    print ("Retención 11,3%")    
elif edad > 50:
    print ("Retención 8,5%")
else:
    print ("Retención 10,5%")    

#8. Realizar un programa que lea por teclado dos marcaciones de un reloj
#digital (horas, minutos, segundos) comprendidas entre las 0:0:0 y las
#23:59:59 e informe cual de ellas es mayor.
 
horas1= int(input("Horas1:"))
minutos1= int(input("minutos1:"))
segundos1= int(input("segundos1:"))            

horas2=int(input("Horas2:"))
minutos2=int(input("minutos2:"))   
segundos2=int(input("segundos2:"))

if horas1>horas2:
    print("Hora 1 es mayor")
elif horas1==horas2 and minutos1>minutos2:
    print("Hora 1 es mayor")
elif minutos1==minutos2 and segundos1>segundos2:
        print("Hora 1 es mayor")
else:
    print("Hora 2 es mayor")

  
#9. Realizar un programa que lea un carácter y dos números enteros por
#teclado. Si el carácter leído es un operador aritmético, calcular la operación
#correspondiente, si es cualquier otro debe mostrar un error  


caracter = (input("Escribe un carácter:"))
num1= int (input ("Escribe un número:"))
num2= int (input ("Escribe otro número:"))

if caracter == "+":
    print (f"El resultado es {num1 + num2}")
elif caracter == "*":
    print (f"El resultado es {num1 * num2}")
elif caracter == "-":
    print (f"El resultado es{num1 - num2}")
elif caracter == "/":
    print (f"El resultado es {num1 / num2}")
elif caracter == "//" :
    print (f"El resultado es {num1//num2}")   
elif caracter == "**" :
    print (f"El resultado es {num1**num2}")
elif caracter == "%":
    print (f"El resultado es {num1%num2}")    
else:
    print ("La operación no es correcta")        















