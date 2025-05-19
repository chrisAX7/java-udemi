package pakash;

import java.util.Scanner;

/*Programa que le pide al usuario las cordenadas de dos puntos en el eje sobre el plano para calcular
 *la distancia usando la fórmula de esta última.*/

public class EjercicioPropuesto03_FuncionesMath 
{

	public static void main(String[] args) 
	{
		//ENTRADA
		Scanner input = new Scanner(System.in);
		double x1, x2, y1, y2;
		System.out.println("Indique la coordenada de x1:");
		x1 = input.nextDouble();
		System.out.println("Indique la coordenada de y1:");
		y1 = input.nextDouble();
		System.out.println("Indique la coordenada de x2:");
		x2 = input.nextDouble();
		System.out.println("Indique la coordenada de y2:");
		y2 = input.nextDouble();
		
		
		//PROCESO
		double distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		
		//SALIDA
		System.out.println("La distancia entre ambos puntos es: " + distancia);
		
		//cierre
		input.close();

	}

}
