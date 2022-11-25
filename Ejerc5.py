'''
Created on 24 nov 2022

@author: anaat
'''
base=4
exponente=6


def powerIt (base,exponente):
    rdo=1
    for i in range (exponente):
        rdo=rdo*base
    return rdo

print (powerIt (base,exponente))   

 