package pakash;

/* Programa que practica la entrada de datos del usuario desde el teclado, empleando tanto el 
 * elemento Scanner como la propia consola del sistema.
 */
 
import java.util.Scanner;

public class Ejemplo12_EntradaDeDatos {
	//Programa principal
	public static void main(String[] args) {
		//Declarando variables
		Scanner input = new Scanner(System.in);
		String texto, texto2;
		int numero1, numero2;
		float numero3;
		//Pidiendo datos al usuario
		System.out.println("Escribe un numero:");
		numero1 = input.nextInt();
		input.nextLine();
		System.out.println("Escribe un texto:");
		texto = input.nextLine();
		System.out.println("Escribe otro numero:");
		numero3 = input.nextFloat();
		System.out.println("El entero es " + numero1);
		System.out.println("El texto es " + texto);
		System.out.println("El real es " + numero3);
		//Leyendo datos de la consola
		System.out.println("Escribe otro texto:");
		texto2 = System.console().readLine();
		System.out.println("He leído de consola " + texto2);
	}
}
