package Leccion1.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double promedio;
		System.out.println("Digite las 3 calificaciones: ");
		nota1 = Double.parseDouble(entrada.nextLine());
		nota2 = Double.parseDouble(entrada.nextLine());
		nota3 = Double.parseDouble(entrada.nextLine());
		promedio = (nota1+nota2+nota3)/3;
		if (promedio<=70) {
			System.out.println("El alumno esta aprobado: "+promedio);
		} else {
			System.out.println("El alumno esta desaprobado: "+promedio);
		}
	}    
}
