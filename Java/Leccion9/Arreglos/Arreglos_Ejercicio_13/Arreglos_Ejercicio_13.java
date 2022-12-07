package Leccion9.Arreglos.Arreglos_Ejercicio_13;

import java.util.Scanner;

public class Arreglos_Ejercicio_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int conteo_pares=0, conteo_impares=0;

        System.out.println("Llenar arreglo: ");
        for(int i=0; i<10;i++){
            System.out.println(i+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
            

            if(arreglo[i] %2 ==0){ //Contamos para crear los arreglos
                conteo_pares++;
            }
            else{
                conteo_impares++;
            }
        }

        System.out.println("\nArreglo ingreso: ");
        for(int i=0; i<conteo_pares;i++){
                System.out.println(par[i]+" - ");
        }
        System.out.println("\nArreglo ingreso: ");
        for(int i=0; i<conteo_impares;i++){
                System.out.println(impar[i]+" - ");
        }

        System.out.println();
    }
}
