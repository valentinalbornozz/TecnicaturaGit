package Leccion2.EjercicioCiclo09;

import java.util.Scanner;

public class Ciclos09 {
    private static int anio;

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el dia: ");
        int dia = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el mes: ");
        int mes = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el año: ");
        int anio = Integer.parseInt(entrada.nextLine());
        if ((mes != 0) && (mes >= 12)) {
            if((anio != 0) && (anio <= 2022)){
                System.out.println("La fecha ingresada es: "+dia+"/"+mes+"/"+anio);
            }
            else {
             System.out.println("Fecha incorrecta, año incorrecto");   
            }
        } else {
            System.out.println("Fecha incorrecta, mes incorrecto");
        } else {
            System.out.println("Fecha incorrecta, día incorrecto");
        }
    }
}