package pakash;

/*
 * Programa que muestra c�mo utilizar 
 * el operador ternario condicional ?:
 */ 

import java.util.Scanner;

public class Ejemplo06_OperadorTernario {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numero;
		String mensaje;
		
		System.out.println("Escribe un n�mero:");
		numero = input.nextInt();
		
		mensaje = (numero >= 0) ? "Es positivo" : "Es negativo";
		
		System.out.println(mensaje);
		
	}
}
