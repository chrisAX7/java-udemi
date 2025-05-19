package pakash;

import java.util.Scanner;
import java.util.InputMismatchException;

/*Programa que le pide repetidamente números enteros al usuario hasta que introduzca 0, y calcular
 *el promedio de los números sin contar el cero. Las dos excepciones son que se introduzca un cero
 *directamente o que no se introduzca un entero.*/

public class EjercicioPropuesto07_ManejoDeExcepciones 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num;
		int suma = 0, cantidad = 0;
		do
		{
			System.out.println("Ingrese un número:");
			num = input.nextInt();
			
			try
			{
				if (num !=0)
				{
					suma += num;
					cantidad++;
				}
				
			}
			catch (InputMismatchException e) 
			{
				System.err.println("No es un número válido");
				input.nextLine();
			}
			
		} while(num != 0);
		
		try 
		{
			System.out.println("El promedio es: " + (suma/cantidad));
		}
		catch(ArithmeticException e)
		{
			System.err.println("No hay datos");
		}
		
		input.close();
	}

}
