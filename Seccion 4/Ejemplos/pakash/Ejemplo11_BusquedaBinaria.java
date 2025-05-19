/*
 * Programa que muestra el funcionamiento de la b�squeda
 * binaria o dicot�mica en un array ordenado de enteros
 */

package pakash;

public class Ejemplo11_BusquedaBinaria
{
	public static void main(String[] args)
	{
		int[] numeros = { 1, 2, 3, 6, 7, 8, 9 };
		int numeroABuscar = 7;

		int inicio = 0, fin = numeros.length - 1, seleccionado;
		boolean encontrado = false;
		
		do
		{
			seleccionado = (inicio + fin) / 2;
			if (numeros[seleccionado] > numeroABuscar)
			{
				fin = seleccionado - 1;
			} else if (numeros[seleccionado] < numeroABuscar) {
				inicio = seleccionado + 1;
			} else {
				encontrado = true;
			}
		} while (!encontrado && inicio <= fin);
		
		if (encontrado)
		{
			System.out.println("Encontrado en posici�n " + seleccionado);
		} else {
			System.out.println("No se encuentra el elemento");
		}
	}
} 
