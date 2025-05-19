package pakash;

/*Programa que sirve para poner en práctica los operadores lógicos mediante un ejercicio*/

public class EjercicioPropuesto03_OperadoresLogicos {

	public static void main(String[] args) {
		
		int a=3, b=5, c=8;
		
		boolean e1 = a<2 && b>=5 || c==8;  // false && true || true = true
		boolean e2 = a<2 && (b>=5 || c==8);  // false && (true || true) = true
		boolean e3 = !(a<2) && (b>=5 || c==8); // true && (true || true) = false
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
