package pakash;

import java.util.Scanner;

/*Programa que le pide al usuario una serie de nombres separados por comas, para luego ordenarlos
 *alfabéticamente de forma ascendente*/

public class EjercicioPropuesto10_ComparacionDeTextos {

	public static void main(String[] args) {

		//ENTRADA
		Scanner input = new Scanner(System.in);
		String nombres;
		System.out.println("Ingrese nombres separados por comas:");
		nombres = input.nextLine();
		String listaNombres[] = nombres.split(",");
		System.out.println("*************************************");
		
		
		//PROCESO
		for (int i = 0; i < listaNombres.length - 1; i++)
		{
			for (int j = i+1; j < listaNombres.length; j++)
			{
				if(listaNombres[i].compareToIgnoreCase(listaNombres[j]) > 0)
				{
					String auxiliar = listaNombres[i];
					listaNombres[i] = listaNombres[j];
					listaNombres[j] = auxiliar;
				}
			}
			
		}
		
		
		//SALIDA
		for (int i = 0; i < listaNombres.length; i++) 
		{
			System.out.println(listaNombres[i]);
		}
		
		//cierre
		input.close();
	}

}
