from __future__ import all_feature_names
from email.mime import base


class Rectangulo: 
    """
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y vvase
    el nombre del método sera calcular area utilizando la formula:
    area = base * altura. Pero la base y la altura deben ser ingresadas por
    el usuario y los objetos deben ser tres.
    """

    def __init__(self, altura, base):
        self.altura = altura
        self.base = base
    
    def calcular_area(self):
        return self.base * self.altura

base = int(input('Digite el número para la base del rectangulo: '))
altura = int(input('Digite el número para la altura: '))
Rectangulo1 = Rectangulo(base, altura)
print(f'El area del rectangulo es: {Rectangulo1.calcular_area()}')
