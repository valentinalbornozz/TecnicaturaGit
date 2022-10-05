package Leccion1.Ejercicio10;

import javax.swing.JOptionPane;

public class EjercicioCiclos10 {
    int numero, suma = 0;
        for(int i =1; i<=10; i++){
            numero = Integer.parseInt (JOptionPane.showInputDialog("Digite un número: ");
            suma += numero;
        }
       JOptionPane.showMessageDialog((null, "La suma de todos los números es: "+suma));
}
