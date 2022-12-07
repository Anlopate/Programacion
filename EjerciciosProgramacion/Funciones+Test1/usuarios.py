'''
Created on 5 dic 2022

@author: anaat
'''
# """Diseña un programa que permite guardar el nombre de usuario y contraseña de
#hasta 10 usuarios diferentes. Si el usuario ya existe en el sistema, puede hacer
#login tras incluir un usuario y contraseña válidas hasta un máximo de tres
#intentos, momento en el que se bloquea su cuenta.
#Si el usuario no existe, puede crear una cuenta siempre que haya espacio
#(máximo 10), para lo que se le pedirá usuario y contraseña, así como la
#confirmación de ésta última.
#El menú de este programa permitirá identificarse y crear cuentas nuevas, así
#como mostrar todos los nombres de usuario existentes sin sus contraseñas."""


lista_usuarios=["analo", "elate", "josemi", "amparo", "maripili", "pedro", "angel", "peter"]
lista_contrs=["123","456","678","910","112","113", "345", "789"]

def crear_cuenta (usuario, contrasenya, repetir_cont, baseUsuarios=lista_usuarios):
    if len(baseUsuarios)>=10:
        print ("No se pueden crear más usuarios.")
    elif usuario in baseUsuarios:
        print ("El usuario ya existe.")    
    else:
        while repetir_cont!=contrasenya:
            contrasenya=input("Introduzca contraseña de nuevo: ")
            repetir_cont=input("Repetir contraseña de nuevo: ")        
        lista_usuarios.append (usuario)
        lista_contrs.append (contrasenya)    
    
def introducir_usuario (usuario, contrasenya, baseUsuarios=lista_usuarios, baseContrs=lista_contrs):
    intentos=0
    if usuario in baseUsuarios:
        while baseContrs[baseUsuarios.index(usuario)]!=contrasenya and intentos<2:
            intentos+=1
            contrasenya=input("Repita la contraseña: .")
        if intentos==2:
            print ("Usuario bloqueado.") 
        else:
            print ("Bienvenido")    
    else:
        print ("El usuario no existe.")         
        
menu="""Menu
     1. Introducir usuario.
     2. Crear cuenta.
     3. Mostrar usuarios.
     4. Salir."""
     
opcion=0
print(menu)

while opcion!=4: 
    opcion=int(input("Elija una opción: "))
    if opcion==1:
        usuario=input("Introduzca usuario: ")
        contrasenya=input("Introduzca contraseña: ")
        introducir_usuario (usuario, contrasenya)
    elif opcion==2:
       usuario=input("Introduzca usuario: ") 
       contrasenya=input("Introduzca contrasenya: ")
       repetir_cont=input("Repetir contrasenya: ")
       crear_cuenta (usuario, contrasenya, repetir_cont)
    elif opcion==3:
        print (lista_usuarios)
    
     
    