package ejercicioPropuesto03_VisibilidadYEncapsulamiento;

import java.util.Scanner;

public class GestorTiendaVideojuegos
{
    private Cliente[] clientes;
    private Videojuego[] videojuegos;

    private Videojuego[] carrito;
    private int juegosEnCarrito;
    static final int MAX_CARRITO = 10;

    private Scanner input;

    private boolean validarUsuario()
    {
        boolean aceptado = false;
        String email, password;

        System.out.println("Introduce su email:");
        email = input.nextLine();
        System.out.println("Introduce su password:");
        password = input.nextLine();

        for (int i = 0; i <clientes.length ; i++)
        {
            if ( (clientes[i].getEmail().equals(email)) && (clientes[i].getPassword().equals(password)))
            {
                aceptado = true;
            }

            if (!aceptado)
            {
                System.out.println("Usuario desconocido");
            }
        }
        return aceptado;
    }

    private void verTodosLosJuegos()
    {
        for (int i = 0; i < videojuegos.length; i++)
        {
            System.out.println(">"+ (i+1) +":" + videojuegos[i]);
        }
    }

    private void verJuegosPorPrecioMaximo()
    {
        System.out.println("Precio máximo?");
        int precioMax = input.nextInt();
        boolean existeAlguno = false;

        for (int i = 0; i < videojuegos.length; i++)
        {
            if (videojuegos[i].getPrecio() <= precioMax)
            {
                System.out.println(">"+ (i+1) +":" + videojuegos[i]);
                existeAlguno = true;
            }

            if (!existeAlguno)
            {
                System.out.println("No se ha encontrado ningún juego con esos precios.");
            }
        }
    }

    public void aniadirAlCarrito()
    {
        if (juegosEnCarrito >= MAX_CARRITO)
        {
            System.out.println("CARRITO LLENO!!");
            return;
        }

        int codigoJuego;

        System.out.println("Escribe el número del videojuego a añadir:");
        codigoJuego = input.nextInt();
        input.nextLine();

        if (codigoJuego > 0 && codigoJuego <= videojuegos.length)
        {
            carrito[juegosEnCarrito] = videojuegos [codigoJuego-1];
            juegosEnCarrito++;
        }
    }

    private void verCarrito()
    {
        if(juegosEnCarrito == 0)
        {
            System.out.println("El carrito está vacío.");
        }
        else
        {
            for (int i = 0; i < juegosEnCarrito; i++)
            {
                System.out.println(carrito[i]);
            }
        }
    }

    private void finalizarCompra()
    {
        if(juegosEnCarrito == 0)
        {
            System.out.println("El carrito está vacío.");
        }
        else
        {
            double total = 0;
            for (int i = 0; i < juegosEnCarrito; i++)
            {
                System.out.println(carrito[i]);
                total += carrito[i].getPrecio();
            }

            System.out.println("Importe total: " + total);
            juegosEnCarrito = 0;
        }
    }

    private int escogerOpcion()
    {
        int opcion;

        System.out.println();
        System.out.println("1. Ver todos los juegos");
        System.out.println("2. Ver juegos por precio máximo");
        System.out.println("3. Añadir juegos al carrito");
        System.out.println("4. Ver carrito");
        System.out.println("5. Finalizar compra");
        System.out.println("0. Salir");
        System.out.println("Elige una opción");

        opcion = input.nextInt();
        input.nextLine();

        return opcion;
    }

    public void lanzar()
    {
        int opcionMenu;
        input = new Scanner(System.in);

        if (validarUsuario())
        {
            do
            {
                opcionMenu = escogerOpcion();

                switch (opcionMenu)
                {
                    case 1: verTodosLosJuegos(); break;
                    case 2: verJuegosPorPrecioMaximo(); break;
                    case 3: aniadirAlCarrito(); break;
                    case 4: verCarrito(); break;
                    case 5: finalizarCompra(); break;
                    case 0: System.out.println("HASTA LA PROCZIMAAAA!!!!! *ruido de dubstep*"); break;
                    default: System.out.println("Para algo te di un menú de opciones pajero");
                }
            }while (opcionMenu !=0 );
        }
        input.close();
    }
}
