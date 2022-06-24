contador = 0
suma = 0
while contador < 5:
    contador = contador + 1
    print(f"Salario del empreador {contador}")
    horas = int(input("Ingrese las horas trabajadas: "))
    tarifa = float(input("Ingrese la tarifa por hora: "))
    salario = horas * tarifa
    print(f"El salario es: ${salario}")
    suma = suma + salario
else:
    print(f"la suma de todos los salarios es:{suma}")