package pakash;

import java.util.Scanner;

/*En este programa se pone en práctica la clase Scanner mediante un ejercicio que le pide al 
 * usuario su nombre completo, edad y estatura. */

public class EjercicioPropuesto12_EntradaDeDatos {
	
	//Programa principal
	public static void main(String[] args) {
		
		//Declarando las variables
		Scanner input = new Scanner(System.in);
		String nombre;
		int edad;
		float estatura;
		
		//Pidiendo datos al usuario
		System.out.println("Ingrese su nombre:");
		nombre = input.nextLine();
		System.out.println("Ingrese su edad:");
		edad = input.nextInt();
		System.out.println("Ingrese su estatura:");
		estatura = input.nextFloat();
		
		//Imprimiendo los datos por pantalla
		System.out.printf("Te llamás %s, tenés %d años y medís %1.2f metros de altura", nombre, edad, estatura);
		
		//Cierre
		input.close();
	}

}
