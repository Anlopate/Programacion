'''
Created on 12 nov 2022

@author: anaat
'''
frase= ["Di",'buen','día','a','papá']

def reverse (frase):
    reverse= list ()
    for i in range (len(frase)):
       reverse.append(frase[len(frase)-1-i])
    return (reverse)

print (reverse(frase))

