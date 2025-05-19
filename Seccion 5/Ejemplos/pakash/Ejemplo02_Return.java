package pakash;

/*
 * Programa que muestra c�mo devolver resultados desde funciones
 * usando "return"
 */ 
 
import java.util.Scanner;

public class Ejemplo02_Return
{
	public static int sumarNumeros(int n1, int n2)
	{
		return n1 + n2;
	}
	
	public static void sumarNumeros2(int n1, int n2)
	{
		System.out.println("El resultado es " + (n1 + n2));
	}
	
	public static void main(String[] args)
	{		
		Scanner sc = new Scanner(System.in);
		int numUsuario1, numUsuario2;
		
		int suma = sumarNumeros(2, 3) + sumarNumeros(10, 20);
		System.out.println(suma);
		
		sumarNumeros2(2, 3);
		sumarNumeros2(10, 20);
		
		System.out.println("Introduce dos n�meros:");
		numUsuario1 = sc.nextInt();
		numUsuario2 = sc.nextInt();
		System.out.println(sumarNumeros(numUsuario1, numUsuario2));
	}
}
