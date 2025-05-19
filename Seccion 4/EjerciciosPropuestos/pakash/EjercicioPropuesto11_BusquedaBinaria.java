/*Programa que le pide al usuario una cantidad de 10 números enteros en un array para después 
 *solicitarle que busque un determinado número mediante la "Búsqueda Binara"*/

package pakash;

import java.util.Scanner;

public class EjercicioPropuesto11_BusquedaBinaria 
{
	public static void main(String[] args) 
	{
		// ENTRADA
        Scanner input = new Scanner(System.in);
        int cantidad = 10;
        int pasos = 0;
        int numeros[] = new int[cantidad];
        boolean encontrado = false;

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.println("¿Qué número desea buscar?");
        int buscar = input.nextInt();

        // PROCESO: Ordenar el array en orden ascendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) { // Cambiar para ordenar ascendentemente
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = auxiliar;
                }
            }
        }

        // Búsqueda binaria
        int inicio = 0, fin = numeros.length - 1, mitad;

        do {
            pasos++;
            mitad = (inicio + fin) / 2;
            if (numeros[mitad] == buscar) {
                encontrado = true;
            } else if (numeros[mitad] > buscar) {
                fin = mitad - 1;
            } else {
                inicio = mitad + 1;
            }
        } while (!encontrado && inicio <= fin);

        // SALIDA
        if (encontrado) {
            System.out.println("Número encontrado en la posición " + mitad + " del array ordenado.");
            System.out.println("Se realizaron " + pasos + " pasos.");
        } else {
            System.out.println("No se encontró el número.");
        }

        // Cierre
        input.close();
	}

}
