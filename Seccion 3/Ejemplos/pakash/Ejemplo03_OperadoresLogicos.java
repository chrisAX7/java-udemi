package pakash;

/*
 * Programa que muestra cómo utilizar 
 * los operadores lógicos
 */


public class Ejemplo03_OperadoresLogicos {
	
	public static void main(String[] args) {
		int n = 10, m = 5;
		
		boolean c1 = n < 5 && m > 10;
		boolean c2 = n > 5 || m > 10;
		boolean c3 = n > 5;
		boolean c4 = !c3;
		boolean c5 = (n > 5 || m <= 3) && m == 1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}
