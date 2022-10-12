class Aritmetica:
    """
    El nombre de este tipo de comentario es: DocString
    esto es documentación de la clase en python
    vamos a hacer en esta clase algunas operaciones de: suma, resta, multiplicación y más
    """

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    
    # Método para sumar 
    def sumar(self):
        return self.operandoA + self.operandoB
    def resta(self):
        return self.operandoA + self.operandoB
    def mult(self):
        return self.operandoA + self.operandoB
    def sumar(self):
        return self.operandoA + self.operandoB

Aritmetica1 = Aritmetica(7, 9) # Le pasamos los argumentos para los operandos
print(Aritmetica1.sumar())
print(f'la resta de los números es: {Aritmetica1.sumar()}')
print(f'la resta de los números es: {Aritmetica1.resta()}')
print(f'La multiplicación de {Aritmetica1.multiplicar()} ')
print(f'La división de los números es: {Aritmetica1.dividir():.2f} ')

        