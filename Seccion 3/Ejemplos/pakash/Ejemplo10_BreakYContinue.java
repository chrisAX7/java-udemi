package pakash;

/*
 * Programa que muestra c�mo utilizar 
 * las instrucciones "break" y "continue"
 * en bucles
 */ 

import java.util.Scanner;

public class Ejemplo10_BreakYContinue {
	public static void main(String[] args) {		
	
	Scanner input = new Scanner(System.in);
	int n = 1;
	String texto;
		
	 while (n <= 10) {
		System.out.println(n);
		if (n == 5)
			break;
		n++;
	 }
		
	System.out.println("Escribe textos. Escribe \"fin\" para terminar:");
		
	do {
		texto = input.nextLine();
		if (texto.equals("fin"))
				break;
	}while(true);
		
	 for(int i = 1; i <= 10; i++) {
		if (i == 5)
			continue;
		System.out.println(i);
	 }
				
  }
}
