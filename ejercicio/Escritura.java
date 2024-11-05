package mx.unam.fi.poo.g1.p11;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Clase Escritura
 * @author Campos Cortés Isaac Jareth
 * @version Noviembre 2024
 */
public class Escritura {

    /**
     * Método para realizar la escritura del archivo final
     * @param sb -> El StringBuilder final con el contenido de todos los archivos que se va a escribir en el archivo final.
     */
    public static void realizarEscritura(StringBuilder sb){
        String filename = "C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/res";
        try (FileWriter fw = new FileWriter(filename, false)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            System.err.println("No es posible escribir en el archivo de salida...");
        }
    }
}
