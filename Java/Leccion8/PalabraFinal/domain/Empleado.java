package Leccion8.PalabraFinal.domain;

public class Empleado extends Persona{
    @Override
    public void imprimir(){
        System.out.println("Método imprimir desde la clase hija");
    }
}