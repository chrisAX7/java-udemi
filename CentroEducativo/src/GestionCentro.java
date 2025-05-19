public class GestionCentro
{
    public static void main(String[] args)
    {
        Persona guri = new Alumno("Kevin Rodriguez", "11 3361-5492", 16);
        Persona ticher = new Profesor("La vieja de historia", "11 2525-6628",
                "Historia");

        guri.mostrarInformacion();
        System.out.println(".................");
        System.out.println(".................");
        System.out.println(".................");
        ticher.mostrarInformacion();
    }
}
