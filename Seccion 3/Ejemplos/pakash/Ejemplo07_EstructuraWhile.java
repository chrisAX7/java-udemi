package pakash;

/*Programa que muestra c�mo utilizar la estructura repetitiva "while"*/ 

import java.util.Scanner;

public class Ejemplo07_EstructuraWhile {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String texto;
		int n = 1;
		
		while(n <= 10) {
			System.out.println(n);
			n++;
		}
		
		System.out.println("Escribe un texto:");
		texto = input.nextLine();
		
		while(!texto.equals("fin")) {
			System.out.println("Has escrito " + texto);
			System.out.println("Escribe un texto:");
			texto = input.nextLine();
		}
	}
}
