package Leccion9.Arreglos.Arreglos_Ejercicio_14;
import java.util.Scanner;
public class Arreglos_Ejercicio_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = true;

        System.out.println("Llenar el primer arreglo: ");
        do{
                for(int i=0; i<10; i++){
                            System.out.print((i+1)+". Digite un numero: ");
                }
                // Comprobamos si el arreglo esta ordenado
                for(int i=0; i<9; i++){
                            if(a[i] < a[i+1]) {//Creciente 1-2-3
                                creciente = true;
                            }
                }
                            if(a[i] > a[i+1]){//Decreciente 1-2-3
                                creciente = false;
                                break;
                            }
                if(creciente == false){
                        System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
                }
        }while(creciente == false);
        System.out.println("Llenar el segundo arreglo: ");
        do{
                for(int i=0;i<10;i++){
                        System.out.print((i+1)+". Digite un numero: ");
                        b[i] = entrada.nextInt();
                }
                for(int i= 0; i<9; i++){
                        if(b[i] < b[i+1]){
                            creciente = true;
                        }
                        if(b[i] > b[i+1]){
                            creciente = false;
                            break;
                        }
                        if(creciente == false){
                                System.out.println("\nEl arreglo esta desordenado, vuelva a digitar: ");
                        }
                }
        }while(creciente == false);

        int i= 0; // Iterador i para el arreglo a
        int j= 0; // Iterador j para el arreglo b
        int k= 0; // Interador k para el arrelgo c

        while(i<10 && j<10){
                if(a[i] < b[j]){  // Si el elemtno de a es menor a b 
                        c[k] = a[i]; // Copiamos el elemento de a
                        i++; // Avanzamos una posición en a
                }
                else{
                        c[k] = b[j]; //Copiamos el elemento de b
                        j++; //Avanzamos una posición más en b
                }
                k++; //Avanzamos una posición más en c
        }

        //Cuando salimos del while es porque un arreglo(a o b), se a copiado completamente
        if(i==10){ //significa que ya copiamos todo el arrreglo a, falta el b
            while(j<10){ //Mientras el iterador sea menor a 10
                    c[k] = b[j]; //Copiamos el elemtno de b en c
                    j++;
                    k++;
            }
        }
        else{ //Significa que ya copiamos todo el arreglo b, falta el a
            while(i<10){
                c[k] = a[i];
                i++;
                k++;
            }
        }

        System.out.println("\nEl arreglo c completo es: ");
        for(k=0; k<20; k++){
                System.out.print(c[k]+" - ");
        }

        System.out.println();
    }
    

}
