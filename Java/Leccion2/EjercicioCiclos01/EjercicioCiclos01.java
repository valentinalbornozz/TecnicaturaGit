package Leccion2.EjercicioCiclos01;

import javax.swing.JOptionPane;

public class EjercicioCiclos01 {
    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0) {
            cuadrado = (int)Math.pow(numero,2);
            System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        System.out.println("El programa a finalizado por numero negativo");
    }
}
