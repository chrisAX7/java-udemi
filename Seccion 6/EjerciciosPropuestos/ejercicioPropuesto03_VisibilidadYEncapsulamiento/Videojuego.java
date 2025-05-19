package ejercicioPropuesto03_VisibilidadYEncapsulamiento;

public class Videojuego implements Comparable<Videojuego>
{
	/*----------ATRIBUTOS---------*/
	protected String titulo;
	protected String genero;
	protected double precio;
	final double MAX_PRECIO = 100;
    protected Empresa empresa;

	/*----------CONSTRUCTOR/ES---------*/
	public Videojuego(String titulo, String genero, int precio, String space) throws IncorrectVideoGameException
	{
		if (titulo.equals(""))
			throw new IncorrectVideoGameException("No se indicó el título del videojuego");
		this.titulo = titulo;
		this.genero = genero;
		if(precio < 0)
			throw new IncorrectVideoGameException("El precio no puede ser negativo");
		setPrecio(precio);
	}
	public Videojuego(String titulo, String genero, double precio, Empresa empresa) throws IncorrectVideoGameException
	{
        if (titulo.equals(""))
            throw new IncorrectVideoGameException("No se indicó el título del videojuego");
		this.titulo = titulo;
		this.genero = genero;
        if(precio < 0)
            throw new IncorrectVideoGameException("El precio no puede ser negativo");
		setPrecio(precio);
        this.empresa = empresa;
	}
    public Videojuego(String titulo, String genero, double precio)throws IncorrectVideoGameException
	{
        if (titulo.equals(""))
            throw new IncorrectVideoGameException("No se indicó el título del videojuego");
		this.titulo = titulo;
        if(precio < 0)
            throw new IncorrectVideoGameException("El precio no puede ser negativo");
		this.genero = genero;
		this.precio = precio;
	}

    public Videojuego()
	{
    }


    /*----------METODOS---------*/
	public void mostrarInformacion()
	{
		System.out.println("Titulo: " + titulo);
		System.out.println("Genero: " + genero);
		System.out.println("Precio: " + precio + "USD");
        System.out.println("Empresa: " + empresa.getNombre());
	}

	/*----------GETTERS Y SETTERS---------*/
	public void setTitulo(String titulo)throws IncorrectVideoGameException
	{
        if (titulo.equals(""))
            throw new IncorrectVideoGameException("No se indicó el título del videojuego");
		this.titulo = titulo;
	}
	public void setGenero(String genero) throws IncorrectVideoGameException
	{
        if (genero.equals(""))
            throw new IncorrectVideoGameException("No se indicó el género del videojuego");
		this.genero = genero;
	}
	
	public void setPrecio(double precio) throws IncorrectVideoGameException
	{
        if (precio < 0)
			this.precio = 0;
		else if (precio > MAX_PRECIO)
			this.precio = MAX_PRECIO;
		else
			this.precio = precio;
	}
	
	public String getTitulo()
	{
		return titulo;
	}
	
	public String getGenero()
	{
		return genero;
	}
	
	public double getPrecio()
	{
		if (precio > 0)
		{
			return precio;
		}
		else
		{
			return 0;
		}
	}

    public Empresa getEmpresa()
    {
        return empresa;
    }

    public void setEmpresa(Empresa empresa)
    {
        this.empresa = empresa;
    }

	@Override
	public String toString() {
		return "Titulo: " + titulo + "\n" +
				"Género: " + genero + "\n" +
				"Precio: " + precio + "\n" +
				"Empresa: " + empresa;
	}

	@Override
	public boolean equals(Object obj)
	{
		Videojuego videojuego = (Videojuego) obj;
		if(this.titulo.equals(videojuego.titulo))
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	public static int comparar(Videojuego j1, Videojuego j2)
	{
		if (j1.getPrecio() > j2.getPrecio())
			return -1;
		else if(j1.getPrecio() < j2.getPrecio())
			return 1;
		else
			return 0;
	}

	@Override
	public int compareTo(Videojuego o) {
		return this.getTitulo().compareTo(o.getTitulo());
	}
}
