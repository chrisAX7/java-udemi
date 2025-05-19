/*
 * Programa que muestra c�mo capturar excepciones
 */
package pakash;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejemplo07_ManejoDeExcepciones
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		int n1 = 1, n2;
		
		do
		{
			try
			{
				System.out.println("Introduce dividendo:");
				n1 = sc.nextInt();
				if (n1 != 0)
				{
					System.out.println("Introduce divisor:");
					n2 = sc.nextInt();
					System.out.println("La divisi�n es " + (n1 / n2));
				}
			}
			catch(InputMismatchException e)
			{
				System.err.println("Error: n�mero no v�lido");
				sc.next();
			}
			catch(ArithmeticException e)
			{
				System.err.println("Error aritm�tico: " + e.getMessage());
			}
		}
		while (n1 != 0);				
    }	
}
