package Leccion1.Ejercicio9;

import java.util.Scanner;

public class Ciclos09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el día: ");
        int dia = Integer.parseInt(entrada.nextLine())
        System.out.println("Digite el día: ");
        int mes = Integer.parseInt(entrada.nextLine())
        System.out.println("Digite el día: ");
        int anio = Integer.parseInt(entrada.nextLine())
        if ((dia != 0 ) && (dia <= 30)) {
            if((mes != 0 ) && (mes <= 12)){
                System.out.println("La fecha ingresada es: "+dia);
            }
            else {
                System.out.println("Fecha incorrecta, año incorrecto");
            }
            else {
                System.out.println("Fecha incorrecta, mes incorrecto");
            }
        }
        else {
            System.out.println("Fecha Incorrecta, día incorrecto");
        }
    }
}
