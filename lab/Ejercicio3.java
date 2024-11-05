import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try{
            String filename = "C:\\Users\\isaac\\OneDrive\\Desktop\\esuelita\\3er semestre\\POO\\practica11\\lab\\miarchivo.txt";
            FileWriter fw = new FileWriter(filename,false);
            fw.write("Me la estoy pasando bien raro...\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\isaac\\OneDrive\\Desktop\\esuelita\\3er semestre\\POO\\practica11\\lab\\miarchivo.txt"));
            while(strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        }catch (IOException e){
            System.err.println("IOException...");
        }
    }
}