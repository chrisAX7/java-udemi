package pakash;

/* 
 * Programa que practica la conversi�n entre tipos de
 * datos simples (num�ricos, textos, etc)
 */
 
public class Ejemplo13_ConversionesEntreDatosSimples {
	
	//Programa principal
	public static void main(String[] args) {
		int numero = 3;
		float numero2 = 3.94159f;
		int numero3 = (int)numero2; //De real a entero
		float numero4 = (float)numero; //De entero a real
		System.out.println(numero3);
		System.out.println(numero4);
		
		//Typecast
		byte b1 = 3, b2 = 6;
		byte b3 = (byte)(b1 + b2);//El programa espera por defecto un resultado del tipo int por lo
		System.out.println(b3);	  //tanto hay que aclarar a que tipo se quiere transfotmar
		
		//Conversion de texto
		int nota1, nota2;
		System.out.println("Escribe una nota:");
		nota1 = Integer.parseInt(System.console().readLine());
		System.out.println("Escribe otra nota:");
		nota2 = Integer.parseInt(System.console().readLine());
		int suma = nota1 + nota2;
		float promedio = (float)suma / 2; //Forzando el resultado a un numero real
		System.out.println("El promedio es " + promedio);
	}
}
