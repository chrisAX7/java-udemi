package pakash;

import java.util.Scanner;

/*Programa que le pide al usuario que escriba un més y el programa le indica cuántos días tiene 
 *ese mes*/
public class EjercicioPropuesto05_TipoEnumerado {

enum MESES {ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, 
	NOVIEMBRE, DICIEMBRE}

	public static void main(String[] args) {
	
	//CANTIDAD DE DIAS EN UN MES Y DECLARACION DEL SCANNER
	int[] diaMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int numeroMes;
	Scanner input = new Scanner(System.in);
	
	//ENTRADA DE DATOS
	System.out.println("Escribe un mes: (ENERO - DICIEMBRE)");
	MESES mes = MESES.valueOf(input.nextLine());
	
	//SALIDA DE DATOS	
	System.out.println("*************************************");
	System.out.println("Usted ha escrito: " + mes);
	System.out.println(mes + " tiene " + diaMeses[mes.ordinal()] + " días");
	System.out.println("*************************************");
	System.out.println("*************************************");
	
	
	//ENTRADA DE DATOS SOLICITANDO UN NÚMERO
	System.out.println("Escribe el número del mes: (1 - 12)");
	numeroMes = input.nextInt();
	
	//SALIDA DE DATOS SOLICITANDO UN NÚMERO
	System.out.println("Usted ha escrito: " + MESES.values()[numeroMes-1]);
	System.out.println(MESES.values()[numeroMes-1] + " tiene " + diaMeses[numeroMes-1] + " días");
	
	//CIERRE
	input.close();

	}

}
