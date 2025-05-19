package ejemplo09b_Asociaciones;

public class Ventana
{
    /**********ATRIBUTOS**********/
    private String nombre;
    private  int ancho, alto;

    /**********CONSTRUCTOR**********/
    public Ventana(String nombre, int ancho, int alto)
    {
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
    }

    /**********METODOS**********/
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getAncho()
    {
        return ancho;
    }

    public void setAncho( int ancho)
    {
        this.ancho = ancho;
    }

    public int getAlto()
    {
        return ancho;
    }

    public void setAlto( int alto)
    {
        this.alto = alto;
    }

    public void mostrarInformacion()
    {
        System.out.println(nombre + " " + ancho + "x" + alto);
    }

}
