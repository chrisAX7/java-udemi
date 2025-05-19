package pakash;

import java.util.Scanner;

/*Programa que crea una función llamada "maximo", ests función pide dos enteros e imprime el mayor*/

public class EjercicioPropuesto01_Funciones
{
	
	//función maximo()
	public static void maximo(int x1, int x2) 
	{
		if (x1 > x2)
        { // si x1 es mayor, imprime x1
			System.out.println("El mayor de los dós números es: " + x1);
		}else if(x2 > x1)
        {// si x2 es mayor, imprime x2
			System.out.println("El mayor de los dós números es: " + x2);
		}else
        {//Si ambos son iguales
			System.out.println("Ambos números tienen el mismo valor");
		}
	}
	
	//programa main
	public static void main(String[] args) 
	{
		//ENTRADA
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("Ingrese dos números:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		maximo(num1, num2);
		
		//cierre
		input.close();

	}

}
