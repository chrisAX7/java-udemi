package pakash;
/*Este programa se utiliza para poner en práctica la función printf utilizando las marcas de 
 * formato para imprimir un número real con dos decimales*/

public class EjercicioPropuesto11_Printf {
	
	//PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		
		//DECLARACIÓN DE VARIABLES
		float pi =3.1416f, radio = 7f, circunferencia = 2 * pi * radio;
		
		//IMPRIMIR RESULTADO
		System.out.printf("%05.2f", circunferencia);

	}

}
