package Leccion9.Arreglos.Arrgelos_Ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float negativos = 0, positivos=0, mediaNegativos, mediaPositvos;
        int conteo0=0, conteo_negativos=0, conteo_positivos=0;

        System.out.println("Guardando los datos en el arreglo");
        for(int i=0; i<5; i++){
            System.out.println((i+1))+". Digite un numero: ";
            numeros[i] = entrada.nextFloat();
        }
            if(numeros [i] > 0){
                positivos += numeros[i];
                conteo_positivos++;
            }
            else if(numeros[i] < 0){
                negativos += numeros[i];
                conteo_negativos++;
            }
            else{
                conteo0++;
            }
        if(conteo_positivos == 0){
            System.out.println("\nNo se puede sacar la media de los numeros positivos");
        }
        else{
            mediaPositvos = positivos/conteo_positivos;
            System.out.println("\nLa media de los numeros positivos es: "+mediaPositvos);
        }
        if(conteo_negativos == 0){
            System.out.println("\nNo se puede sacar la media de los numeros negativos");
        }
        else{
            mediaPositvos = positivos/conteo_positivos;
            System.out.println("\nLa media de los numeros negativos es: "+mediaNegativos);
        }

        System.out.println("La cantidad de cero es: " + conteo0);
        //Ingresar: 2,-5,6,2,0
    }
}
