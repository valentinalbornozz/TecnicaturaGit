package Leccion10.Matrices.Matriz_Ejercicio_7;

public class Matriz_Ejercicio_7 {
    public static void main(String[] args) {
        int Matriz[][] = new int [5][5];

        System.out.println("Rellenando la matriz: ");
        for(int i=0; i<7;i++){
            for(j=0;j<5;j++){
                if(i==0 || i==4){
                    Matriz[i][j] = 1;
                }
                else if(j==0||j==4){
                    Matriz[i][j]= 1;
                }
                else{
                    Matriz[i][j]=0; // No hace falta porque siempre empiezan en 0
                }
            }
        }

        System.out.println("La matriz es: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.println(Matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
