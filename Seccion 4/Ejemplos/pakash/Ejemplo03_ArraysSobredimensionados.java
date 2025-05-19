package pakash;

/*
 * Programa que muestra cómo trabajar con arrays sobredimensionados
 */ 
 
import java.util.Scanner;
 
public class Ejemplo03_ArraysSobredimensionados {
	
	public static void main(String[] args) {
	
		final int CAPACIDAD = 5;

		Scanner input = new Scanner(System.in);
		int cantidad = 0, posicionABorrar;
		String nombreUsuario;
		String[] nombres = new String[CAPACIDAD];
		
		// Llenar el array
		
		System.out.println("Escribe los nombres:");
		for(int i = 0; i < CAPACIDAD; i++) {
			nombreUsuario = input.nextLine();
			if(cantidad < CAPACIDAD) {
				nombres[cantidad] = nombreUsuario;
				cantidad++;
			}
		}
		
		System.out.println("Nombres almacenados:");
		for(int i = 0; i < cantidad; i++) {
			System.out.println(nombres[i]);
		}	
		
		// Borrar una posición
		
		System.out.println("Elige una posición a borrar (1 - " + cantidad + "):");
		posicionABorrar = input.nextInt();
		posicionABorrar--;
		
		if (posicionABorrar >= 0 && posicionABorrar < cantidad) {
			for(int i = posicionABorrar; i < cantidad - 1; i++) {
				nombres[i] = nombres[i+1];
			}
			cantidad--;
		}	
		else {
			System.out.println("Posición incorrecta");
		}
		
		System.out.println("Nombres almacenados:");
		for(int i = 0; i < cantidad; i++) {
			System.out.println(nombres[i]);
		}	
		
	}
}
