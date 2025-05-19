package pakash;

import java.util.Scanner;

/*Programa que ordena los elementos de un array de enteros, ya sea de menor a mayor o viceversa.*/

public class EjercicioPropuesto09a_OrdenamientoDeArrays
{
	public static void main(String[] args)
	{
		//ENTRADA
		Scanner input = new Scanner(System.in);
		int[] numeros;
		System.out.println("¿Cuántos números desea ingresar?");
		int longitud = input.nextInt();
		numeros = new int [longitud];
		
		//carga de vectores
		System.out.println("Ingrese los " + longitud + " que solicitó:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextInt();
		}
		
		
		//PROCESO	
		for (int i = 0; i < numeros.length  - 1; i++) {
			
			for (int j = 0; j < numeros.length - i - 1; j++) {
			
				if (numeros[j] > numeros[j+1]) {
				
					int auxiliar = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = auxiliar;
				}
			}
		}
		
		
		//SALIDA
		System.out.println("Los números ordenados de menor a mayor son:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		//cierre
		input.close();
	}

}
