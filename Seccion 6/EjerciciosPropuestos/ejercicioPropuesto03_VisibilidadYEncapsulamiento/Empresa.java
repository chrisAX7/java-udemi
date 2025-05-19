package ejercicioPropuesto03_VisibilidadYEncapsulamiento;

public class Empresa
{

    /**********ATRIBUTOS**********/
    private String nombre;
    private int anioFundacion;

    /**********CONSTRUCTOR**********/
    public Empresa (String nombre, int anioFundacion)
    {
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
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

    public int getAnioFundacion()
    {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion)
    {
        this.anioFundacion = anioFundacion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Año de fundación: " + anioFundacion;
    }
}
