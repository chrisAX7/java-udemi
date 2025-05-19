public abstract class Persona
{
    protected String nombreCompleto;
    protected String telefono;

    public Persona(String nombreCompleto, String telefono)
    {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
    }

    public String getNombreCompleto()
    {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto)
    {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public abstract void mostrarInformacion();
}
