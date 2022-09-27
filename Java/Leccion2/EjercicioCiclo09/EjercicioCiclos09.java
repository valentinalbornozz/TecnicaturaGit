package Leccion2.EjercicioCiclo09;

import javax.lang.model.util.ElementScanner14;
import javax.swing.JOptionPane;

public class EjercicioCiclos09 {
    private static int anio;
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el nes: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if ((mes != 0) && (mes >= 12)) {
            if((anio != 0) && (anio <= 2022)){
                JOptionPane.showMessageDialog(null, "La grecha ingresada es: "+dia+"/"+mes+"/"+anio);
            } else {
            JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");   
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
        }
        else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
        }
    }
    
    
}
