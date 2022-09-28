# Ejercicio 3: Función Recursiva
# Impirmit números de 5 a 1 de manera descendente usando funciones recursivas
# Puede ser cualquier valor positivo, por ejemplo, si pasamos el
# valor de 5, debe imprimir:
# 5
# 4
# 3
# 2
# 1
# En caso de ser el número 3 debe imprimir: 
# 3
# 2
# 1
# Si se ingresan números negativos no imprime nada
def imprmir_numero_recursivos(numero):
    
    if numero >= 1: # Caso Base
        print(numero)
        imprmir_numero_recursivos(numero-1) # Caso Recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print('Valor ingresado incorrecto...')

imprmir_numero_recursivos(5) #Tarea: que el número lo ingrese el usuario