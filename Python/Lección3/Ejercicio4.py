suma = 0
califacionBaja = 100
for i in range(10):
    califacion = int(input(f'{i+1} Dijite calificación: '))
    suma += califacion
    if califacion < califacionBaja:
        califacionBaja = califacion
promedio = suma/10
print(f'La calificaion promedio es: {promedio}\n'
      f'La Calificaión más baja es: {califacionBaja}')