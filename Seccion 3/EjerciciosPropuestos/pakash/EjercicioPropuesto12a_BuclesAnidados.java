package pakash;

import java.util.Scanner;

//Este programa hace un triángulo rectángulo con asteriscos, el usuario es quien elige el ancho

public class EjercicioPropuesto12a_BuclesAnidados {

	public static void main(String[] args) {
		//Inicializar variables
		Scanner input = new Scanner(System.in);
		int ancho;
		
		//Pedir datos al usuario
		System.out.println("¿De cuánto desea que sea el ancho?");
		ancho = input.nextInt();
		
		//Estructura Anidada
		for (int fila = 1; fila <= ancho; fila ++) {
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		
		
	}

}
