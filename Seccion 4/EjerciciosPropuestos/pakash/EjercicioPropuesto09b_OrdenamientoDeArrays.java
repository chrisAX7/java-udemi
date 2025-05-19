package pakash;

import java.util.Scanner;

/*Programa que ordena los elementos de un array de enteros, ya sea de menor a mayor o viceversa.*/

public class EjercicioPropuesto09b_OrdenamientoDeArrays {

	public static void main(String[] args) {
		
		//ENTRADA
		Scanner input = new Scanner(System.in);
		int numeros[];
		System.out.println("Indique la longitud del array:");
		int longitud = input.nextInt();
		numeros = new int[longitud];
		
		//carga del vector
		System.out.println("Ingrese los " + longitud + " números que solicitó:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextInt();
		}
		
		
		//PROCESO
		for (int i = 0; i < numeros.length - 1; i++) 
		{
			for (int j = i+1; j < numeros.length; j++) 
			{
				if(numeros[i] < numeros[j])
				{
					int auxiliar = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = auxiliar;
				}
			}
		}
		
		
		//SALIDA
		
		//recorrido del vector
		System.out.println("Los números ordenados de mayor a menor son:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		//cierre
		input.close();
	}

}
