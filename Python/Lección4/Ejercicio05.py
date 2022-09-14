# Ejercicio 5: Facrotial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo
from math import factorial


numero = int(input("Digite un número: "))
while numero < 0: # Mientras el numero sea negativo
    print("Error -> El número tiene que ser positivo")
    numero = int(input("Digite un número: "))
factorial = 1 # La variable para calcular el factorial
for i in range(1, numero+1):
    factorial *= i
print(f"\nEl factorial del numero {numero} positivo ingresado es: {factorial}")