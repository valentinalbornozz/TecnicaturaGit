nElementos = int(input('Cantidad de elemtos: '))
par = 0
impar = 0
contador = 0
if nElementos != 0:
    for i in range(nElementos):
        num = int(input(f'{i+1}. Indicar número: '))
        if num % 2 == 0:
            par += num
            contador += 1
        else:
            impar += num
    print(f'Suma de números pares: {par}\n'
          f'Cantidad de número pares: {contador}\n'
          f'Promedio de números impares: {impar / nElementos}')
else:
    print('No se digitó ningun elemento')