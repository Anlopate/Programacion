'''
Created on 24 nov 2022

@author: anaat
'''
a=2
b=7
c=5


def solveSecondOrderEquation (a,b,c):
    if (a>=0 or a<0) and (b>=0 or b<0) and (c>=0 or c<0): 
        x1=-b+(((b**2)-4*a*c)**0.5)/2*a
        x2=-b-(((b**2)-4*a*c)**0.5)/2*a 
        solucion=x1,x2
    else:
        solucion=None
    return solucion

print (solveSecondOrderEquation (a,b,c))     