package pakash;

import java.util.Scanner;

public class EjercicioPropuesto07_EstructuraWhile {

/*Este programa le pide al usuario que ingrese números enteros positivos y se detiene la ejecucion
 * cuando ingresa un número negativo*/

	public static void main(String[] args) {
		
		//Declarando las variables
		int num, suma=0;
		Scanner input = new Scanner(System.in);
		
		//Pidiendo datos al usuario
		System.out.println("Escriba un número entero positivo: ");
		num = input.nextInt();
		
		//Estructura while
		while (num>=0) {
			suma += num;
			System.out.println("Escriba otro número positivo: ");
			num = input.nextInt();
		}
	
		//Salida del ciclo
		System.out.println("Ustéd ha ingresado un número negativo.");
		System.out.println("la suma de los números es: " + suma);
		
		//Cierre
		input.close();
	}

}
