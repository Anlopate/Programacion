'''
Created on 3 dic 2022

@author: anaat
'''

#5.1
def leer_fraccion (numerador,denominador):
    if numerador>denominador:
        mayor=numerador
        menor=denominador
    elif denominador>numerador:
        menor=denominador
        mayor=numerador 
    MCD=1  
    for i in range (2,menor+1):
        while numerador%i==0 and denominador%i==0:
            MCD=MCD*i
            numerador=numerador//i
            denominador=denominador//i        
    
    return numerador, denominador
 
print (leer_fraccion (16,6))

#5.3
def calcular_mcd (num1, num2):
    if num1>num2:
        mayor=num1
        menor=num2
    elif num2>num1:
        mayor=num2
        menor=num1
    mcd=1    
    for i in range (1, menor-1):
        if num1%i==0 and num2%i==0:
            mcd=mcd*i
            num1=num1//i
            num2=num2//i 
    return (mcd)        
                    
print (calcular_mcd (125, 35))    

#5.4
def simplificar_fraccion (numerador, denominador):
        MCD=1  
        for i in range (2,denominador+1):
            while numerador%i==0 and denominador%i==0:
                MCD=MCD*i
                numerador=numerador//i
                denominador=denominador//i        
        
        return numerador, denominador
print (simplificar_fraccion (250, 50))

#5.5
def sumar_fracciones (num1,den1,num2,den2):
    num3=num1*den2+den1*num2
    den3=den1*den2
    
    mcd=(calcular_mcd (num3,den3))
    
    num3_simpl=num3//mcd
    den3_simpl=den3//mcd
    
    return num3_simpl, den3_simpl
    

print (sumar_fracciones (25, 12, 45, 20))

#5.6
def restar_fracciones (num1, den1, num2, den2):
    num3=num1*den2-den1*num2
    den3=den1*den2
    
    mcd=(calcular_mcd (num3, den3))
    
    num3_simpl=num3//mcd
    den3_simpl=den3//mcd
    
    return (num3_simpl, den3_simpl)
   
print (restar_fracciones (124, 32, 675, 89))

#5.7
def multiplicar_fracciones (num1, num2, den1, den2):
    num3=num1*num2
    den3=den1*den2
    
    mcd=(calcular_mcd (num3,den3))
    
    num3_simpl=num3//mcd
    den3_simpl=num3//mcd
    
    return num3_simpl, den3_simpl

print (multiplicar_fracciones (14, 7, 25, 3))


#5.8
def dividir_fracciones (num1, den1, num2, den2):
    num3=num1*den2
    den3=den1*num2
    
    mcd=(calcular_mcd (num3, den3))
    
    num_simpl=num3//mcd
    den_simpl=den3//mcd
    
    return (num_simpl, den_simpl)

print (dividir_fracciones (125, 8, 783, 23))


#6

MENU=  """MENU 
       a. Sumar.
       b. Restar.
       c. Multiplicar.
       d. Dividir.
       e. Salir."""
       

num1=int(input("Introduzca numerador1: "))
den1=int(input("Introduzca denominador1: "))
num2=int(input("Introduzca numerador2: "))
den2=int(input("Introduzca denominador2: "))

print (MENU)
opcion=input("Introduzca una opción: ")

while opcion!="e":   
    if opcion=="a":     
        resultado=sumar_fracciones (num1, den1, num2, den2)    
   
    elif opcion=="b":
        resultado=restar_fracciones (num1, den1, num2, den2)

    elif opcion=="c":
        resultado=multiplicar_fracciones (num1, den1, num2, den2)
            
    elif opcion=="d":
        resultado=dividir_fracciones (num1, den1, num2, den2)
    
    print (resultado)
    
    opcion=input("Introduzca una opción: ")
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    