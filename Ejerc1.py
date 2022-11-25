'''
Created on 22 nov 2022

@author: anaat
'''
num=5

def computeFactorial (num):
    if num<0:
        resultado=None
    else:
        factorial=1  
        for i in range (1, num):
            factorial=factorial*i
            resultado=factorial*num
            
    return (resultado)   
    
print (computeFactorial (num))