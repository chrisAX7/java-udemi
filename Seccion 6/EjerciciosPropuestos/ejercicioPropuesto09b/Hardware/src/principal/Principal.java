package principal;

import clases.Ordenador;
import clases.Teclado;

public class Principal
{
    public static void main(String[] args)
    {
        Teclado keyboard = new Teclado("Redragon", "eng", 108);
        Ordenador ordenador = new Ordenador("Asus", "AMD Ryzen 7", 32);
        ordenador.setTeclado(keyboard);
        ordenador.mostrarInformacion();


    }
}
