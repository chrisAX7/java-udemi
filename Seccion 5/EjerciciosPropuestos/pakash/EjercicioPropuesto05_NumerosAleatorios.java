package pakash;

import java.util.Random;
import java.util.Scanner;

/*Programa que le pide al usuario un número del 1 al 50 y el programa debe adivinar */

public class EjercicioPropuesto05_NumerosAleatorios 
{

	public static void main(String[] args) 
	{
		//ENTRADA
		Scanner input = new Scanner(System.in);
		Random generador = new Random();
		int numero = 1 + generador.nextInt(50);
		int intento = 1;
		int respuesta;
		int minimo = 1;
		int maximo = 50;
		
		System.out.println("Pensá en un número del 1 al 50:");
		System.out.println("Voy a tratar de adivinarlo, presiona \"enter\" para seguir... ");
		input.nextLine();
		
		//PROCESO
		do
		{
			System.out.println("El número es: " + numero);
			System.out.println("Este es el intento " + intento);
			System.out.println("¿Acerté?");
			System.out.println("1. Sí");
			System.out.println("2. Me pasé");
			System.out.println("3. Me quedé corto");
			respuesta = input.nextInt();
			if (respuesta == 2) {
				maximo = numero - 1;
			} else if(respuesta == 3){
				minimo = numero + 1; 
			}
			int rango = maximo - minimo + 1;
			numero = minimo + generador.nextInt(rango);
			intento++;
			System.out.println("******************************");
		}while (respuesta != 1);
		
		//SALIDA
		System.out.println("Al fin lo adiviné, tuve " + (intento-1) + " intentos");
		input.close();

	}

}
