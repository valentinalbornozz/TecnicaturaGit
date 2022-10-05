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
    }    

    public static void miMetodo(){
      // a = 10; // Una variable esta limitada
      System.out.println("Aqui hay otro método");
    }


}
