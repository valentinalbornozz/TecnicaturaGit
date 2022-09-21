package Leccion2.EjercicioCiclos02;

import java.util.Scanner;

public class EjercicioCiclos02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        var numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero > 0){
                System.out.println("El número "+numero+" es POSITIVO");
            }
            else {
                System.out.println("El número "+numero+" es NEGATIVO");
            }
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero "+numero+" finaliza el programa");
    }
}
