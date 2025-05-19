/*
 * Programa que muestra el uso de variables locales y globales
 */
package pakash;

public class Ejemplo04_variablesGlobalesYLocales
{
	static int numero2 = 5;
	
	public static void miFuncion()
	{
		numero2++;
		
		/*
		if (true)
		{
			int numero = 3;
		}
		
		System.out.println(numero);
		*/ 
	}
	
	public static void main(String[] args)
	{		
		// System.out.println(numero);

		miFuncion();
		System.out.println(numero2);
	}
}
