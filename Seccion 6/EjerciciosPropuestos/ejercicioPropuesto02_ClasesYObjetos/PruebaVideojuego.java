package ejercicioPropuesto02_ClasesYObjetos;

import java.util.Scanner;

public class PruebaVideojuego {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Videojuego game1 = new Videojuego();
		Videojuego game2 = new Videojuego();
		Videojuego game3 = new Videojuego();
		
		game1.titulo = "Resident Evil 4";
		game1.genero = "Survival Horror";
		game1.precio = 26;
		
		game2.titulo = "The King Of Fighters 98 Ultimate Match";
		game2.genero = "Fighting";
		game2.precio = 10;
		
		System.out.println("Indica el nombre del videojuego:");
		game3.titulo = input.nextLine();
		System.out.println("Indica el género del videojuego:");
		game3.genero = input.nextLine();
		System.out.println("Indica el precio del videojuego:");
		game3.precio = input.nextDouble();
		
		game1.mostrarInformacion();
		System.out.println("----------------------------");
		game2.mostrarInformacion();
		System.out.println("----------------------------");
		game3.mostrarInformacion();
		
		input.close();
	}

}
