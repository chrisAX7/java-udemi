/* 
 * Programa que practica el uso de la instrucción System.out.printf para dar formato a la 
 * información que se muestra por pantalla. */
package pakash;

public class Ejemplo11_InstruccionPrintf {
	
	public static void main(String[] args) {
		System.out.print("Hola" + "buenas\n");
		System.out.printf("Hola" + "buenas\n");
		
		int numero = 3;
		String texto = "Hola";
		
		System.out.printf("El numero es %d y el texto es %s\n", numero, texto);
		
		int n1 = 231, n2 = 123122;
		float f1 = 113.14159f, f2 = 3.4f;
		
		System.out.printf("%06d\n%06d\n", n1, n2);
		System.out.printf("%05.2f\n%06.2f", f1, f2);
		
	}
}
