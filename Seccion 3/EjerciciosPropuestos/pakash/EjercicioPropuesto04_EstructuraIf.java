package pakash;

import java.util.Scanner;

/*Este programa pide tres numeros al usuario e indica si son positivos todos, algunos positivos y
 * otros negativos o todos negativos*/

public class EjercicioPropuesto04_EstructuraIf {

	public static void main(String[] args) {
		
		//Declarando las variables
		int num1, num2, num3;
		Scanner input = new Scanner(System.in);
		
		//Pidiendo datos al usuario
		System.out.println("Coloque tres números:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		//Estructura if
		if (num1>0 && num2>0 && num3>0) {//Condición para que sean todos positivos
			System.out.println("Todos los números son positivos");
		}else if (num1>0 || num2>0 || num3>0) {//Condición para que algunos sean positivos
			System.out.println("Algunos números son positivos");
		}else {//Si ninguna de las anteriores condiciones se cumple todos son negativos
			System.out.println("Todos los números son negativos");
		}
		
		//Cierre
		input.close();

	}

}
