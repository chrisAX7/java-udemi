package clases;

public class Ordenador
{
    private String marca;
    private String procesador;
    private int memoriaRam;
    private Teclado teclado;

    public Ordenador(String marca, String procesador, int memoriaRam)
    {
        this.marca = marca;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getProcesador()
    {
        return procesador;
    }

    public void setProcesador(String procesador)
    {
        this.procesador = procesador;
    }

    public int getMemoriaRam()
    {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam)
    {
        this.memoriaRam = memoriaRam;
    }

    public Teclado getTeclado()
    {
        return teclado;
    }

    public void setTeclado(Teclado teclado)
    {
        this.teclado = teclado;
    }

    public void mostrarInformacion()
    {
        System.out.println(marca);
        System.out.println(procesador);
        System.out.println(memoriaRam);
        if (teclado!= null){
            System.out.println(teclado.getMarca());
            System.out.println(teclado.getIdioma());
            System.out.println(teclado.getNumTeclas());
        }
        else{
            System.out.println("No hay teclado");
        }
    }
}
