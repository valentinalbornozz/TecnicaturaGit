package Leccion2.EjercicioCiclo04;

import javax.swing.JOptionPane;

public class EjercicioCiclos04 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        JOptionPane.showMessageDialog(null, "A Ingresado "+conteo+" números que no son negativos");
    }
}
