package pakash;


import java.util.Scanner;

/*Programa que le pide al usuario que rellene una matriz 3x4 y muestre cuál es el número más 
 *grande de cada fila*/
public class EjercicioPropuesto04_ArraysBidimensionales {

	public static void main(String[] args) {
		
		//ENTRADA
		Scanner input = new Scanner(System.in);
		int [][] datos = new int[3][4];
		System.out.println("Ingrese los datos del array: ");
		
		
		//PROCESO
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print("Fila " + (i+1)  + " columna " + (j+1) +":");
				datos[i][j] = input.nextInt();
			}	
		}
		
		//SALIDA
		System.out.println("****************************");
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print(datos[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("****************************");
		for (int i = 0; i < datos.length; i++) {
			int maxFila = datos[i][0];
			for (int j = 0; j < datos[i].length; j++) {
				if (datos[i][j] > maxFila) {
					maxFila = datos[i][j];
				}
			}
			System.out.println("El máximo de la fila " + (i+1) + " es: " + maxFila);
		}

		input.close();
	}

}
