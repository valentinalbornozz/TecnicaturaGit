package Leccion4.Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
      var a = 10; //Variables locales
      int b = 7; //Memoria Stack
      miMetodo(); //Llamamos el método nuevo
      Aritmetica aritmetica1 = new Aritmetica();
      aritmetica1.a = 3;
      aritmetica1.b = 7;
      aritmetica1.sumarNumeros();
      
      // Para  alamacenar un objeto o los atributos se utiliza la memoria heap
      int resultado = aritmetica1.sumarConRetorno();
      System.out.println("Resultado = "+ resultado);

      resultado = aritmetica1.sumarconArgumentos(12, 26);
      System.out.println("Resultado usando argumentos = "+ resultado);

      System.out.println("Aritmetica1 a: "+aritmetica1.a);
      System.out.println("Aritmetica1 b: "+aritmetica1.b);

      Aritmetica aritmetica2 = new Aritmetica(5, 8);
      System.out.println("Aritmetica2 = "+aritmetica2.a);
      System.out.println("Aritmetica2 = "+aritmetica2.b);
      //aritmetica1 = null; nunca utilizar esto, no de debe hacerse
      //System.gc(); método para limpiar residuos, es pesado, no utilizar
      Persona persona = new Persona("Ariel", "Betancud");
      System.out.println("persona =" + persona);
      System.out.println("Persona nombre: "+persona.nombre);
      System.out.println("Persona apellido: "+persona.apellido);
    }   

    // Modularidad creamos un nuevo método
    public static void miMetodo(){
      // a = 10; // Una variable esta limitada
      System.out.println("Aqui hay otro método");
    }


}

// Creamos una nueva clase
class persona {
  String nombre;
  String apellido;

  persona(String nombre, String apellido){ // Constructor
    super(); // Llamada al constructor de la clase Padre object
    // Imprimir imprimir = new Imprimir();
    new Imprimir(). imprimir(this);
    this.nombre = nombre;
    this.apellido = apellido;
    System.out.println("Objeto persona usando this: "+this);
  }
}

class Imprimir{
  public Imprimir(){
    super(); // El constructor de la clase padre, para reservar memoria
  }

  public void imprimir(persona Persona) {
    System.out.println("Persona desde la clase imprimir: "+persona);
    System.out.println("Impresión del objeto actual (this)"+this);
  }

}
