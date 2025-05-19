package pakash;

import java.util.Scanner;

public class EjercicioPropuesto08_EstructuraDoWhile {

/*Programa que le pide al usuario que ingrese números enteros positivos, el programa deja de 
 *ejecutarse cuando el usuario ingrese 5 números o cuando ingrese un número negativo*/	
	
	public static void main(String[] args) {
		
		//Declarando las variables
		Scanner input = new Scanner(System.in);
		int num , contador=0, suma = 0;
		
		//Estructura
		do {
			//Pidiendo datos al usuario
			System.out.println("Ingrese un número positivo");
			num=input.nextInt();
			contador++;
			//Condición para sumar solo los positivos
			if (num >=0) {
				suma += num;
			}
		} while ((num >= 0) && (contador<5));
		
		//Salida del ciclo
		System.out.println("La suma de los números ingresados es: " + suma);
		
		//Cierre
		input.close();
	}

}
