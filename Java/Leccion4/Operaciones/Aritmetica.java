package Leccion4.Operaciones;

public class Aritmetica {
    // Atributos de la clase
    static int a;
    static int b;

    // El constructor es un método especial
    public Aritmetica(){
        System.out.println("Se esta ejecuntado este constructor número uno");
    }

    // Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b) { // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecuntando este constructor número dos");
    }

    // Metodo
    public void sumarNumeros() {
        int resultado = a + b;
        System.out.println("Resultado = " + resultado);
    }

    public int sumarConRetorno() {
        // int resultado = a + b;
        return this.a + this.b;
    }

    public int sumarconArgumentos(int a, int b){
        this.a = a; // El argumento a se asigna al atributo this.a
        this.b = b;
        // return a + b;
        return sumarConRetorno();
    }
}