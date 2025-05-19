package pakash;

/*Programa que explica como usar la clase ArrayList*/

import ejercicioPropuesto03_VisibilidadYEncapsulamiento.IncorrectVideoGameException;
import ejercicioPropuesto03_VisibilidadYEncapsulamiento.Videojuego;

import java.util.ArrayList;

public class Ejemplo01_ArrayList
{
    public static void main(String[] args) throws IncorrectVideoGameException {
        ArrayList lista = new ArrayList();

        lista.add(1);
        lista.add(3);
        lista.add("Se anda diciendo por ahí que me comí un traba");
        lista.add(new Videojuego("God of War", "Guerra", 15, " "));
        lista.add(1, 2);
        lista.add(4);

        lista.remove(0);

        for (int i = 0; i < lista.size(); i++)
        {
            System.out.println(lista.get(i));
            System.out.println("******");
        }

        String texto = (String) lista.get(2);
        System.out.println(texto);


        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(3);
        numeros.add(3);
        numeros.add(5);
        numeros.add(29);

        for (int i = 0; i < numeros.size(); i++)
        {
            System.out.println(numeros.get(i));
        }
    }
}
