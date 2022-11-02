package Leccion5.ContextoEstatico.test;

import domain.Persona;

public class PersonaPrueba {

    private int contador;
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 = " + persona1);
        Persona persona1 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        // this.contador = 10; // No se puede referenciar desde un contexto estatico
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    static public void imprimir(Përsona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
