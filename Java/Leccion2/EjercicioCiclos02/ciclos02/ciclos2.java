package Leccion2.EjercicioCiclos02.ciclos02;

import javax.swing.JOptionPane;

public class ciclos2 {
    public static void main(String[] args) {


        var numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        while(numero != 0){
            if(numero > 0){
               JOptionPane.showMessageDialog(null, "El número "+numero+" es POSITIVO");
            }
            else {
                JOptionPane.showMessageDialog(null, "El número "+numero+" es NEGATIVO");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        }
        JOptionPane.showMessageDialog(null, "El número "+numero+" finaliza el programa");
    }
}
