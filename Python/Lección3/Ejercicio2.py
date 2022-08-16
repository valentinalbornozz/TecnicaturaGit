cantidadN = int(input('Indique la cantidad de números a sumar: '))
suma = 0
for i in range(cantidadN+1):
    suma += i
print(f'La suma es {suma}')