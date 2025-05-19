/*
 * Programa que muestra c�mo definir y usar funciones
 */

package pakash;

import java.util.Scanner;
 
public class Ejemplo01_Funciones
{
	public static void mostrarBienvenida()
	{
		System.out.println("Bienvenido a nuestra tienda");
		System.out.println("Elige una opci�n del men� para continuar...");
	}
	
	public static void saludar(String nombre, int edad)
	{
		System.out.println("Hola, " + nombre + ", tienes " + edad + " a�os");
	}
	
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		String nombreUsuario;
		int edadUsuario;
		
		mostrarBienvenida();
		
		saludar("Pepe", 30);
		saludar("Elena", 27);
		
		System.out.println("Dime tu nombre:");
		nombreUsuario = sc.nextLine();
		System.out.println("Dime tu edad:");
		edadUsuario = sc.nextInt();
		saludar(nombreUsuario, edadUsuario);
	}
}
