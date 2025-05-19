package pakash;

/*Programa que muestra c�mo utilizar la estructura repetitiva "do..while"*/

import java.util.Scanner;

public class Ejemplo08_EstructuraDoWhile {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String texto;
		int n = 1;

		do {
			System.out.println(n);
			n++;
		} while(n <= 10);		
				
		do {
			System.out.println("Escribe un texto:");
			texto = input.nextLine();
			if (!texto.equals("fin")) {
				System.out.println("Has escrito " + texto);
			}
		} while(!texto.equals("fin"));
	}
}
