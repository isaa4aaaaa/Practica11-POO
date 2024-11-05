package mx.unam.fi.poo.g1.p11;

/**
 * Clase principal
 * @author Campos Cortés Isaac Jareth
 * @version Noviembre 2024
 */
public class Practica11 {
    /**
     * Función principal en la que se ejecuta toda la funcionalidad del programa
     * @param args -> Arreglo por defecto de la función main
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] archivos = {
            "C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/doc1",
            "C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/doc2",
            "C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/doc3"
        };
        for (String archivo : archivos) {
            sb.append(Lectura.realizarLectura(archivo));
        }
        Escritura.realizarEscritura(sb);
    }
}

