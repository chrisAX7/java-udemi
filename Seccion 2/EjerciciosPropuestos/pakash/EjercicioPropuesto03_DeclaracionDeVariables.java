package pakash;

import java.util.Scanner;

public class EjercicioPropuesto03_DeclaracionDeVariables {

	public static void main(String[] args) {
		//DECLARACION E INICIALIZACION
		int nacimiento, actual = 2024, edad;
		Scanner input = new Scanner(System.in);
		
		//OPERACION PARA OBTENER LA EDAD
		System.out.println("El año actual es 2024");
		System.out.println("Indique su año de nacimiento: ");
		nacimiento = input.nextInt();
	    edad = actual - nacimiento;
	    System.out.println("Han pasado " + edad + " años");
	    
	    //CIERRE
	    input.close();
	}

}
