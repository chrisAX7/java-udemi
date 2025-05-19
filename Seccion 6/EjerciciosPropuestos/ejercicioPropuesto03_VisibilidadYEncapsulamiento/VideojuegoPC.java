package ejercicioPropuesto03_VisibilidadYEncapsulamiento;

public class VideojuegoPC extends Videojuego
{
    private int espacioMinimoMB;
    private int memoriaRamMinimaMB;

    public VideojuegoPC(String titulo, String genero, double precio, Empresa empresa, int espacioMinimoMB,
                        int memoriaRamMinimaMB) throws IncorrectVideoGameException
    {
        super(titulo, genero, precio, empresa);
        this.espacioMinimoMB = espacioMinimoMB;
        this.memoriaRamMinimaMB = memoriaRamMinimaMB;
    }

    public int getEspacioMinimoMB() {
        return espacioMinimoMB;
    }

    public void setEspacioMinimoMB(int espacioMinimoMB) {
        this.espacioMinimoMB = espacioMinimoMB;
    }

    public int getMemoriaRamMinimaMB() {
        return memoriaRamMinimaMB;
    }

    public void setMemoriaRamMinimaMB(int memoriaRamMinimaMB) {
        this.memoriaRamMinimaMB = memoriaRamMinimaMB;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Espacio mínimo requerido: " + espacioMinimoMB + "MB" + "\n" +
                "Memoria ram requerida: " + memoriaRamMinimaMB + "MB" ;
    }
}
