'''
Created on 14 oct 2022

@author: anaat
'''
#20. Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó 10 €, el 
#segundo 20 €, el tercero 40 € y así sucesivamente. Realizar un programa para determinar 
#cuánto debe pagar mensualmente y el total de lo que pagará después de los 20 meses.


    
pago = 10
mes = 1

while mes<20:
    pago=pago*2
    mes+=1
    print (f"En el mes {mes} debe pagar {pago}")
    
print (f"El total a pagar es {pago*20}")    


    
    