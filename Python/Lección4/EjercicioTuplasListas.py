import imp


import math
# Dada la siguiente tupla

tupla = (13, 1, 8, 3, 2, 5, 8) # definimos la tupla

# Crear una lista que solo incluya los numeros menores 5
# e imprima por consola [1, 3, 2]

lista = [] # Definimos fla lista
# Filtramos los elementos menores a 5 de la tupla
for elemento in tupla:
    if elemento < 5:
        lista. append(elemento)
print(lista)


# Ejercicio de matematicas
# Para sacar la raíz cuadrada de un número positivo
numero = int(input('Dirigite un numero positivo'))
while numero < 0:
    print('Error -> Debería ser un número positivo')
    numero = int(input('Dirigite un numero positivo'))
print(f'\nSu raíz cuadrada es: {math.sqrt(numero):.2f}')
    