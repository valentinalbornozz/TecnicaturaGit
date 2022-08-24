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