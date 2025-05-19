package pakash;

/*
 * Programa que muestra c�mo trabajar con el tipo enumerado
 */ 

import java.util.Scanner;

public class Ejemplo05_TipoEnumerado {
	enum DiasSemana { LUNES, MARTES, MIERCOLES, JUEVES,
		VIERNES, SABADO, DOMINGO };

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DiasSemana unDia = DiasSemana.JUEVES;
		System.out.println(unDia);				// JUEVES
		System.out.println(unDia.ordinal());	// 3				

		System.out.println("Escribe el d�a de la semana (LUNES - DOMINGO):");
		DiasSemana diaUsuario1 = DiasSemana.valueOf(input.nextLine());
		System.out.println("Has escrito " + diaUsuario1);
		
		System.out.println("Escribe el n�mero de d�a (0 - 6):");
		DiasSemana diaUsuario2 = DiasSemana.values()[input.nextInt()];
		System.out.println("Has escrito " + diaUsuario2);		
	}
}




