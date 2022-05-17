import principal.java.fichero;

import java.util.ArrayList;
import java.io.IOException;

import principal.java.*;

public class main {
    public static void main(String[] args) throws IOException {
        fichero f = new fichero();
        ArrayList<Persona> listaPersonas = f.muestraContenido("personas.txt");
    }
}
