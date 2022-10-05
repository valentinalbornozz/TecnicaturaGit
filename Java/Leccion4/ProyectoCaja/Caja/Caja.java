package Leccion4.ProyectoCaja.Caja;

public class Caja { // Clase publica caja
    // Atributos(Caracteristicas)
    int ancho;
    int alto;
    int profundo;
    // Métodos y constructores(acciones)
    public caja(){ //Constructor1 = vacio
    }
    //Constructor con parámetros
    public caja(int ancho, int alto, int profundo){ //Constructor2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int CalcularVolumen(){ //Método para clacular
        return ancho * alto * profundo;
    }
}
