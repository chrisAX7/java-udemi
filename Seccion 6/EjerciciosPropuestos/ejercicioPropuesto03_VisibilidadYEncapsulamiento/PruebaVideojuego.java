package ejercicioPropuesto03_VisibilidadYEncapsulamiento;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PruebaVideojuego 
{	/************************************************/
	public static Videojuego crearJuego(Scanner input) throws IncorrectVideoGameException {
        String titulo = null;
        String genero = null;
        double precio = 0;
        Videojuego game = new Videojuego(titulo, genero, precio);

        System.out.println("Indique el nómbre del videojuego:");
        titulo = input.nextLine();
        game.setTitulo(titulo);

        System.out.println("Indique el género del videojuego:");
        genero = input.nextLine();
        game.setGenero(genero);

        System.out.println("Indique el precio del videojuego:");
        precio = input.nextDouble();
        game.setPrecio(precio);
        input.nextLine();

        return game;
    }
	
	/************************************************/
	public static void mostrarJuegoCreado(Videojuego game)
	{
		System.out.println("El título es " + game.getTitulo());
		System.out.println("El género es " + game.getGenero());
		System.out.println("El precio es es " + game.getPrecio() + "$");
	}

	public static void main(String[] args) throws IncorrectVideoGameException
    {
        Videojuego[] jueguitos = new Videojuego[3];
        Scanner input = new Scanner(System.in);
        Empresa empresa = new Empresa("Popcap", 2004);
        Empresa empresa2 = new Empresa("Konami", 1998);
        Empresa empresa3 = new Empresa("Sega", 1989);

        for (int i = 0; i <jueguitos.length ; i++) {
            System.out.println("¿Desea un juego normal o de PC?");
            System.out.println("1: normal");
            System.out.println("2: PC");
            int opcion = input.nextInt();
            input.nextLine();

            if (opcion == 1)
            {
                System.out.println("Indique el título del videojuego:");
                String titulo = input.nextLine();
                System.out.println("Indique el género del videojuego:");
                String genero = input.nextLine();
                System.out.println("Indique el precio del videojuego:");
                double precio = input.nextDouble();
                input.nextLine();
                jueguitos[i] = new Videojuego(titulo, genero, precio, empresa2);
            }
            else if (opcion == 2)
            {
                System.out.println("Indique el título del videojuego:");
                String titulo = input.nextLine();
                System.out.println("Indique el género del videojuego:");
                String genero = input.nextLine();
                System.out.println("Indique el precio del videojuego:");
                double precio = input.nextDouble();
                System.out.println("Indique el espacio mínimo del videojuego:");
                int espacioMinimo = input.nextInt();
                System.out.println("Indique la cantidad de memoria RAM del videojuego:");
                int memoriaRamMinima = input.nextInt();
                input.nextLine();
                jueguitos[i] = new VideojuegoPC(titulo, genero, precio, empresa2, espacioMinimo,
                        memoriaRamMinima);
            }
        }

        Arrays.sort(jueguitos, new Comparator<Videojuego>() {
            @Override
            public int compare(Videojuego o1, Videojuego o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        });

        for (Videojuego j: jueguitos){
            System.out.println(j);
        }

        Arrays.sort(jueguitos, new Comparator<Videojuego>() {
            @Override
            public int compare(Videojuego o1, Videojuego o2) {
                return Double.compare(o1.getPrecio(), o2.getPrecio()) * -1;
            }
        });

        for(Videojuego j: jueguitos)
        {
            System.out.println(j);
        }
    }
}
