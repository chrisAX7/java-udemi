package pakash;

/*
 * Programa que muestra cómo utilizar el tipo de datos booleano */ 
 
import java.util.Scanner;
 
public class Ejemplo01_TipoBooleano {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean b = true;
		boolean b2;
		
		System.out.println("Escribe un valor booleano:");
		b2 = input.nextBoolean();
		
		System.out.println(b);
		System.out.println(b2);
	}
}
