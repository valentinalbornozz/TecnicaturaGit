package Leccion1.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
		double num1;
		double num2;
		double resultado;
		System.out.println("Digite dos números: ");
		num1 = Double.parseDouble(entrada.nextLine());
		num2 = Double.parseDouble(entrada.nextLine());
		if (num1==num2) {
			resultado = num1*num2;
		} else {
			if (num1>=num2) {
				resultado = num1-num2;
			} else {
				resultado = num1+num2;
			}
		}
		System.out.println("El resultado es: "+resultado);
	}    
}

