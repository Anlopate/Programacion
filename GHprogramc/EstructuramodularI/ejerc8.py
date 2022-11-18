'''
Created on 14 nov 2022

@author: anaat
'''
lista=[]
num=int(input("Introduce un número: "))

while num>0:
    lista.append(num)
    num=int(input("Introduce un número: "))
print (lista)
  
def num_primos (lista):  
    num_primos=[]
    for i in range (len(lista)):
        contador=0
        num=lista[i]
        for i in range (2, num):
            if num%i==0:
                contador+=1
        if contador==0:
            num_primos.append(num)       
    return (num_primos)  

print (f"En la lista son número primos {num_primos (lista)}")

def suma (lista):
    contador=0
    for i in lista:
        contador=contador+i
    return (contador)
print (f"La sumatoria de la lista es {suma (lista)}")

def media (lista):
    media=suma(lista)/(len(lista))
    return (media)

print (f"La media de la lista es {media(lista)}")

"""def factorial (lista):

fact=1
for i in range (len(lista)):
    fact=fact*(lista[i])
      
print (fact)"""   