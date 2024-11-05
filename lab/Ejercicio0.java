import java.io.BufferedReader;
import  java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio0{
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\isaac\\OneDrive\\Desktop\\esuelita\\3er semestre\\POO\\practica11\\lab\\test.txt"));
            while (strLine != null){
                System.out.println(strLine);
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado");
        }catch (IOException e){
            System.err.println("Error al leer el archivo");
        }
    }
}

