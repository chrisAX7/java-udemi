package ejercicioPropuesto03_VisibilidadYEncapsulamiento;

public class Cliente
{
    protected String nombreCompleto;
    protected String email;
    protected String password;

    public Cliente(String nombreCompleto, String email, String password)
    {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Nombre completo: " + nombreCompleto + "\n" +
                "Email: " + email + "\n" +
                "Password: + " + password;
    }
}
