package pakash;

import java.util.Scanner;

/*Programa que crea una función llamada pedirEntero() que recibe como parámetros n1 y n2, y le
 *pide al usuario un número entre n1 y n2
 *Las dos excepciones pueden ser:
 *> Un dato no numérico
 *> Un número fuera del rango
 *Luego poner a prueba en el main mostrando los divisores del rango separados por espacios, en caso
 *de que sea correcto, en caso contrario marcar el error y finalizar*/



public class EjercicioPropuesto08_ManejoDeExcepciones2 
{
	
	/*----------------------------------------------------------*/
	public static int pedirEntero(int n1, int n2) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int n;
		try 
		{
			n = input.nextInt();
		} 
		catch (Exception e) 
		{
			throw new Exception("El dato está no es un entero");
		}
		if (n < n1 || n > n2)
		{
			throw new Exception("El dato está fuera de rango");
		}
		else
		{
			return n;
		}
	}
	/*----------------------------------------------------------*/
	
	
	
	/*----------------------------------------------------------*/
	/*----------------------------------------------------------*/
	/*----------------------------------------------------------*/
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Dime un número:");
		try
		{
			int num = pedirEntero(1, 100);
			
			for (int i = 1; i <= num; i++) 
			{
				if (num % i == 0)
				{
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
		catch (Exception e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
	} 
}
