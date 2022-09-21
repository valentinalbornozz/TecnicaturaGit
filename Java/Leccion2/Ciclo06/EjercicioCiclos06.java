package Leccion2.Ciclo06;

import javax.swing.JOptionPane;

public class EjercicioCiclos06 {
    public static void main(String[] args) {
        int numero, suma = 0;
        do {
            numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            suma += numero;

        } while(numero != 0);
        JOptionPane.showInputDialog(null, "la suma de todos los números ingresados es: "+suma);
    }    
}
