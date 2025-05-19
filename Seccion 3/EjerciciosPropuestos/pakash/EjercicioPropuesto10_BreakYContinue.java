package pakash;
import java.util.Scanner;

public class EjercicioPropuesto10_BreakYContinue {

/*Programa que le pide al usuario números enteros, si ingresa un número negativo se detiene el 
 *programa, una vez finalizado, se contarán los números mayores a cero*/
	
	public static void main(String[] args) {
		
		//Declarando variables
		int num = 0, contar = 0;
		Scanner input = new Scanner(System.in);
		
		//Pidiendo datos al usuario
		System.out.println("Ingrese un número entero positivo:");
		
		//Estructura while
		while(true) {
			num = input.nextInt();
			//Detener la ejecución con un número menor a cero(negativo)
			if (num < 0) {
				break;
			}
			//Contar los números positivos distintos de cero
			if (num > 0) {
				contar++;
			}
		}
		
		//Salida del ciclo
		System.out.println("Se han ingresado: " + contar + " número/s");
	}

}
