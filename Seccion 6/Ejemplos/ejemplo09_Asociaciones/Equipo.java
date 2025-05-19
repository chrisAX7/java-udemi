package ejemplo09_Asociaciones;

public class Equipo {

    private static final int MAX_JUGADORES = 10;

    private String nombre;
    private Jugador jugadores[];
    private int cantidad;

    public Equipo(String nombre)
    {
        this.nombre = nombre;
        this.jugadores = new Jugador[MAX_JUGADORES];
        this.cantidad = 0;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void nuevoJugador(Jugador j)
    {
        if (cantidad < MAX_JUGADORES)
        {
            jugadores[cantidad] = j;
            cantidad++;
        }
    }

    public void borrarJugador(Jugador j)
    {
        int posicionABorrar = -1;
        for (int i = 0; i < cantidad; i++)
        {
            if (jugadores[i].getNombre().equals(j.getNombre()))
            {
                posicionABorrar = i;
            }
        }
        if (posicionABorrar >= 0)
        {
            for (int i = posicionABorrar; i  < cantidad - 1; i++)
            {
                jugadores[i] = jugadores[i+1];
            }
            cantidad--;
        }
    }

    public void mostrarInformacion()
    {
        System.out.println(nombre);
        if(cantidad>0)
        {
            System.out.println("Jugadores: ");
            for (int i = 0; i < cantidad; i++)
            {
                System.out.println(" - " + jugadores[i].getNombre());
            }
        }
    }
}
