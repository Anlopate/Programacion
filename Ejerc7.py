'''
Created on 24 nov 2022

@author: anaat
'''



def isPrime (num):
    if num>0:
        prime=True
        for i in range (2, num-1):
            if num%i==0:
                prime=False
    else:
        prime=None            
    return (prime)            
                
if __name__=="__main__":                
    print (isPrime (7))