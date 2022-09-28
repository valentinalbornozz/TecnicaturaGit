package Leccion2.EjercicioCiclos07;

import javax.swing.JOptionPane;

public class EjercicioCiclos07 {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        Float promedio = (float) 0;
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        while (numero >= 0) { // Mientras el número sea negativo
            suma += numero;
            conteo++;
            System.out.println("Digite otro número: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        if(conteo==0){
            JOptionPane.showMessageDialog(null,"Error, La división entre cero no existe");
        }
        else {
            promedio = (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        }
    }    
}
