package pakash;

/*Programa que crea las funciones recursivas contarDigitos() y palindromo() para despúes ponerlas
 *a prueba en el main*/

public class EjercicioPropuesto06_Recursividad {

	//función para contar dígitos
	public static int contarDigitos(int n)
	{
		//Caso base
		if(n < 0)
			n*= -1;
		
		if (n <10) {
			return 1;
		}
		//Caso recursivo
		else 
		{
			return 1 + contarDigitos(n / 10);
		}
	}
	
	//funcion para verificar si un String es palindromo
	public static boolean palindromo(String c)
	{
		c = c.toUpperCase();
		c = c.replace(".", "");
		c = c.replace(" ", "");
		//Caso base
		if (c.length() <= 1) 
			return true;
			//Caso recursivo
			char primeraLetra = c.charAt(0);
			char ultimaLetra = c.charAt(c.length() - 1);
			return primeraLetra == ultimaLetra && palindromo(c.substring(1, c.length() - 1));
		
		
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("2022 tiene " + contarDigitos(2022) + " digitos");
		
		if (palindromo("asdd5sa")) {
			System.out.println("Palindromo");
		} else {
			System.out.println("No palindromo");

		}

	}

}
