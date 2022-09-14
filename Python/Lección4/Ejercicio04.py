# Ejercicio4: sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro
# de un rango, por ejmplo:
#                           Suma de nu´meros pares del 2 al 30
#                           suma = 240
from re import I


a = int(input("Digite de donde va a comenzar la suma: "))
b = int(input("Digite hasta donde quiere llegar a sumar: "))
suma = 0
for i in range(a,b+1):
    if i % 2 == 0: # Esto es si el número es par
        suma += I
print(f"\nLa suma de números pares dentro del rango es: {suma}")