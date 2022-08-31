## lista = Ariel, Liliana, Natalia, Osvaldo
# Colecciones en Python
from cgi import print_environ
from cmath import pi
# Las listas es lo que se conoce en otros lenguajes como arreglos o vectores
nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0:2]) ##Solo muestra el indice 0, 1 pero no el indice 2
## Ir del inicia de la lista al indice (sin incluirlo)
print(nombres[:3]) ##Indices a mostrar 0, 1, 2
# Desde el indice indicado hasta el final 
print(nombres[1: ])
# Modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
# Iterar una lista
for nombre in nombres: # Nombre es singular, la lista es plural
    print(nombre) 
else:
    print('Se acabaron los elemnetos de la lista')

# Preguntamos cuantos elementos tine
print(len(nombres)) # le pasamos como parametro la lista

# Agregamos un elemento
nombres.append('Marcelo')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append([4, 5])
nombres.append(7)
print(nombres)

# Insertar un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')

# Elimnamos un elemento
nombres.remove('Alberto')

# Eliminar el último elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2] # del significa delete
print(nombres)

# Elimnar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

# Elimnar la lista 
del nombres
print(nombres) # Aqui nos mostrara un error

# Definimos un tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])

# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango 
print(cocina[0:1])

# Ejemplo 
verduras = ('papa', ) # Una tupla necesita aunque sea un elemento la coma
#de lo contrario solo seria un tipo str cadena

# Recorremo los elemntos de la tupla
for cocinar in cocina: # Print esta usando \n para saltos de lineas
    print(cocinar, end=' ') # Usamos end= para elimnar los saltos de lineas

cocinaLista = list(cocina)
cocinaLista[0] = 'plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# del cocina # esto para elimnar una tupla

# Tipo set
planetas = {'Marte', 'Júpiter', 'Venus'}
print(len(planetas)) # Usamos la función len = lenght significa largo

# Revisar si un elemento existe dentro de set
print('Júpiter' in planetas)

# Agregar un elemento
planetas.add('Tierra') # add es una función
print(planetas)

# Elimnar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Júpiter') # Esta función ante un mal ingreso u inexistencia del elemento da error
print(planetas)
planetas.discard('tierra') # Esta función no nos presenta ningun error
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Elimnar set o conjunto
del planetas
print(planetas) # Al elimnar nos muestra fun error


# 'Maradona' :10 Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key, value)
diccionario = {
    'IDE':'Integrated Development Eviroment',
    'POO':'Programación Orienta a Objetos',
    'SABD':'Sistema de Administración de Base de Datos'
}
# Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario: # Recorremos mostrando solo las llaves 
    print(termino)

# Necesitamos una función para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): # Estamos usando una función
    print(termino) # Muestra solo las llaves

for valor in diccionario.values(): # Usamos una función para acceder al valor
    print(valor)

# Comprobar la existenia de algun elemento
print('IDE' in diccionario) # Devuelve un booleano

# Agregar un elemento 
diccionario['PK'] = 'Primary key'
print(diccionario)

# Elimnar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario 
diccionario.clear()
print(diccionario)

# Elimnar diccionario
del diccionario # El diccionario se borro

# Concatemos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2 # Concatenamos
print(lista3)

lista3.extend([7, 8, 9, 1]) # Función para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Función para ubicar en que indice esta el valor ingresado
# print(lista.index(0)) # Esto daría un error por no ser el elemtno parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner al rever una lista
lista3.reverse()
print(lista3)

# Para ue una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Métodos de ordenamiento, en Python es una función
lista3.sort() # Ordena los elementos ascendemente
print(lista3)
lista3.sort(reverse=True) # Ordena los elementos descendemente
print(lista3)

# Repaso de Tuplas
tupla = (4, 'Hola', 6.78, [1, 2, 78], 4, 'Hola') #Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) # Acción booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de tuplas son: index, count, len
# En tuplas se puede convertir de tupla a lista y de lista a tupla

#Repaso de set o conjunto
# para definir un conjunto
conjunto2 = set()
conjunto1 = {'bye', }
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1) # Preguntamos si el número 3 NO esta en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2) # Nos devuelve como respuesta un booleano

# Operaciones en conjuntos
conjunto3 = conjunto1 | conjunto2 # La línea une los dos conjuntos
print(conjunto2)

conjunto3 = conjunto1 & conjunto2 # Que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que esta en el conjunto1 y no en el conjunto2 
print(conjunto3)
conjunto3 = conjunto1 - conjunto2
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 # Elementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2 
print(conjunto2.issubset(conjunto3)) # Aquí preguntamos si un conjunto es un subconjunto dentro de otro subconjunto
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issubset(conjunto1)) # preguntamos si los elementos del conj8unto1 estan dentro del 3
print(conjunto3.issubset(conjunto2)) # Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issubset(conjunto3))

# Como saber si ambos conjuntos son disconexos, esto es si no comparten elemtnos en comun
print(conjunto1.isdisjoint(conjunto2)) # No hay cosas en comun

# Convertir un cojunto totalmente en inmutable
conjunto1 = frozenset # Esto hace que el conjutno sea totalmente inmutable
# No se puede agregar, modificar ni elimar elementos del conjunto

# Repaso Diccionarios
diccionarioNuevo = {'Azul': 'blue', 'Rojo': 'red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

# Como elimnar
del(diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferente tipos de datos
diccionario2 = {'Ariel': {'edad':40, 'Altura': 1.83}, 'Osvaldo': [45, 1.85], 'Natalia':[35, 1.67]}
print(diccionario2)
seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 millones', 'Posición': 'Extremo Derecho'},
    11: {'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 millones', 'Posición': 'Extremo Derecho'},
    24: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 millones', 'Posición': 'Media Punta'},
    19: {'Nombre': 'Nicolás Otamanedi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 millones', 'Posición': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 millones', 'Posición': 'Portero'},
    7: {'Nombre': 'Rodrigo de Paul', 'Edad': 28, 'Altura': 1.80, 'Precio': '40 millones', 'Posición': 'Mediocentro'},
    17: {'Nombre': 'Alejandro Darío Gómez', 'Edad': 34, 'Altura': 1.67, 'Precio': '6 millones', 'Posición': 'Mediocentro Ofensivo'},
    13: {'Nombre': 'Cristian Romero', 'Edad': 24, 'Altura': 1.88, 'Precio': '48 millones', 'Posición': 'Defensa Central'},
    3: {'Nombre': 'Nicolás Tagliafico', 'Edad': 30, 'Altura': 1.72, 'Precio': '11 millones', 'Posición': 'Lateral Izquierdo'}
}

for llave, valor in seleccionArgentina.items():
    print(llave, valor)

# Como tarea agregar por lo menos 4 jugadores más al diccionario: seleccionArgentina
print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1,2,3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
elementoBorrado = pila.pop() # Quita el último elemento y lo guarda en la variable
print(f'Sacamos el elemento: {elementoBorrado}')
print(f'La pila ahora quedo así: {pila}')

# Colas con listas
# Estructura de datos dedatos de tipo fifo(first input / first out)
cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

# Agregamos elementos al final de la cola
cola.append('Natalia')
cola.append('José')
print(cola)

# Sacamos elemntos de la cola
seRetira = cola.pop(0)
print(f'Atendiendo el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendiendo el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendiendo el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendiendo el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendiendo el cliente: {seRetira}')
print(cola)