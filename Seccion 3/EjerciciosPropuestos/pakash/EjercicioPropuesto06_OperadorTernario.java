package pakash;

import java.util.Scanner;

public class EjercicioPropuesto06_OperadorTernario {
/*Programa que indica si un número es múltiplo de 3 utilizando el operador ternario*/
	
	public static void main(String[] args) {
		
		//Inicializando las variables
		Scanner input = new Scanner(System.in);
		int num;
		String condicion;
		
		//Pidiendo datos al usuario
		System.out.println("Escriba un número:");
		num = input.nextInt();
		
		//Utilizando el operador ternario
		condicion = (num % 3 == 0) ? "Es múltiplo de 3":"No es múltiplo de 3";
		
		//Salida por pantalla
		System.out.println(condicion);
		
		//Cierre
		input.close();
	}

}
