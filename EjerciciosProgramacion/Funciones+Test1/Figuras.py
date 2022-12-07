'''
Created on 4 dic 2022

@author: anaat
'''
"""pi=3,1415
#1 
def calcular_area_circulo (radio):
    area=pi*(radio)**2 
    return area
print (calcular_area_circulo (12))

#2 
def calcular_longitud_circulo (radio):
    longitud=pi*(radio*2)
    return longitud

print (calcular_longitud_circulo (5))
"""
#3 Distancia euclídea= (p1,p2)= ((x2-x1)**2-(y2-y1)**2)**0.5
"""def calcular_distancia_dospuntos (x1,x2,y1,y2):
    p1=(x2-x1)**2
    p2=(y2-y1)**2
    resta=p1-p2
    distancia=resta**0.5
    return distancia
print (calcular_distancia (25,42,65,80))
    """
#4 Perimetro cuadrado = ((x2-x1)**2+(y2-y1)**2)**0.5 + ((x3-x2)**2+(y3-y2)**2)**0.5 + ((x3-x1)**2 + (y3-y1)**2)**0.5

"""def calcular_perimetro_triangulo (x1,x2,x3, y1, y2, y3):
    lado1=((x2-x1)**2+(y2-y1)**2)**0.5
    lado2=((x3-x2)**2+(y3-y2)**2)**0.5
    lado3=((x3-x1)**2 + (y3-y1)**2)**0.5
    
    perimetro=lado1+lado2+lado3 

    return perimetro
print (calcular_perimetro_triangulo (25, 34, 14, 18, 30, 35))"""

#5 area triángulo =1/2 {[(x1*y2)+(x2*y3)+(x3*y1)]-[(x1*y3)+(x3*y2)+(x2*y1)]}

def calcular_area_triangulo (x1,x2,x3,y1,y2,y3):
    A=(x1*y2)+(x2*y3)+(x3*y1)
    B=(x1*y3)+(x3*y2)+(x2*y1)
    area=(A-B)/2
    
    return (area)
print (calcular_area_triangulo (2,0,2,2,2,1))
