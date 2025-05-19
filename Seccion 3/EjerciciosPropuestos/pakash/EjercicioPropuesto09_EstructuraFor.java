package pakash;

import java.util.Scanner;

public class EjercicioPropuesto09_EstructuraFor {

	public static void main(String[] args) {
		
		//Declarar variables
		Scanner input = new Scanner(System.in);
		int num = 0, i, suma = 0;
		double promedio;
		
		//Pidiendo datos al usuario
		System.out.println("Ingrese 10 números");
		
		//Estructura for
		for(i=1 ; i<=10 ; i++) {
			System.out.print("Número " + i + ": ");
			num = input.nextInt();
			suma += num;
		}
		
		//Salida del ciclo
		promedio = (double)suma / 10;
		System.out.printf("El promedio de los números ingresados es %01.1f ", promedio );		

	}

}
