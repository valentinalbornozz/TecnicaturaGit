package Leccion2.EjercicioCiclos12;

import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        // System.out.printIn("Digite un número: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        for(int i=1; i<=numero;i++) {
            factorial *= i;
        }
        //System.out.printIn("\nEl factorial del número ingresado es: "+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del número ingresado es: "+facorial);
    }
}
