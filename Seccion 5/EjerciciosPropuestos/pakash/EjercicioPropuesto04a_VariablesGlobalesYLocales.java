package pakash;

import java.util.Scanner;

/*Programa que crea un metodo para rellenar, otro para ordenar y otro para mostrar un array,
 *utilizando una variable global*/
public class EjercicioPropuesto04a_VariablesGlobalesYLocales 
{
	static int longitud = 10;
	static int array[] = new int[longitud];
	static Scanner input = new Scanner(System.in);
	
	//Función para rellenar un array
	public static void rellenarArray()
	{
		for (int i = 0; i < array.length; i++) 
		{
			array[i] = input.nextInt();
		}
	}
	
	//Función para ordenar un array
	public static void ordenar()
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
	
	//Función para mostrar un array
	public static void mostrar()
	{
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Rellene el array:");
		rellenarArray();
		ordenar();
		System.out.println("*****************");
		mostrar();

	}

}
