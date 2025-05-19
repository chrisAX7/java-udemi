public class Profesor extends Persona
{
    protected String especialidad;

    public Profesor(String nombreCompleto, String telefono, String especialidad)
    {
        super(nombreCompleto, telefono);
        this.especialidad = especialidad;
    }

    public String getEspecialidad()
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Profesor: " + nombreCompleto);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Especialidad: " + especialidad);
    }
}
