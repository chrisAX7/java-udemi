package ejercicioPropuesto04_UsoDeConstructores;
import java.util.Scanner;

import ejercicioPropuesto03_VisibilidadYEncapsulamiento.IncorrectVideoGameException;
import ejercicioPropuesto03_VisibilidadYEncapsulamiento.Videojuego;

/*Programa que prueba el uso de constructores*/

public class PruebaConstructores {
	static Scanner input = new Scanner(System.in);

	public static Videojuego crearJuego() throws IncorrectVideoGameException
	{
		System.out.println("Ingrese el nombre del título: ");
		String titulo = input.nextLine();
		System.out.println("Ingrese el género del título: ");
		String genero = input.nextLine();
		System.out.println("Ingrese el precio del título: ");
		int precio = input.nextInt();
		input.nextLine();

        return new Videojuego(titulo, genero, precio, "");
	}
	
	public static void mostrarJuego( Videojuego game)
	{
		game.mostrarInformacion();
	}
	
	public static void main(String[] args) throws IncorrectVideoGameException
	{
		Videojuego game1 = crearJuego();
		System.out.println("******************************");
		Videojuego game2 = crearJuego();
		System.out.println("******************************");
		Videojuego game3 = crearJuego();
		System.out.println("******************************");
		System.out.println("******************************");
		
		mostrarJuego(game1);
		System.out.println("******************************");
		mostrarJuego(game2);
		System.out.println("******************************");
		mostrarJuego(game3);
		
		input.close();
	}

}
