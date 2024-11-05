
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Practica11{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/doc1"));
            while(strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br1.readLine();
                System.out.println(strLine);
            }
            br1.close();

            BufferedReader br2 = new BufferedReader(new FileReader("C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/doc2"));
            while(strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br2.readLine();
                System.out.println(strLine);
            }
            br2.close();

            BufferedReader br3 = new BufferedReader(new FileReader("C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/doc3"));
            while(strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br3.readLine();
                System.out.println(strLine);
            }
            br3.close();

            String filename = "C:/Users/isaac/OneDrive/Desktop/esuelita/3er semestre/POO/practica11/ejercicio/res";
            FileWriter fw = new FileWriter(filename,false);
            fw.write(sb);
            fw.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e){
            System.err.println("No es posible leer el archivo...");
        }
    }
}