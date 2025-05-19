package pakash;

import java.util.Scanner;

/*Programa que crea un metodo para rellenar, otro para ordenar y otro para mostrar un array,
 *utilizando una variable local*/

public class EjercicioPropuesto04b_VariablesGlobalesYLocales {
	
	//Funcion para rellenar un array
	public static int[] rellenarArray()
	{
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = input.nextInt();
		}
		input.close();
		return array;
	}
	//Funcion para ordenar un array
	public static void ordenar(int[] array)
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array.length - i - 1; j++) 
			{
					if (array[j] > array[j+1]){
						int auxiliar = array[j];
						array[j] = array[j+1];
						array[j+1] = auxiliar;
					}
				}
			}
		}
	
	//Funcion para mostrar un array
	public static void mostrar(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Rellene el array:");
		int[] array = rellenarArray();
		ordenar(array);
		System.out.println("******************");
		System.out.println("Array ordenado:");
		mostrar(array);
	}

}
