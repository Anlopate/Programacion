'''
Created on 1 dic 2022

@author: anaat
'''
word="anilina"

def palindrome (word):
    result=""
    right=word
    back=""
   
    for i in word:
        back=i+back 
    if right==back:
        result=True
    else:
        result=False   
    return (result)

print (palindrome (word))