package ejemplo02_ClasesYObjetos;

public class Diccionario extends Libro
{
    private String idioma;

    public Diccionario(String titulo,String editorial, int numPaginas, String idioma)
    {
        super(titulo, editorial, numPaginas);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String buscarDefinicion(String palabra)
    {
        return "Buscando " + palabra;
    }
}
