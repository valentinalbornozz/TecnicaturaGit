# Comenzamos con Funciones
# mi_funcion() # No se puede llamar antes de definir una función 
# Definimos una función
def mi_funcion(): # Para identificar a la función utilizamos paréntesis
    print('Saludos a todos lo alumnos de la Tecnicatura')

mi_funcion() # Estamos llamando a la función
mi_funcion() # Se puede llamar a una función N cantidad de veces

# Desemaquetado de listas o list unpacking 
def show(name, lastName):
    print(name+' '+lastName)
    person =["Ariel", "Betancud"]
    show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a función
    show(*person) #Esto es lo mismo que lo anterior pero le pasamos todo junto
    person2 = ("Osvaldo", Giordanini) # Desempaquetamos a través de una tupla
    show(*person2)
    persona3 = {"lastName": "Lucero", "name": "Natalia"}
    show(**person3)

    numbers = [1, 2, 3, 4, 5] # Aun con el la lista vacia se va a ejecutar el else
    for n in numbers:
        print(n)
        if n == 3:
            break # Esta es la unica manera para que no se ejecute el else
        else:
            print('Esto se termino')


# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == 'P'] # Esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "Country": "Arg"},
            {"name": "Corona", "Country": "Mx"},
            {"name": "Stella Artois", "Country": "Belgium"}]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumentos (funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos lo que ven a través del canal de Youtube")
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Jorge', 'Lucero')
mi_funcion2('Ariel', 'Betancud')
mi_funcion2('Analia', 'Pedrosa')

#La palabra return en funciones
# Creamos una función para sumar
def sumar(a,b):
    return a+b
# resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado})
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar(a = 0, b = 0): # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22,66)}')


# Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listaNombres('Lucas', 'Jose', 'Claudia', 'Rosa', 'Maria')
listaNombres('Marcos', 'Daniel', 'Romina', 'Pepe', 'Marcela', 'Carlos')

def listarTerminos(): # No recibe nada, nada se va a mostrar
    listarTerminos(IDE='Integrated Develment Enviroment', PK='Primaruy Key')
    listarTerminos(Nombre='Leonel Messi')


def desplegarNombres(nombres):
    desplegarNombres(nombres2)
    desplegarNombres('Carla')
    # desplegarNombres(10, 11) # No es un objeto iterable
    desplegarNombres((10, 11)) # La convertimos a un tupla
    desplegarNombres([22, 55]) # La converitmos en una lista


# Funciones Recursivas
def factorial(numero):
    if numero == 1: # Caso Base
        return 1
    else:
        return numero * factorial(numero-1) # caso Recursivo

resultado = factorial(5) # Lo hacemos en código duro
print(f'El factorial del número 5 es: {resultado}')