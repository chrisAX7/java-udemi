package pakash;

import java.util.Scanner;

public class EjercicioPropuesto11_RecomendacionesCiclos {

	public static void main(String[] args) {

		//Declarar variables
		int num = 0, divisores = 0;
		Scanner input = new Scanner (System.in);
		
		//Pedir datos al usuario
		System.out.println("Ingrese un número entero: ");
		num = input.nextInt();
		
		//Contar divisores
		for (int i=1; i <= num; i++) {
			if (divisores % i == 0) {
				divisores++;
			}
		}
		
		//Si tiene 2 divisores es primo
		if (divisores == 2  || num == 2) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		//Cierre
		input.close();
	}

}
