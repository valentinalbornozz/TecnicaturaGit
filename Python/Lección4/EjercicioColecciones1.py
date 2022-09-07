# Ejercicio1: Elimar duplicados de lista
# Escriba un programa donde tenga una lista que a continuación
# elimine los elementos repetidos, por último mostrar la lista

# Creamos una lista
lista = [1,2,3, "Ariel", 7,7,3, "Alberto", 1, "Ariel", 2, "Alberto"]
# Conjunto = set(lista) # Convertimos la lista a un conjunto del tipo set
# lista = list(conjunto) # Convertimos el conjunto a una lista
lista = list(set(lista)) # La conversión hecha en una sola línea de ocdigo(eficiente)
print(lista)