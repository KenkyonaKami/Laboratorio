package Laboratorio;

import java.io.*;
import java.nio.file.*;

public class DB{

    static File file;

    public static void createArchive(String name){
        Path path = Paths.get(name);
        file = path.toFile();

        try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file)))){

        }catch(IOException e){
            System.out.print(e);
        }
    }

    public static void writeArchive(ListMedicamentos lm){
        try(PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file , true)))){
            for(Medicamento m : lm.getMedicamentos()){
                write.println(m.toString());
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public static void readArchive(){
        try(BufferedReader read = new BufferedReader(new FileReader(file))){
            String line = read.readLine();
            while(line != null){
                System.out.println(line);
                line = read.readLine();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}