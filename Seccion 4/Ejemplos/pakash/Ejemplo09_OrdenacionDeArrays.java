package pakash;

/*
 * Programa que muestra el funcionamiento de distintos
 * algoritmos de ordenación de arrays. 
 * Para ilustrarlo, se ordena de menor a mayor un array de enteros
 */
 
public class Ejemplo09_OrdenacionDeArrays {
	
	public static void main(String[] args) {
		
		int[] numeros = { 8, 3, 1, 6, 2 };
		
		/*
		// Algoritmo de burbuja
		
		for (int i = 0; i < numeros.length - 1; i++) {
		
			for (int j = 0; j < numeros.length - i - 1; j++) {
				if (numeros[j] > numeros[j+1])
				{
					int auxiliar = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = auxiliar;
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
		
			System.out.print(numeros[i] + " ");
		}
		System.out.println();	
		
		*/ 	
		
		// Algoritmo de inserción automática
		
		for (int i = 0; i < numeros.length - 1; i++) {
			
			for (int j = i+1; j < numeros.length; j++) {
				
				if (numeros[i] > numeros[j]) {
					
					int auxiliar = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = auxiliar;
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
	}
} 
