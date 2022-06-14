package Leccion1.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Ejercicio rectangulo
        Scanner entrada = new Scanner(System.in);

        int ancho, alto;

        System.out.println("Digite el alto del rectángulo:");
        alto = Integer.parseInt(entrada.next());

        System.out.println("Digite el ancho del rectángulo:");
        ancho = Integer.parseInt(entrada.next());

        int area = ancho * alto;
        int perimetro = (ancho + alto) * 2;

        System.out.println("");
        System.out.println("Resultado: " + "\n" + "Area: " + area + "\n" + "Perimetro: " + perimetro);

        // Ejercicio 2 - El mayor de 2 números

        System.out.println("Ingrese el primer numero a comparar");
        int num1 = Integer.parseInt(entrada.next());
        System.out.println("Ingrese el segundo numero a comparar");
        int num2 = Integer.parseInt(entrada.next());

        boolean ternario = (num1 > num2);
    }
}
