package Leccion2.EjercicioCiclos08;

public class Ciclos08 {
    Scanner entrada = new Scanner(System.in)
        System.out.println("Digite un número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while(i <= numero){
            System.out.println(i);
            i++
        }
}
