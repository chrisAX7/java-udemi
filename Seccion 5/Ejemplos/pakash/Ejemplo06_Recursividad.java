/*
 * Programa que muestra c�mo definir funciones recursivas
 */
package pakash;

public class Ejemplo06_Recursividad
{
    public static int factorial(int n)
    {
        // Caso base
        if (n <= 1)
        {
            return 1;
        }
        // Caso recursivo
        else
        {
            return n * factorial(n - 1);
        }
    }  

    public static int fibonacci(int n)
    {
        if (n == 0)
        {
            // Caso base 1: Fibonacci(0) = 0
            return 0;
        }
        else if (n == 1)
        {
            // Caso base 2: Fibonacci(1) = 1
            return 1;
        }
        else
        {
            // Caso recursivo
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static String invertir(String texto)
    {
        if (texto.length() <= 1)
            return texto;
        else
            return invertir(texto.substring(1)) + texto.charAt(0);
    }
    
    public static void main(String[] args)
    {
        System.out.println(factorial(5));        
        System.out.println(factorial(8));        
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println(fibonacci(i));
        }    
        
        System.out.println(invertir("Hola"));
    }	
}

