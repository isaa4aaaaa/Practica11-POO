package mx.unam.fi.poo.g1.p11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Clase Lectura
 * @author Campos Cortés Isaac Jareth
 * @version Noviembre 2024
 */
public class Lectura {
    /**
     * Método para realizar la lectura del archivo
     * @param direccion -> Parámetro para acceder al archivo
     * @return sb -> Retorna un StringBuilder con el contenido del archivo
     */
    public static StringBuilder realizarLectura(String direccion){
        StringBuilder sb = new StringBuilder();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(direccion));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + direccion);
        } catch (IOException e) {
            System.err.println("No es posible leer el archivo: " + direccion);
        }
        return sb;
    }
}

