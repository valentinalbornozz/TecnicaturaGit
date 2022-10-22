package Leccion5.ContextoEstatico.domain;

public class Persona {
    public static int getContadorPersona() {
        retun contadorPersona;
    }
    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }
    // Cargamos los atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;

    // Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // No utilizar el operador this
        // Vamos a asignar un nuevo valor a la variable
        This.idPersona = Persona.contadorPersona;
    }
    
    public int getIdPersona() {
        return idPersona;
    }
    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}
