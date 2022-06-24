num = 0

while (num <= 0):
    num = int(input("Ingrese un numero mayor a 0: "))

i = 1
fact = 1

while(i != num+1):
    fact = fact * i
    i += 1

print(f"El factorial de {num} es = {fact}")