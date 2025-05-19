package pakash;

/* Programa que practica el uso de los operadores de autoincremento (++) y autodecremento (--)
 */
 
public class Ejemplo14_OperadoresDeAutoIncrementoYAutoDecremento {
	
	public static void main(String[] args) {
		int n = 3;
		n++;
		--n;
		System.out.println(n);
		
		int i = 3, j = 2, k = 1;
		i = j++ * k;
		System.out.println(i);
	}
}
