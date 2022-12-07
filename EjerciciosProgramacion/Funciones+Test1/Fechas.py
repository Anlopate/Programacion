'''
Created on 4 dic 2022

@author: anaat
'''

#1
"""def calcular_segundos (hora, minutos, segundos):
    if 0<=hora<=23 and 0<=minutos<=59 or 0<=segundos<=59:
        seg_hora=hora*3600
        seg_minutos=minutos*60

    total_seg_dia=seg_hora+seg_minutos+segundos   
    
    return total_seg_dia     

print (f"El día tiene {calcular_segundos (12,25,18)} hasta la hora indicada.")"""

#2
"""def diferencia_segundos (h1,m1,s1,h2,m2,s2):
    if (0<=h1<=23 and 0<=m1<=59 and 0<=s1<=59) and (0<=h2<=23 and 0<=m2<=59 and 0<=s2<=59):
        if h1>h2:
            h_mayor=h1
            h_menor=h2
        elif h2>h1:
            h_mayor=h2
            h_menor=h1  
              
        if m1>m2:
            m_mayor=m1
            m_menor=m2
        elif m2>m1:
            m_mayor=m2
            m_menor=m1  
            
        if s1>s2:
            s_mayor=s1
            s_menor=s2
        elif s2>s1:
            s_mayor=s2
            s_menor=s1          

    dif_horas=h_mayor-h_menor     
    seg_horas=dif_horas*3600   
    
    dif_minutos=m_mayor-m_menor
    seg_minutos=dif_minutos*60
    
    dif_segundos=s_mayor-s_menor
    
    
    dif_seg_total=seg_horas+seg_minutos+dif_segundos

    return dif_seg_total
print (f"La diferencia en segundo entre una hora y otra es: {diferencia_segundos (2,15,24, 14,18,23)}")
"""
#3

"""dia=86400
hr=3600
min=60
sg=75000

if sg>0:
    if sg>=dia:
        calculo_dias=sg//dia
        sg_restantes=calculo_dias*dia    
        sg=sg-sg_restantes
    else:
        calculo_dias=0
    if sg>hr:
        calculo_horas=sg//hr
        sg_restantes=calculo_horas*hr
        sg=sg-sg_restantes
    else:
        calculo_horas=0
    if sg>min:
        calculo_minutos=sg//min
        sg_restantes=calculo_minutos*min
        sg=sg-sg_restantes
    else:
        calculo_minutos=0    
   """
#4

    
print (f"Son en total {calculo_dias} días, {calculo_horas} horas, {calculo_minutos} minutos y {sg} segundos")



























