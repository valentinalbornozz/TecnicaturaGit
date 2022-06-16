 nPositivos = 0
 nNegativos = 0
 nNeutros = 0
 for i in range(10):
    num = int(input('Dijite un número: '))
    if num == 0:
        nNeutros += 1
    elif num > 0:
        nPositivos += 1
    else:
        nNegativos += 1
 print(f'La cantidad e números positivos es: {nPositivos}'
      f'\nLa cantidad e números negativos es: {nNegativos}'
      f'\nLa cantidad e números neutros es: {nNeutros}')