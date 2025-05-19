public class Alumno extends Persona
{
    protected int edad;

    public Alumno(String nombreCompleto, String telefono, int edad)
    {
        super(nombreCompleto, telefono);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void mostrarInformacion()
    {
        System.out.println("Alumno: " + nombreCompleto);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }
}
