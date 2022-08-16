print('Comprobamos que año es bisiesto')
respuesta = 1
while respuesta == 1:
    a = int(input('Ingresar el año a comprobar: '))
    if (a % 4 == 0) and (a % 100 != 0) or (a % 400 == 0):
        print('El año es bisiesto')
    else:
        print('El año no es bisisto')
    respuesta = int(input('¿Desea continuar? (1-SI / 2-NO): '))

