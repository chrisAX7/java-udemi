package ejemplo09_Asociaciones;

public class Main
{
    public static void main(String[] args)
    {
        Equipo team1 = new Equipo("River Plate");
        Equipo team2 = new Equipo("Deportivo Merlo");

        Jugador player1 = new Jugador("Miguel Borja");
        Jugador player2 = new Jugador("Franco Mastantuono");
        player1.setEquipo(team1);
        player2.setEquipo(team1);

        team1.mostrarInformacion();
    }
}
