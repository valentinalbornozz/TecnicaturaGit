package Leccion5.ContextoEstatico.test;

import Leccion5.ContextoEstatico.domain.Persona;

public class PersonaPrueba {

    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador = 10; //No se puede referenciar desde un contexto estático
        PersonaPrueba personaP1 = new PersonaPrueba();
        System.out.println(personaP1.getContador());
    }
    
    static public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}

