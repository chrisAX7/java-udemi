package pakash;

import java.util.Scanner;

public class EjercicioPropuesto06_OperacionesConString {

	public static void main(String[] args) {
		
		//DECLARAR VARIABLES
		Scanner input = new Scanner(System.in);
		String nombres;
		
		//INICIALIZAR VARIABLES
		System.out.println("Escriba nombres separados por comas: ");
		nombres = input.nextLine();
		
		//FRAGMENTAR LA CADENA
		String nombresSeparados[] = nombres.split(",");
		System.out.println("**************************");
		
		//CONTAR LA CANTIDAD DE NOMBRES INGRESADOS
		int cantNombres = 0;
		for (int i = 0; i < nombresSeparados.length; i++) {
			cantNombres++;
		}
		
		//SALIDA POR PANTALLA
		System.out.println("Usted ha ingresado " + cantNombres + " nombres");
		for (int i = 0; i < nombresSeparados.length; i++) {
			System.out.println(nombresSeparados[i].toUpperCase());
		}
		
		//CIERRE
		input.close();

	}

}
