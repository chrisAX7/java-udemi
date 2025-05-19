/*
 * Programa que muestra el funcionamiento de la comparación de cadenas
 * de texto en Java, ordenando un array de textos mediante el método
 * de la intercambio directo
 */
package pakash;

public class Ejemplo10_ComparacionDeTextos
{
	public static void main(String[] args)
	{
		String[] textos = { "Uno", "Dos", "Tres", "cuatro", "Cinco" };
		
		// Algoritmo de intercambio directo
		
		for (int i = 0; i < textos.length - 1; i++)
		{
			for (int j = i+1; j < textos.length; j++)
			{
				if (textos[i].compareToIgnoreCase(textos[j]) > 0)
				{
					// El texto i es mayor, toca intercambiar
					String auxiliar = textos[i];
					textos[i] = textos[j];
					textos[j] = auxiliar;
				}
			}
		}
		
		for (int i = 0; i < textos.length; i++)
		{
			System.out.print(textos[i] + " ");
		}
		System.out.println();
	}
} 
