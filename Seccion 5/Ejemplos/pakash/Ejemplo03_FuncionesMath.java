/*
 * Programa que muestra c�mo utilizar funciones matem�ticas
 * de Math
 */

package pakash;

public class Ejemplo03_FuncionesMath
{
	public static void main(String[] args)
	{		
		double raiz = Math.sqrt(12);
		System.out.println(raiz);
		
		double potencia = Math.pow(4, 3);
		System.out.println(potencia);
		System.out.println(Math.pow(6, 4));
		
		int numero = Math.abs(-4);
		System.out.println(numero);
		
		double seno = Math.sin(Math.PI);
		System.out.println(seno);
	}
}
