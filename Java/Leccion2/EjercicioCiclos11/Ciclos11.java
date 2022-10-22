package Leccion2.EjercicioCiclos11;

public class Cilos11 {
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i<=20;i+=2){ // El aumento apunto a solor ir por los impares
            producto *= i;
        }
    }
    JOptionPane.ShowMessageDialog(null, "El producto de los números impares es: "+producto);
}
