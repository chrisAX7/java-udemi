package ejercicioPropuesto06_ArraysDeObjetos;
import ejercicioPropuesto03_VisibilidadYEncapsulamiento.IncorrectVideoGameException;
import ejercicioPropuesto03_VisibilidadYEncapsulamiento.Videojuego;
import java.util.Scanner;

public class PruebaArraysObjetos
{
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

        return new Videojuego(titulo, genero, precio, " ");
    }

    public static Videojuego[] recorrerJuegos() throws IncorrectVideoGameException
    {
        Videojuego[] juegos = new Videojuego[4];
        for (int i = 0; i < juegos.length; i++) {
            juegos[i] = crearJuego();
            System.out.println("**************");
            System.out.println("**************");
        }
        return juegos;
    }


    public static void mostrarJueguitos(Videojuego[] games)
    {
        for (int i = 0; i < games.length; i++) {
            games[i].mostrarInformacion();
            System.out.println(" ");
        }
    }



    public static void main(String[] args) throws IncorrectVideoGameException
    {
        Videojuego[] juegos = recorrerJuegos();
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");

        int posicionPrecioMasBajo = 0;
        for (int i = 0; i < juegos.length ; i++)
        {
            if (juegos[i].getPrecio() < juegos[posicionPrecioMasBajo].getPrecio())
            {
                posicionPrecioMasBajo = i;
            }
        }

        juegos[posicionPrecioMasBajo].mostrarInformacion();

        input.close();

    }
}
