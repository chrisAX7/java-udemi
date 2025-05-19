package ejercicioPropuesto09_AsosiacionesEntreClases;

import ejercicioPropuesto03_VisibilidadYEncapsulamiento.Empresa;
import ejercicioPropuesto03_VisibilidadYEncapsulamiento.IncorrectVideoGameException;
import ejercicioPropuesto03_VisibilidadYEncapsulamiento.Videojuego;

import java.util.Scanner;


public class Main
{
    static Scanner input = new Scanner(System.in);

    public static Empresa crearEmpresa()
    {
        System.out.println("Ingrese la empresa que lo desarrolló:");
        String compania = input.nextLine();
        System.out.println("Ingrese el año de fundación de la empresa:");
        int anio = input.nextInt();
        input.nextLine();
        return new Empresa(compania, anio);
    }

    public static Videojuego crearJuego() throws IncorrectVideoGameException
    {
        System.out.println("Ingrese el nombre del juego");
        String nombre = input.nextLine();
        System.out.println("Ingrese el género del juego:");
        String genero = input.nextLine();
        System.out.println("Ingrese el precio del juego:");
        double precio = input.nextDouble();
        input.nextLine();
        Empresa compania = crearEmpresa();
        return new Videojuego(nombre, genero, precio, compania);
    }
    public static void main(String[] args) throws IncorrectVideoGameException
    {
        Videojuego re4 = crearJuego();
        Empresa konami = re4.getEmpresa();
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println(re4.getTitulo());
        System.out.println(re4.getGenero());
        System.out.println(re4.getPrecio());
        System.out.println(konami.getNombre());
        System.out.println(konami.getAnioFundacion());

        input.close();
    }
}
