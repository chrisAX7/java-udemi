package pakash;

/*
 * Programa que muestra c�mo buscar elementos en arrays
 */ 
 
import java.util.Scanner;
 
public class Ejemplo02_BusquedaArrays
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = { 3, 1, 8, 12, 7 };		
		
		// B�squeda secuencial de un dato introducido por el usuario
		
		int numeroUsuario, posicion = 0;
		boolean encontrado = false;
		
		System.out.println("Escribe el n�mero a buscar:");
		numeroUsuario = sc.nextInt();
		
		do
		{
			if (numeros[posicion] == numeroUsuario)
			{
				encontrado = true;
			}
			else
			{
				posicion++;
			}
		}
		while(!encontrado && posicion < numeros.length);
		
		if (encontrado)
		{
			System.out.println("El n�mero se encuentra en la posici�n " + (posicion + 1));
		}
		else
		{
			System.out.println("No se encuentra el n�mero");
		}
		
		// B�squeda del valor m�nimo del array (el m�ximo se har�a de forma similar)
		
		System.out.println("El valor m�nimo es:");
		int posMinimo = 0, minimo = numeros[0];
		
		for(int i = 1; i < numeros.length; i++)
		{
			if (numeros[i] < minimo)
			{
				minimo = numeros[i];
				posMinimo = i;
			}
		}
		
		System.out.println(minimo);
		System.out.println("y se encuentra en la posici�n " + (posMinimo + 1));
	}
}
