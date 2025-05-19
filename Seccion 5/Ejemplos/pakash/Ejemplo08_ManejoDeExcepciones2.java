package pakash;

/*
 * Programa que muestra c�mo propagar excepciones
 */

import java.util.Scanner;

public class Ejemplo08_ManejoDeExcepciones2
{
	public static int dividir(int n1, int n2) throws Exception
	{
		if (n2 == 0)
			throw new Exception("No se puede dividir por cero");
		else
			return n1 / n2;
	}
		
    public static void main(String[] args)
    {
		try
		{
			System.out.println(dividir(3, 0));
		}
		catch (Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
    }	
}
