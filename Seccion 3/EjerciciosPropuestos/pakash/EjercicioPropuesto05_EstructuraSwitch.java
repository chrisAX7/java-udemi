package pakash;

import java.util.Scanner;

/*Este programa solicita al usuario que indique un mes del año para decirle cuantos dias tiene 
 * dicho mes*/

public class EjercicioPropuesto05_EstructuraSwitch {

	public static void main(String[] args) {
		
		//Inicializando variables
		Scanner input = new Scanner(System.in);
		String mes;
		
		//Solicitando datos al usuario
		System.out.println("Indique un mes del año escrito en mayúsculas:");
		mes=input.nextLine();
		
		//Estructura
		switch(mes) {
		case "ENERO":
		case "MARZO":
		case "MAYO":
		case "JULIO":
		case "AGOSTO":
		case "OCTUBRE":
		case "DICIEMBRE":
			System.out.println("El mes " + mes + " tiene 31 días");
			break;
		case "ABRIL":
		case "JUNIO":
		case "SEPTIEMBRE":
		case "NOVIEMBRE":
			System.out.println("El mes " + mes + " tiene 30 días");
			break;
		case "FEBRERO":
			System.out.println("El mes " + mes + " tiene 28 días");
			break;
		default:
			System.out.println("Dato inválido");
			
		}
		
		//Estructura if/else
		System.out.println("****************************");
		System.out.println("Lo mismo pero usando if:");
		System.out.println("Indique un mes del año escrito en mayúsculas:");
		mes=input.nextLine();
		
		//Cuando se trada de cadenas de texto es mejor usar "mes.equals" en vez de "=="
		if(mes.equals("ENERO") || mes.equals("MARZO") || mes.equals("MAYO") || mes.equals("JULIO") || mes.equals("AGOSTO") || mes.equals("OCTUBRE") || mes.equals("DICIEMBRE")) {
			System.out.println("El mes " + mes + " tiene 31 días");
		} else if(mes.equals("ABRIL")|| mes.equals("JUNIO") || mes.equals("SEPTIEMBRE") || mes.equals("NOVIEMBRE")) {
			System.out.println("El mes " + mes + " tiene 30 días");
		} else if(mes.equals("FEBRERO")) {
			System.out.println("El mes " + mes + " tiene 28 días");
		} else {
			System.out.println("Dato inválido");
		}
		
		//Cierre
		input.close();
	}

}
