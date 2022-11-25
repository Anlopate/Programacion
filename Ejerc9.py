'''
Created on 24 nov 2022

@author: anaat
'''


from ProgramModular2.Ejerc7 import isPrime

num=50

def getPrimeDivisors (num):
    lista_prime=[]
    lista_div=[]
    for i in range (1,num+1):
        if num%i==0 and isPrime (i):     
            lista_div.append(i)
    return lista_div   

print (getPrimeDivisors (num))       
   
          

    
    
        
     