package pakash;

import java.util.Scanner;

/*Programa que crea una función para calcular promedios solicitando datos de tipo entero al usuario
 *y devolver el resultado como un "float".*/

public class EjercicioPropuesto02_Return 
{
	//Función para calcular promedio
	public static float calcularPromedio(int tamanioArray)
	{
		Scanner input = new Scanner(System.in);
		int suma = 0;
		float longitud[] = new float[tamanioArray];
		System.out.println("Ingrese " + tamanioArray + " números:");
		System.out.println("---------------------------------------");
		
		//Instrucción que le pide al usuario 10 números enteros para después sumarlos
		for (int i = 0; i < longitud.length; i++)
		{
			longitud[i] = input.nextInt();
			suma += longitud[i];
		}
		System.out.println("---------------------------------------");
		
		//Divide la suma total por la longitud del array
		float promedio = suma / (float)longitud.length;
		input.close();
		return promedio;
	}

	public static void main(String[] args) 
	{
		//ENTRADA
		System.out.println("Indique la cantidad de números a sumar:");
		System.out.println("---------------------------------------");
		Scanner input = new Scanner(System.in);
		int longitud;
		longitud = input.nextInt();
		
		//SALIDA
		System.out.println("El promedio de los números ingresados es: " + calcularPromedio(longitud));
		
		//cierre
		input.close();

	}

}
