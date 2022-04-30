package Challenge;
import java.io.*;
import java.util.Locale;

public class Copier {
    public static void main(String[] args)throws Exception {
        FileWriter fw2, fw=new FileWriter("source.txt");
        String Str="THIS is A DATA writting In source file in upper case";
        fw.write(Str);
        fw.close();

        FileInputStream fr=new FileInputStream("source.txt");

        byte[] b1 = new byte[fr.available()];
        fr.read(b1);
        String s1=new String(b1);
        fw2=new FileWriter("destination.txt");
        fw2.write(s1.toUpperCase(Locale.ROOT));
        fw2.close();
        fr.close();




    }




}
