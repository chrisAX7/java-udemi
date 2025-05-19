package pakash;

/*
 * Programa que muestra cómo utilizar 
 * la estructura condicional "if"
 */ 

import java.util.Scanner;

public class Ejemplo04_EstructuraIf {
	
	public static void main(String[] args) {
		
		float nota;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe la nota que has sacado:");
		nota = input.nextFloat();
		
		if (nota >= 9 && nota <= 10) {
			System.out.println("Tu nota es excelente");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Tu nota es notable");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Tu nota es aprobado");
		} else {
			System.out.println("Has suspendido");
		}
	}
}
