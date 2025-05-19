package pakash;

public class Ejemplo07_ProblemaDeDesbordamiento {
	
	public static void main(String[] args) {
		int n1 = 2100000000;
		int n2 = 100000000;
		int n3 = n1 + n2;
		System.out.println(n3);	//no hace la suma correctamente porque el tipo de dato int no admite 
								//un numero muy largo, una vez sobrepasado el límite, vuelve a contar 
		long l1 = 1500000000;	//desde el límite inferior, es decir, el menor número posible
		long l2 = 1500000000;
		long l3 = l1 + l2;
		System.out.println(l3); 
		
	}
}
