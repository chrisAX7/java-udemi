package pakash;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Poblacion> ciudades = new ArrayList<>();

        ciudades.add(new Poblacion("Merlo", 35000));
        ciudades.add(new Poblacion("Moreno", 39524));
        ciudades.add(new Poblacion("Paso del Rey", 21628));

        Collections.sort(ciudades);

        for (Poblacion p : ciudades)
        {
            System.out.println(p);
        }
    }
}