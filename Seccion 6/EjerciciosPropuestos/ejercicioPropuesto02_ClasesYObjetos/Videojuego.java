package ejercicioPropuesto02_ClasesYObjetos;

public class Videojuego 
{
	/*----------ATRIBUTOS---------*/
	String titulo;
	String genero;
	double precio;

	/*----------METODOS---------*/
	void mostrarInformacion()
	{
		System.out.println("Titulo: " + titulo);
		System.out.println("Genero: " + genero);
		System.out.println("Precio: " + precio + "USD");
	}

}
