package Leccion11.test;

import Leccion11.Ventas.Orden;
import Leccion11.Ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29900.00);
        Producto producto3 = new Producto("Remera", 5000.00);
        Producto producto4 = new Producto("Zapatillas", 45000.00);
        Producto producto5 = new Producto("Anteojos", 40000.00);
        Producto producto6 = new Producto("Anteojos de sol", 60000.00);
        Producto producto7 = new Producto("Somier", 200000.00);
        Producto producto8= new Producto("Ventilador", 25000.00);
        Producto producto9 = new Producto("Ukulele", 35000.00);
        Producto producto10 = new Producto("Guitarra", 150000.00);

        Orden orden1 = new Orden();
        // Agregamos producots al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        // Agregamos producots al arreglo
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.mostrarOrden();
        Orden orden3 = new Orden();
        // Agregamos producots al arreglo
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto7);
        orden3.agregarProducto(producto8);
        orden3.mostrarOrden();
        Orden orden4 = new Orden();
        // Agregamos producots al arreglo
        orden4.agregarProducto(producto9);
        orden4.agregarProducto(producto10);
        orden4.mostrarOrden();
        
    }
}
