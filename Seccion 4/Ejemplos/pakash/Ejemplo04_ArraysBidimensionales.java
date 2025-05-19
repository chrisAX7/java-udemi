package pakash;

/*
 * Programa que muestra cómo trabajar con arrays bidimensionales
 */ 
 
import java.util.Scanner;
 
public class Ejemplo04_ArraysBidimensionales {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] datos = new int[3][4];
				
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.printf("Fila %d, Columna %d: ", i+1, j+1);
				datos[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Este es el array completo:");
		
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				System.out.print(datos[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] arrayDeArrays = new int[3][];
		arrayDeArrays[0] = new int[3];
		arrayDeArrays[1] = new int[5];
		arrayDeArrays[2] = new int[4];		

		for (int i = 0; i < arrayDeArrays.length; i++) {
			for (int j = 0; j < arrayDeArrays[i].length; j++) {
				System.out.printf("Fila %d, Columna %d: ", i+1, j+1);
				arrayDeArrays[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Este es el array de arrays completo:");
		
		for (int i = 0; i < arrayDeArrays.length; i++) {
			for (int j = 0; j < arrayDeArrays[i].length; j++) {
				System.out.print(arrayDeArrays[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] otroArray = {
			{1, 2, 3},
			{4, 5, 6, 7, 8, 9},
			{1, 1, 1, 1}
		};
		
		System.out.println("Array con datos prefijados:");
		
		for (int i = 0; i < otroArray.length; i++) {
			for (int j = 0; j < otroArray[i].length; j++) {
				System.out.print(otroArray[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
}
