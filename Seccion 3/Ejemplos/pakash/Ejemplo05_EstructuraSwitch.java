package pakash;

/*
 * Programa que muestra cómo utilizar la estructura condicional "switch" */ 

import java.util.Scanner;

public class Ejemplo05_EstructuraSwitch {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int nota;
		
		System.out.println("Escribe tu nota del examen:");
		nota = input.nextInt();
		
		switch(nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Suspenso");
				break;
			case 5:
			case 6:
				System.out.println("Aprobado");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
			case 10:
				System.out.println("Excelente");
				break;
			default:
				System.out.println("Nota incorrecta");
		}
	}
}
