package ejemplo09_Asociaciones;

public class Jugador
{
    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre)
    {
        this.nombre = nombre;
        this.equipo = null;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Equipo getEquipo(){
        return equipo;
    }

    public void setEquipo(Equipo equipo)
    {
        this.equipo = equipo;
        equipo.nuevoJugador(this);
    }

    public void mostrarInformacion()
    {
        System.out.println(nombre);
        System.out.println(equipo.getNombre());
    }
}
