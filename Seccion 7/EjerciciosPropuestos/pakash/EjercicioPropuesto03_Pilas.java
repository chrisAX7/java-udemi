package pakash;

import java.util.Scanner;
import java.util.Stack;

public class EjercicioPropuesto03_Pilas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Stack<String> pila = new Stack<>();

        System.out.print("Dime la primer línea: ");
        String linea = input.nextLine();

        while (!linea.isEmpty())
        {
            pila.push(linea);
            System.out.print("Dime la siguiente línea: ");
            linea = input.nextLine();
        }

        while (!pila.empty())
        {
            System.out.println(pila.pop());
        }
    }
}