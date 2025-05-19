package ejemplo02_ClasesYObjetos;

public class Libro 
{
	
	protected String titulo;
	protected String editorial;
	protected int numPaginas;

	public Libro(String titulo, String editorial, int numPaginas)
	{
		this.titulo = titulo;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}

	public Libro() {

	}

	public void mostrarInformacion()
	{
		System.out.println("T�tulo: " + titulo);
		System.out.println("Editorial: " + editorial);
		System.out.println("P�ginas: " + numPaginas);
	}
	
	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String nuevoTitulo)
	{
	    titulo = nuevoTitulo;
	}

	public String getEditorial()
	{
	    return editorial;
	}

	public void setEditorial(String nuevaEditorial)
	{
	    editorial = nuevaEditorial;
	}

	public int getNumPaginas()
	{
	    return numPaginas;
	}

	public void setNumPaginas(int np)
	{
		if (np > 0)
			numPaginas = np;
		else
			numPaginas = 1;
	}
}


