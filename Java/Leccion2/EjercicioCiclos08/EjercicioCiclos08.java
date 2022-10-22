package Leccion2.EjercicioCiclos08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjercicioCiclos08 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int i = 1;
        while(i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++
        }
    }
}
