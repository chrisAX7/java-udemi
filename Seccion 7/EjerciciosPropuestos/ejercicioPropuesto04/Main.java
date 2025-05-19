package ejercicioPropuesto04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        LinkedList<Persona> pipol = new LinkedList<>();

        do
        {
            System.out.println("Decime tu nombre pa/ma:");
            nombre = input.nextLine();
            if (!nombre.isEmpty())
            {
                System.out.println("Decime tu edad rey/reina:");
                edad = input.nextInt();
                input.nextLine();

                pipol.add(new Persona(nombre, edad));
            }
        }
        while (!nombre.isEmpty());

        ArrayList<Persona> pipolQueVa = new ArrayList<>();

        while (! pipol.isEmpty())
        {
            if (pipol.peek().getEdad() >= 18)
            {
                pipolQueVa.add(pipol.peek());
            }
            pipol.remove();
        }

        for(Persona p: pipolQueVa)
        {
            System.out.println(p);
        }

    }
}
