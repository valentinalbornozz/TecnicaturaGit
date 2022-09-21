package Leccion2.Ciclo05;

import javax.swing.JOptionPane;

public class EjercicioCiclos05 {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*1000); //Esto genera un número aleatorio
        do { 
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if(numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un número mayor");            }
            else if(numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "Digite un número menor");
            }
            else {
                JOptionPane.showMessageDialog(null, "¡¡¡ FELICIDADES!!! Has adivinado el número");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinistes el número en: "+conteo+" intentos");

    }
}
