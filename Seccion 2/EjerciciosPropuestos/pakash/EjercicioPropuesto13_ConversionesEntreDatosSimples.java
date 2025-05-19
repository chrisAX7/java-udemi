package pakash;

import java.util.Scanner;

/*Programa que pide dos números enteros para dividirlos y esa division mostrarla como un número 
 * real, luego hacer lo mismo pero antes pedir los dos números como una cadena de
 * texto y transformarlos a enteros*/

public class EjercicioPropuesto13_ConversionesEntreDatosSimples {

	//Programa principal
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		//Pidiendo datos al usuario
		System.out.println("Ingrese un número:");
		num1 = input.nextInt();
		System.out.println("Ingrese otro número:");
		num2 = input.nextInt();
		
		//Haciendo la operación
		double division = (double)num1 / num2;
		System.out.printf("El resultado de dividir ambos números es %01.2f", division);
		System.out.println("\n");
		
		//Repitiendo el programa almacenando los numeros en cadenas de texto antes 
		String texto;
		int num3, num4;
		
		//Pidiendo datos al usuario
		input.nextLine(); // Esta linea es importante, ya que la instruccion que aparece es la unica que lee los espacios y los intros
		System.out.println("Ingrese un número para convertir");
		texto = input.nextLine();
		num3 = Integer.parseInt(texto);
		System.out.println("Ingrese otro número para convertir");
		texto = input.nextLine();
		num4 = Integer.parseInt(texto);
		
		//Haciendo la operación
		double divTexto = (double)num3 / num4;
		System.out.printf("El resultado de dividir ambas cadenas de texto transformadas en enteros es %01.2f", divTexto);
		
		//Cierre
		input.close();
	}

}
