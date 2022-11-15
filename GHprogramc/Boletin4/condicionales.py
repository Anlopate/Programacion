'''
Created on 20 sept 2022

@author: anaat
'''
temperatura =int( input ( " ¿ Cuál es la temperatura actual ? " ) )
if temperatura >27 :
    print ( " La temperatura es alta . Encendemos aire acondicionado " )
    print ( " Vamos a refrescarnos " )
elif temperatura >= 17 and temperatura <= 27 :
    print ( " Encendemos el ventilador " )
elif temperatura >= 0 and temperatura < 17 :
    print ( " Encendemos el ventilador " )
print ( " Ventilando la habitación " )

temperatura = int ( input ( " ¿ Cuál es la temperatura actual ? " ) )
if temperatura > 27 :
    print ( " La temperatura es alta . Encendemos aire acondicionado " )
    print ( " Vamos a refrescarnos " )
elif temperatura >= 17 and temperatura <= 27 :
    print ( " Encendemos el ventilador " )
elif temperatura >= 0 and temperatura < 17 :
    print ( " Encendendemos la calefacción " )
else :
    print ( " Encendemos la chimenea " )
#print ( " Ventilando la habitación " )

temperatura =int( input ( " ¿ Cuál es la temperatura actual ? " ) )
if temperatura < 0 :
    print ( " Encendemos la chimenea " )
elif temperatura >= 0 and temperatura < 17 :
    print ( " Encendendemos la calefacción " )
elif temperatura >= 17 and temperatura <= 27 :
    print ( " Encendemos el ventilador " )
else :
    print ( " La temperatura es alta . Encendemos aire acondicionado " )
    print ( " Vamos a refrescarnos " )
    
imc = int ( input ( "Dime tu IMC" ))
fumador=bool (input (" Fumador o no :" ))

normopeso=17 <= imc <= 25
sobrepeso=25<imc< 30
obesidad=  imc >= 30 
            
if fumador==True :
  if 17 <= imc <= 25 :
    print ( " riesgo cardiovascular medio - alto " )
elif 25<imc<30:
    print ( " riesgo cardiovascular alto " )
else :
    print ( " riesgo cardiovascular muy alto " )

if 25 < imc < 30 or imc >= 30 :
    print ( " riesgo cardiovascular medio - alto " )
else :
    print ( " riesgo cardiovascular bajo ")
                                                
     
    