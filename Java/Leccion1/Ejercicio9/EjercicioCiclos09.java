package Leccion1.Ejercicio9;

import javax.swing.JOptionPane;

public class EjercicioCiclos09 {
    public static void main(String[] args) {
        System.out.println(JOptionPane.showInputDialog("Digite el día: "));
        System.out.println(JOptionPane.showInputDialog("Digite el día: "));
        System.out.println(JOptionPane.showInputDialog("Digite el día: "));
        if ((dia != 0 ) && (dia <= 30)) {
            if((mes != 0 ) && (mes <= 12)){
                JOptionPane.showMessageDialog(null, args);(null,"La fecha ingresada es: "+dia);
            }
            else {
                JOptionPane.showMessageDialog("Fecha incorrecta, año incorrecto");
            }
            else {
                JOptionPane.showMessageDialog("Fecha incorrecta, mes incorrecto");
            }
        }
        else {
            JOptionPane.showMessageDialog("Fecha Incorrecta, día incorrecto");
        }
    }
}
