package pakash;


/* Programa que le pide al usuario 5 nombres, para después solicitarle que elimine uno de 
 * determinada posición*/
import java.util.Scanner;

public class EjercicioPropuesto03_ArraysSobredimensionados {

	public static void main(String[] args) {
		//ENTRADA
		final int CAPACIDAD = 10;
		
		int cantidad = 5;
		Scanner input = new Scanner(System.in);
		String nombre;
		String nombres[] = new String[CAPACIDAD];
		
		System.out.println("Escribe 5 nombres: ");
		
		//PROCESO
		for(int i = 0; i < cantidad; i++) {
			nombre = input.nextLine();
				nombres[i] = nombre;
		}
		
		//SALIDA
		
		//Llenar el array
		System.out.println("Nombres guardados: ");
		for(int i = 0; i < cantidad; i++) {
			System.out.println("N°"+ i + " " +nombres[i]);
		}
		//Borrar una posicion
		int posicionABorrar;
		System.out.println("Indique la posición a borrar: ");
		posicionABorrar = input.nextInt();
		if ( posicionABorrar >= 0 && posicionABorrar < cantidad) {
			for (int i = posicionABorrar; i < cantidad - 1; i++) {
				nombres[i] = nombres[i + 1];
			}
			cantidad--;
		}
		else {
			System.out.println("Opción inválida");
		}
		//Array nuevo
		System.out.println("Nombres guardados: ");
		for(int i = 0; i < cantidad; i++) {
			System.out.println("N°" + i +" " + nombres[i]);
		}
		input.close();
		

	}

}
