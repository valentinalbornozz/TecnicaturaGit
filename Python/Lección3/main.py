# Ciclo While (Mientras o durante)
"""
contador = 0 
while contador < 3:
    print('Ejecutamos nuestro ciclo white ', +contador)
    contador += 1
else: 
    print('Fin del ciclo while')
"""
# Imprimir números del 0 al 5 con le ciclo while
"""
maximo = 5 
contador = 0
while contador <= maximo: 
    print(contador)
    contador += 1
"""
"""
minimo = 1
contador = 5
while contador >= minimo:
    print(contador)
    contador -= 1
"""

# Ciclo for 
"""
cadena = 'hello'
for letra in cadena:
    print(letra)
else:
    print('Fin del ciclo for')
"""
# Palabra Reservada break 
"""
for letra in 'Alemania':
    if letra == 'a':
        print(f'Letra encontrada: {letra}')
else:
    print('Fin del ciclo for')
"""

#Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f'valor: {i}')

for i in range (6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')