## lista = Ariel, Liliana, Natalia, Osvaldo

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