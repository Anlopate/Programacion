'''
Created on 12 nov 2022

@author: anaat
'''
frase= ["Di",'buen','día','a','papá']

alreves= list ()

for i in range (len(frase)):
   alreves.append(frase[len(frase)-1-i])
    
print (alreves)  

#################################################

"""alreves = list()

for i in frase:
    alreves=[i] + alreves
print (alreves)
#################################################
alreves=frase[::-1]

print (alreves)
    """