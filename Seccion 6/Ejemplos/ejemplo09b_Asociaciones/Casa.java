package ejemplo09b_Asociaciones;

public class Casa
{
    /**********ATRIBUTOS**********/
    private String direccion;
    private Ventana[] ventanas;

    /**********CONSTRUCTOR**********/
    public Casa(String direccion)
    {
        this.direccion = direccion;
        Ventana[] ventanas = new Ventana[3];
        ventanas[0] = new Ventana("Ventana de la cocina", 100, 120);
        ventanas[1] = new Ventana("Ventana de la pieza", 200, 130);
        ventanas[2] = new Ventana("Ventana del living", 150, 180);
    }

    /**********METODOS**********/
    public String getDireccion()
    {
        return direccion;
    }

    public void mostrarInformacion()
    {
        System.out.println("Casa en " + direccion);
        for (int i = 0; i < ventanas.length; i++)
        {
            ventanas[i].mostrarInformacion();
        }
    }
}
