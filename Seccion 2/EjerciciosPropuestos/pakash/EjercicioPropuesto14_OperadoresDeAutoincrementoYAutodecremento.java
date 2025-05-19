package pakash;

public class EjercicioPropuesto14_OperadoresDeAutoincrementoYAutodecremento {

	public static void main(String[] args) {
		int n=1, a=3, b=4;
		a = b + n++; // 4 + 1 = 5
		n *= 3; // 2 * 3 = 6
		n = n + a + b * a;// n = 6 + 5 + 4 * 5 = 31
		System.out.println(n);
		
		int l=5, m=5, p=2;
		m = m / p;   //5 / 2 = 2
		m += ++l;    //2 + 6 = 8
		l *= p + m;  //6 * (2+8) = 60
		System.out.println(l);

	}

}
