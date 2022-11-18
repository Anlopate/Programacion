'''
Created on 16 nov 2022

@author: anaat
'''
nombres=["Ana","Jaime","Sara","Abel"]
letra=""

def nombre_inicial (nombres,letra):
        inicial=[]
        for i in nombres:
            if letra.upper() in i:
                inicial.append(i)
        return (inicial)        
        
print (nombre_inicial(nombres,"S"))