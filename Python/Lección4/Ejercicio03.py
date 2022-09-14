# Ejercicio3: Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introduca un número 0, nuestro programa dejaria de insertar.
# Por ultimo, mostrar los números ordenador de menor a mayor

lista = []
salir = False
while not salir:
    numero = int(input('Digite un número: '))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
lista.sort() # La lista esta ordenada con esta función
print(f'\nLista ordenada: \n{lista}')