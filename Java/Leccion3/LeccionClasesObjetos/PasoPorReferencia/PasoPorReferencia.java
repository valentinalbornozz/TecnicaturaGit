// Paso Por referencia
package Leccion3.LeccionClasesObjetos.PasoPorReferencia;

import javax.annotation.processing.ProcessingEnvironment;

import Clases.Persona; 

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ester";
        System.put.println("persona1 nombre = "+ persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: " + persona1.nombre);
    }
    public static void cambiarValor(Persona persona) { //Paso por referencia
        persona.nombre = "María";
    }

    public static Persona cambiarElValor(Persona persona){
        if(persona == null){
            System.out.println("Valor de persona es invalido: Null");
            return null;
        }
        else {
            persona.nombre = "Mónica";
            return persona;
        }
    }
}
