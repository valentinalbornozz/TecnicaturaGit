'''
Ejercicio 2:
Determinar la solución lógica de la siguiente operación.

((3 + 5 x 8 ) < 3 and ((- 6/3 x 4 ) + 2 < 2)) or ( a > b)

'''
a = input('Dijite el valor de "a": ')
b = input('Dijite el valor de "b": ')
if ((3 + 5 * 8) < 3 and ((- 6/3 * 4) + 2 < 2)) or (a > b):
    print('Condicion Verdadera')
else:
    print('Condicion Falsa')
