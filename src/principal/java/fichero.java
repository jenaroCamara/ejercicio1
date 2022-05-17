package principal.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class fichero {
    public ArrayList<Persona> muestraContenido(String archivo) throws FileNotFoundException, IOException {
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        String[] arrOfStr;
        String cadena;
        FileReader f = new FileReader(archivo);

        try {
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                arrOfStr = cadena.split(":");
                if (arrOfStr.length == 3) {
                    if (Integer.parseInt(arrOfStr[2]) < 25) {
                        Persona p = new Persona(arrOfStr[0], arrOfStr[1], Integer.parseInt(arrOfStr[2]));
                        listaPersonas.add(p);
                    }
                }

            }
            b.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        muestraPersona(listaPersonas);
        return listaPersonas;
    }

    public void muestraPersona(ArrayList<Persona> lista) {
        System.out.println("---------Usuarios < 25---------");
        for (int iterator = 0; iterator < lista.size(); iterator++) {
            System.out.println("Nombre: " + lista.get(iterator).nombre + ". Poblacion: " + lista.get(iterator).poblacion + ". Edad: " + lista.get(iterator).edad);
        }
    }
}