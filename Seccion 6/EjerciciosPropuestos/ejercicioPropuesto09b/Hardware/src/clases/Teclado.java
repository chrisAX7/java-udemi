package clases;

public class Teclado
{
    private String marca;
    private String idioma;
    private int numTeclas;

    public Teclado (String marca, String idioma, int numTeclas)
    {
        this.marca = marca;
        this.idioma = idioma;
        this. numTeclas = numTeclas;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getIdioma()
    {
        return idioma;
    }

    public void setIdioma(String idioma)
    {
        this.idioma = idioma;
    }

    public int getNumTeclas()
    {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas)
    {
        this.numTeclas = numTeclas;
    }
}
